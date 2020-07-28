package com.jdbc.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {

  public void readOneCharacter(){
    try {
      System.out.print("Karakter : ");
      int charCode = System.in.read();
      System.out.println("Karakter ASCII kodja : " + charCode);
      char character = (char) charCode;
      System.out.println("A karakter kodja : " + (char) character);
    } catch (IOException e) {
      System.out.println("Something went wrong! : " + e.getMessage());
    }
  }

  public void readText(String filePath){
    try {
      String str = new String("");
      FileInputStream fis = new FileInputStream(filePath);
      int character = fis.read();
      while(character != -1){
        str = str + (char)character;
        character = fis.read();
      }
      System.out.println(str);
      fis.close();
    } catch (FileNotFoundException e) {
      System.out.println("A fajl nem letezik a kovetkezo helyen: " + filePath);
      System.out.println("Hiba: " + e.getMessage());
    }
    catch (SecurityException securityException){
      System.out.println("A fajl hozzaferes megtagadva: " + securityException.getMessage() );
    } catch (IOException e) {
      System.out.println("Nem lehetett beolvasni a fajl tartalmat!");
      System.out.println("Hiba: " + e.getMessage());
    }
  }

}
