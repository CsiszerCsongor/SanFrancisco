package com.jdbc.comparator;

public class Person3 {
  private int age;
  private String name;

  public Person3(){}

  public Person3(int age, String name){
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person3{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}
