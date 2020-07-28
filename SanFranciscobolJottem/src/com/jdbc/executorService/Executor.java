package com.jdbc.executorService;

import com.sun.javafx.tk.Toolkit.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskUnit implements Runnable{
  private int id;

  public TaskUnit(int id){
    this.id = id;
  }

  @Override
  public void run(){
    System.out.println("Feladat indult. id: " + id);
    try{
      Thread.sleep(300);
    }
    catch (InterruptedException e){
      System.out.println(e);
    }

    System.out.println("Feladat elkeszult. id: " + id);
  }
}

public class Executor{
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    for(int i = 0; i < 5; ++i){
      executor.submit(new TaskUnit(i));
    }

    executor.shutdown();
    System.out.println("Minden munka ki lett osztva");
    executor.awaitTermination(10, TimeUnit.SECONDS);
    System.out.println("Keszen van az osszes munka");
  }
}
