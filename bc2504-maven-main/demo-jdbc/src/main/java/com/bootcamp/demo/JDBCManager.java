package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCManager {
  private Connection connection;
  private Statement statement;

  public boolean isConnected() {
    return this.connection != null && this.statement != null;
  }

  public void login(String databaseName, String userId, String password)
      throws SQLException {
    if (isConnected())
      return;
    String dbUrl = "jdbc:postgresql://localhost:5432/" + databaseName;
    this.connection = DriverManager.getConnection(dbUrl, userId, password);
    this.statement = connection.createStatement();
  }

  public List<Person> getData() {
    if (!isConnected())
      throw new RuntimeException("Database is not conneceted.");
    return null; // Todo
  }

  public static void main(String[] args) {
    JDBCManager jm = new JDBCManager();
    try {
      jm.login("bootcamp_2504", "postgres", "admin1234"); // Connection/ Statement?
    } catch (SQLException e) {
      e.printStackTrace(); // SQL error message
    }
    jm.getData();
  }
}
