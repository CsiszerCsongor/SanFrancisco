package com.jdbc.thread;

import java.util.Scanner;

class VolatileTasker extends Thread {
  // Azert, hogy ne cache-elje a canRun osztályváltozót
  private volatile boolean canRun = true;

  public void run(){
    while(canRun){
      try {
        System.out.println("Still running!");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("An another thread interrupted current thread");
      }
    }
  }

  public void kill(){
    this.canRun = false;
  }

}

public class VolatileDemo {
  public static void main(String[] args){
    VolatileTasker task1 = new VolatileTasker();
    task1.start();

    Scanner sc = new Scanner(System.in);
    sc.nextLine();

    task1.kill();

  }

}
