package com.jdbc.joinAndSynchronized;

import java.util.ArrayList;

class Locker{
  private Object lock1 = new Object();
  private Object lock2 = new Object();

  public ArrayList<Integer> number1 = new ArrayList<>();
  public ArrayList<Integer> number2 = new ArrayList<>();

  public void doorOne() throws InterruptedException {
    synchronized (lock1){
      number1.add(10);
      Thread.sleep(1);
    }
  }

  public void doorTwo() throws InterruptedException {
    synchronized (lock2){
      number2.add(10);
      Thread.sleep(1);
    }
  }

  public void doWork() throws InterruptedException {
    for(int i = 0; i < 500; i++){
      doorOne();
      doorTwo();
    }
  }

}

public class LockerDemo {

  public static void main(String[] args){
    System.out.println("Kezdjuk el: ");

    Locker locker = new Locker();

    long start = System.currentTimeMillis();

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          locker.doWork();
        } catch (InterruptedException e) {
          System.out.println("Problem in some thread! Thread name: " + e.getMessage());
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          locker.doWork();
        } catch (InterruptedException e) {
          System.out.println("Problem in some thread! Thread name: " + e.getMessage());
        }
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      System.out.println("Problem at join()");
    }

    long end = System.currentTimeMillis();

    System.out.println("Millisec: " + (end - start));
    System.out.println("Numbers 1 : " + locker.number1.size());
    System.out.println("Numbers 2 : " + locker.number2.size());
  }
}
