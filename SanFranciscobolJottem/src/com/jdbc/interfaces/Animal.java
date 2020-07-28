package com.jdbc.interfaces;

public abstract class Animal {
  private String privateString;
  protected String protectedString;
  public String publicString;

  private void privateMethod(){}
  protected void protectedMethod(){}
  public void publicMethod(){}

  public void makeSound(){
    System.out.println("AAAAA");
    Apple apple = new Apple();
  }


}
