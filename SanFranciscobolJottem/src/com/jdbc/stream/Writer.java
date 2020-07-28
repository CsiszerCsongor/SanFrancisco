package com.jdbc.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
  public void writeCharacter(char character){
    System.out.println(character);
  }

  public void writeTextIntoFile(String filePath, String text){
    try {
      FileOutputStream fos = new FileOutputStream(filePath);
      byte[] stringInBytes = text.getBytes();
      fos.write(stringInBytes);
      fos.flush();
      fos.close();
    }
    catch (FileNotFoundException e) {
      writeErrorMessage("A fajl nem talalhato: " + filePath, e);
    }
    catch (IOException e){
      writeErrorMessage("Hiba a fajlba torteno iraskor!", e);
    }
  }

  public void bufferedWriteText(String filePath, String text){
    try {
      FileOutputStream fous = new FileOutputStream(filePath);
      BufferedOutputStream bos = new BufferedOutputStream(fous);

      byte[] stringInBytes = text.getBytes();
      bos.write(stringInBytes);
      bos.flush();
      bos.close();
    } catch (FileNotFoundException e) {
      writeErrorMessage("A fajl nem talalhato: " + filePath, e);
    } catch (IOException e) {
      writeErrorMessage("Hiba a fajlba torteno iraskor!", e);
    }

  }

  private void writeErrorMessage(String message, Exception e){
    System.out.println(message);
    System.out.println("Hiba: " + e.getMessage());
  }

}
