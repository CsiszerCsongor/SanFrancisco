package com.jdbc.thread;

public class Main {

  public static void main(String[] args){
    ThreadTasker thread1 = new ThreadTasker();
    thread1.start();
    ThreadTasker thread2 = new ThreadTasker();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println();

    Thread t1 = new Thread(new RunnableTasker());
    Thread t2 = new Thread(new RunnableTasker());
    t1.start();
    t2.start();
  }

}
