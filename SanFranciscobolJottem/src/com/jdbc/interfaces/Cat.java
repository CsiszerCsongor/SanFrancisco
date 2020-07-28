package com.jdbc.interfaces;

public class Cat extends Animal implements Pet {

  public Cat(){
    super.protectedString = "";
    super.publicString = "macskaString";
    super.protectedMethod();
    super.publicMethod();
  }

  @Override
  public void makeSound(){
    System.out.println("MEOW");
    int a = 22;
    byte d = 22;
    byte b = (byte) a;
    byte c = (byte) ((byte) a + b);

    long primitive = 22;
    becsomagol(primitive);
  }

  private void becsomagol(Long longValue){
    long value = longValue;
  }

  public void utal(){
    Dog dog = new Dog();
    dog.name = "";
  }

  private static String alma = "alma";
  private String kecske;

  public static void staticFunction(){
    //kecske = "";
  }
}

class Apple{}
