// ! One to One: One person has one height and weight

// ! One to Many

import java.util.Arrays;

public class Classroom {
  private String[] names;
  private String tutor;

  public String[] getNames(){
    return this.names;
  }
  public void setNames(String[] names){
    this.names = names;
  }

  public void setTutor(String tutor){
    this.tutor = tutor;
  }
  public static void main(String[] args) {
    Classroom c1 = new Classroom();
    // John Mary
    String[] students = new String[2];
    students[0] =  "John";
    students[1] = "Mary";
    c1.setNames(students);// c1.setNames(student[0]); -> error 
    System.out.println(c1.getNames()[0]);

    //Update the second student name -> Steven
    //c1.getNames()[1] = "Steven";

    //for loop, print all student name
    for ( int i= 0; i < c1.getNames().length; i++){
      System.out.println(c1.getNames()[i]);
    }
    // Find Mary and replace by Steven.
    for (int i = 0; i < c1.getNames().length; i++){
      if (c1.getNames()[i].equals("Mary")){
        c1.getNames()[1] = "Steven";
        break;
      }
    }
    System.out.println(Arrays.toString(c1.getNames()));
  }
}
