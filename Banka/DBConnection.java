// Klasa DBConnection namenjena je povezivanju sa bazom, i potrebno je
// uraditi to samo jedanput kako ne bi imali vise konekcija.

package Banka;

import java.sql.*;

public class DBConnection {

//  public DBConnection(String DBSource, String uname, String pwd)
  public DBConnection(){
  }

  public static boolean testConnection(){
    try{
      Statement s = conn.createStatement();
      s.executeQuery("select table_name from user_tables");
      s.close();
      return true;
    }
    catch(Exception e){
      return false;
    }
  }

  public static Connection getConnection() {
    return conn;
  }

  public static void closeConnection() {
    try{
      conn.close();
    }
    catch(SQLException e){
      System.out.println("Neuspešno zatvaranje konekcije");
      e.printStackTrace();
    }
  }

  private static Connection conn = null;

  static{
    try{
      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
      conn = DriverManager.getConnection("jdbc:oracle:thin:@archimedes.is.im.ns.ac.yu:1521:orais","baze2","drugac");
    }
    catch(Exception e){
      System.out.println("Database down");
      e.printStackTrace();
    }
  }
}
