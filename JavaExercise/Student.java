package JavaExercise;

import java.util.Objects;

public class Student {
  private int id;
  private String name;

  // Constructor

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // getter, setter, etc.
  public String getName() {
    return this.name;
  }

  public int getID() {
    return this.id;
  }
//toString
  @Override
  public String toString() {
    return "Student(" + "ID= " + this.id + ",Name= " + this.name + ")";
  }
// equals
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (!(obj instanceof Student))
    return false;
    Student student = (Student) obj;
    return this.id == student.getID() && this.name.equals(student.getName());
  }
// hashCode
public int hashCode() {
  return Objects.hash(this.id, this.name);
}
}
