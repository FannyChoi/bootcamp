package com.bootcamp.demo;

import java.util.Objects;

public class Cat extends Animal {
  private int age;

  public Cat(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // equals
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
    return this.age == cat.getAge() && super.getName().equals(cat.getName());
  }

  // toString
  public String toString() {
    return "Cat(" + "name= " + super.getName() + ",age= " + this.age + ")";
  }

  // hashCode
  @Override
  public int hashCode() {
    return Objects.hash(this.age, super.getName());
  }
}
