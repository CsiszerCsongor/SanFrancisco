package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
  final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
  final String URL = "jdbc:derby:sampleDB;create=true";
  // Mivel beépített adatbázist használok, ezért most nem adok meg username-t és password-ot
  // Nem kell ebben az esetben attól félni, hogy valaki megpróbálja meghacke-elni
//  final String USERNAME = "";
//  final String PASSWORD = "";

  public DB(){
    // Connection egy abstract osztaly, nem lehet csak úgy létrehozni.
    // Ezért DriverManager-t használunk, ami már visszaadja a hídat
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(URL);
    } catch (SQLException e) {
      System.out.println("Fault at create connection!");
      System.out.println(e.getMessage());
    }

    if(connection != null){
      Statement statement = null;
      try {
        statement = connection.createStatement();
      } catch (SQLException e) {
        System.out.println("Fault at create statement!");
        System.out.println(e.getMessage());
      }
    }

    DatabaseMetaData metaData = null;
    try {
      // Le kell ellenőrizni, hogy üres-e az adatbázis
      // Metaadatból nézem meg, hogy van-e benne tábla
      metaData = connection.getMetaData();
    } catch (SQLException e) {
      System.out.println("Fault at get metadata!");
      System.out.println(e.getMessage());
    }

    try {
      // App - a séma
      // USERS - a tábla neve
      ResultSet resultSet = metaData.getTables(null, "APP", "USERS", null);
      // Ha nem létezik a USERS tábla, mert nincs benne adat
      // Ha a visszaérkező eredménynek nincsen már első rekordja sem
      if(!resultSet.next()){
        state
      }
    } catch (SQLException e) {
      System.out.println("Fault at get resultset!");
      System.out.println(e.getMessage());
    }

  }
}
