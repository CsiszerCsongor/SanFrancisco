package com.jdbc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args){
    List<Person> people = new ArrayList<>();
    people.add(new Person(3, "Jutka"));
    people.add(new Person(2, "Ferenc"));
    people.add(new Person(1, "Kalman"));
    people.add(new Person(4, "Gyuszi"));

    Collections.sort(people);

    //people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

    people.forEach(s -> System.out.println(s));

    System.out.println();

    // Second comparator
    List<Person2> people2 = new ArrayList<>();
    people2.add(new Person2(3, "Jutka"));
    people2.add(new Person2(2, "Kalman"));
    people2.add(new Person2(1, "Ferenc"));
    people2.add(new Person2(4, "Gyuszi"));

    System.out.println("Kor alapjan 2");
    people2.sort(Person2.AgeComparator);
    people2.forEach(s -> System.out.println(s));
    System.out.println();

    System.out.println("Nev alapjan 2");
    people2.sort(Person2.NameComparator);
    people2.forEach(s -> System.out.println(s));
    System.out.println();

    // Third comparator with lambda expression
    List<Person3> people3 = new ArrayList<>();
    people3.add(new Person3(3, "Jutka"));
    people3.add(new Person3(2, "Kalman"));
    people3.add(new Person3(1, "Ferenc"));
    people3.add(new Person3(4, "Gyuszi"));

    people3.sort((Person3 firstPerson, Person3 secondPerson) -> firstPerson.getName().compareTo(secondPerson.getName()));
    people3.forEach(person -> System.out.println(person));
    System.out.println();
    people3.sort((firstPerson, secondPerson) -> firstPerson.getAge() - secondPerson.getAge());
    people3.forEach(person -> System.out.println(person));
  }
}
