package com.jdbc.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args){
    List<String> names = new ArrayList<>();
    names.add("Krisz");
    names.add("Laci");
    names.add("Tunde");
    names.add("Marta");

    System.out.println(names);

    System.out.println(names.get(2));
    names.remove(2);
    System.out.println(names);
    System.out.println(names.get(2));
  }

}
