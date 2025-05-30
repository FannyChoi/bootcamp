package JavaExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    ArrayList<Integer> al1 = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    al1.add(10);
    al1.add(20);
    al1.add(30);
    al1.add(40);
    al1.add(50);
    // 1c. Print all the elements in the list.
    System.out.println(al1);
    // 1d. Remove the number 30 from the list.
    System.out.println(al1.remove(Integer.valueOf(30)));
    // 1e. Print the size of the list.
    System.out.println(al1.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    ArrayList<String> al2 =
        new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));
    // 2b. Check if "Grapes" exists in the list.
    System.out.println(al2.contains("Grapes"));
    // 2c. If it doesn’t exist, add it to the list.
    al2.add("Grapes");
    // 2d. Update "Mango" to "Peach".
    al2.set(2, "Peach");
    // 2e. Print the final list.
    System.out.println(al2);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    ArrayList<Integer> al3 =
        new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 20, 50));
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> hs3 = new HashSet<>();
    for (Integer num : al3) {
      hs3.add(num);
    }
    // 3c. Print the list after removing duplicates.
    System.out.println(hs3);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> countryNames =
        new HashSet<>(Arrays.asList("USA", "India", "China", "Japan"));
    // 4b. Add "Canada" to the set.
    countryNames.add("Canada");
    // 4c. Add "India" again. Print the result.
    System.out.println(countryNames.add("India"));
    // 4d. Print all elements in the set.
    System.out.println(countryNames);


    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> hsNum =
        new HashSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
    // 5b. Check if the set contains the number 3.3
    System.out.println(hsNum.contains(3.3));
    // 5c. Remove the number 2.2 from the set.
    hsNum.remove(2.2);
    // 5d. Print the size of the set.
    System.out.println(hsNum);

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    HashSet<Integer> hSet1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
    // 6c. Set 2: 30, 40, 50, 60
    HashSet<Integer> hSet2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));
    // 6d. Find the common numbers of the two sets.
    HashSet<Integer> temp = new HashSet<>();
    for (Integer num : hSet1) {
      if (!hSet2.add(num)) {
        temp.add(num);
      }
      // 6e. Print the resulting set.
    }
    System.out.println(temp);


    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    HashSet<String> hSetName = new HashSet<>(
        Arrays.asList("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
    // 7b. Convert the HashSet to an ArrayList.
    ArrayList<String> alNames = new ArrayList<>();
    for (String name : hSetName) {
      alNames.add(name);
    }
    // 7c. Print the converted list.
    System.out.println(alNames);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    ArrayList<Student> alStudents =
        new ArrayList<>(Arrays.asList(new Student(1, "Alice"), //
            new Student(2, "Bob"), new Student(3, "Charlie")));
    // 8b. Iterate over the ArrayList and print each student's details.
System.out.println(alStudents);
    // 8c. Remove the student Bob.
    for (Student student : alStudents) {
      if (student.getName().equals("Bob")){
        alStudents.remove(student);
      }
    }
    System.out.println(alStudents);
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    Map<Integer, String> studentMap = new HashMap<>;
    
    
    // 8e. Create another ArrayList to store student with name starts with 'A'

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

  }
}


