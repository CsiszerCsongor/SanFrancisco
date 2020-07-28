package com.jdbc.stream;

public class Main {

  public static void main(String[] args){
    String filePath = "D:\\Egyéb\\Programming\\SanFranciscobolJottem\\src\\com\\jdbc\\stream\\data.txt";

    /*Reader reader = new Reader();
    //reader.readOneCharacter();
    reader.readText(filePath);*/

    Writer writer = new Writer();
    String text = "Kis alma csutika";
    //writer.writeTextIntoFile(filePath, text);
    writer.bufferedWriteText(filePath, text);

    Reader reader = new Reader();
    reader.readText(filePath);
  }
}
