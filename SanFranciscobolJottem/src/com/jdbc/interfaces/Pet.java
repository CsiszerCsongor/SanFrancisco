package com.jdbc.interfaces;

public interface Pet {
  default void sit(){
    System.out.println("Csuccs");
  }
}
