package com.bootcamp.demo;

// ! static import: load all the static methods from the target
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testFindDogListByAge() {
    Dog d1 = new Dog(3.3, "ABC", 3.3, 5);
    Dog d2 = new Dog(3.4, "DEF", 10, 5);
    Dog d3 = new Dog(3.4, "XYZ", 10, 2);
    List<Dog> dogs = new ArrayList<>(Arrays.asList(d1, d2));
    List<Dog> acutalResult = Dog.findDogAgeGreaterThan(dogs, 3);

  }
}
