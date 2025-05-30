import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Set<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Jacky"));
    cats.add(new Cat("John"));
System.out.println(cats);

ArrayList<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("orange");

ArrayList<String> names = new ArrayList<>();
names.add("John");
names.add("Peter");
ArrayList<ArrayList<String>> strings = new ArrayList<>();
strings.add(fruits);
strings.add(names);

System.out.println(strings);

// HashMap
// Map is an interface of HashMap
Map<String, ArrayList<String>> map = new HashMap<>();
map.put("fruits", fruits);
map.put("name", names);
System.out.println(map.get("name"));

// Dog, Cat
ArrayList<Animal> animals = new ArrayList<>();
animals.add(new Cat("John"));
animals.add(new Dog(13));
for (Animal animal : animals) {
  if (animal instanceof Cat) {
    System.out.println(((Cat) animal).getName());
  } else if (animal instanceof Dog) {
    System.out.println(((Dog) animal).getAge());
  }
}
Map<String, ArrayList<Animal>> catMap = new HashMap<>();
// Scenario 1:
// 2 Cat List ("cat1, cat2") and 1 Dog List ("dog1")

//Scenario 2:
// many animal list -> every list contains cat and dog.

  }
}
