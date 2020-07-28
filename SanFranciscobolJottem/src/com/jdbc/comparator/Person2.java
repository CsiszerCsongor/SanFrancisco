package com.jdbc.comparator;

import java.util.Comparator;

public class Person2 {
  private int age;
  private String name;

  public Person2(){}

  public Person2(int age, String name){
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
    return "Person2{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }

  public static Comparator<Person2> AgeComparator = new Comparator<Person2>() {
    @Override
    public int compare(Person2 o1, Person2 o2) {
      Person2 person = (Person2) o1;
      Person2 person2 = (Person2) o2;
      return o1.getAge() - o2.getAge();
    }
  };

  public static Comparator<Person2> NameComparator = new Comparator<Person2>() {
    @Override
    public int compare(Person2 o1, Person2 o2) {
      Person2 firstPerson = ((Person2) o1);
      Person2 secondPerson = ((Person2) o2);
      return firstPerson.getName().compareTo(secondPerson.getName());
    }
  };

}
