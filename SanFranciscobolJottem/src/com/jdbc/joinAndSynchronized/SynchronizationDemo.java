package com.jdbc.joinAndSynchronized;

public class SynchronizationDemo {
  private int count;

  private synchronized void addCount(){
    count++;
  }

  public static void main(String[] args){
    SynchronizationDemo sd = new SynchronizationDemo();
    long startMillis = System.currentTimeMillis();
    sd.incrementCountInThreads();
    Long endMillis = System.currentTimeMillis();
    System.out.println("Millisec: " + (endMillis - startMillis));
  }

  public void incrementCountInThreads(){
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 12000; ++i){
          addCount();
        }
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i = 0; i < 12000; ++i){
          addCount();
        }
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      System.out.println("Some thread interrupted: " + e.getMessage());
    }

    System.out.println("Count erteke: " + count);
  }

}
