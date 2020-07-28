package com.jdbc.thread;

public class ThreadTasker extends Thread {
  public void run(){
    try {
      for(int i = 0; i < 5; ++i){
        System.out.println("Muvelet " + i);
        Thread.sleep(100);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
