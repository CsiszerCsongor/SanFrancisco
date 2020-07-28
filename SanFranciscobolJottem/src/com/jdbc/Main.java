package com.jdbc;

import com.jdbc.interfaces.Animal;
import com.jdbc.interfaces.Cat;
import com.jdbc.interfaces.Dog;
import java.applet.Applet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	      Cat cat = new Cat();
	      cat.sit();
	      cat.makeSound();
	      cat.publicMethod();
	      //Apple apple = new Applet();

			System.out.println("Cat azonosito : " + cat.hashCode());
			System.out.println("Cat toString() : " + cat.toString());
    }
}
