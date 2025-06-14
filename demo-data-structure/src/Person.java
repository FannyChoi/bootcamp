import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static class SortedbyAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return p1.getAge() > p2.getAge() ? -1 : 1;
    }
    
  }

  @Override
  public String toString() {
    return "Person(" + "name=" + this.name + ",age=" + this.age + ")";
  }

  public static void main(String[] args) {
    // sorted by age, descending order
    // and then sorted by name, ascending order
    List<Person> persons = new ArrayList<>(
        Arrays.asList(new Person("John", 3), new Person("Alex", 3),
            new Person("Steven", 1), new Person("Peter", 10)));
    Collections.sort(persons, new Person.SortedbyAge());
    System.out.println(persons);
  }
}
