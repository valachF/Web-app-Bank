package Banka;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class DBF {

// Primer metode koja komunicira sa bazom
  public static Vector getDepozit (){
    Vector res = new Vector();
    PreparedStatement pstmt = null;
    try {
      pstmt = DBConnection.getConnection().prepareStatement("SELECT OZNDEP, IZNDEP FROM FV33506Depozit");
      ResultSet rs = pstmt.executeQuery();
      Vector temp = null;
      while(rs.next()){
        temp = new Vector();
        temp.add(new Integer(rs.getInt(1)));
        temp.add( new Integer(rs.getInt(2)));
        res.add(temp);
      }
      rs.close();
      pstmt.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      try{
        if (pstmt != null){
          pstmt.close();
        }
        return res;
      }
      catch (Exception e) {
        e.printStackTrace();
        return null;
      }
    }
  }

 

  


 

  public static Vector getFilijale(String oznaka){
    Vector res = new Vector();
    PreparedStatement pstmt = null;
    try {
    	int oznakaB=Integer.parseInt(oznaka);
      pstmt = DBConnection.getConnection().prepareStatement("SELECT OZNORJ, NAZORJ, ADRORJ FROM FV33506Filijala  WHERE "+
        "FV33506BankaSaFilijalom_OZNORJ = "+ oznakaB);
      ResultSet rs = pstmt.executeQuery();
      Vector temp = null;
     
      while(rs.next()){
        temp = new Vector();
       
        temp.add(new Integer(rs.getInt(1)));
        temp.add(rs.getString(2));
        temp.add(rs.getString(3));
        
       
        res.add(temp);
      }
      rs.close();
      pstmt.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      try{
        if (pstmt != null){
          pstmt.close();
        }
        return res;
      }
      catch (Exception e) {
        e.printStackTrace();
        return null;
      }
    }
  }
  
  public static String getadresaB(String oznaka){
		  String pom1=" ";
	    PreparedStatement pstmt = null;
	    try {
	    	int oznakaB=Integer.parseInt(oznaka);
	      pstmt = DBConnection.getConnection().prepareStatement("SELECT  ADRORJ FROM FV33506Banka WHERE OZNORJ="+oznakaB);
	      ResultSet rs = pstmt.executeQuery();
	      Vector temp = null;
	      while(rs.next()){
	        temp = new Vector();   
	        pom1 = rs.getString(1);
	        temp.add(rs.getString(1));
	      }
	      rs.close();
	      pstmt.close();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    finally {
	      try{
	        if (pstmt != null){
	          pstmt.close();
	        }
	        return pom1;
	      }
	      catch (Exception e) {
	        e.printStackTrace();
	        return null;
	      }
	    }
	  }
  public static Vector getOznakaBank(){
	  Vector res = new Vector();
	    PreparedStatement pstmt = null;
	    try {
	    	
	      pstmt = DBConnection.getConnection().prepareStatement("SELECT  oznorj FROM FV33506Banka");

	      ResultSet rs = pstmt.executeQuery();
	      Vector temp = null;
	 
	      while(rs.next()){
	        temp = new Vector();
	       
	       
	        temp.add(new Integer(rs.getInt(1)));
	        
	       
	        res.add(temp);
	      }
	      rs.close();
	      pstmt.close();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    finally {
	      try{
	        if (pstmt != null){
	          pstmt.close();
	        }
	        return res;
	      }
	      catch (Exception e) {
	        e.printStackTrace();
	        return null;
	      }
	    }
	  }
  public static String getnazivB(String oznaka){
	    String pom1=" ";
	    PreparedStatement pstmt = null;
	    try {
	    	int oznakaB=Integer.parseInt(oznaka);
	      pstmt = DBConnection.getConnection().prepareStatement("SELECT  NAZORJ FROM FV33506Banka WHERE OZNORJ="+oznakaB);

	      ResultSet rs = pstmt.executeQuery();
	      Vector temp = null;
	 
	      while(rs.next()){
	     
	       
	        pom1 = rs.getString(1);
	     
	        
	       
	     
	      }
	      rs.close();
	      pstmt.close();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	    finally {
	      try{
	        if (pstmt != null){
	          pstmt.close();
	        }
	       
	        return pom1;
	      }
	      catch (Exception e) {
	        e.printStackTrace();
	        return null;
	      }
	    }
	  }
  public static String insertBanka(int oznakaB,
		                             String nazivB,
		                             String adresaB,
                                     int oznakaF,
                                     String nazivF,
                                     String adresaF
                                     ){
    String res = null;
    try{
      DBConnection.getConnection().setAutoCommit(false);
      PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(
          "INSERT INTO FV33506Banka (OZNORJ, NAZORJ, ADRORJ ) VALUES (?,?,?)");
      pstmt.setInt(1,oznakaB);
      pstmt.setString(2,nazivB);
      pstmt.setString(3,adresaB);
      pstmt.executeUpdate();
      
      
      pstmt = DBConnection.getConnection().prepareStatement(
      "INSERT INTO FV33506BankaSaFilijalom (OZNORJ ) VALUES (?)");
      pstmt.setInt(1,oznakaB);
      pstmt.executeUpdate();
      
       pstmt = DBConnection.getConnection().prepareStatement(
      "INSERT INTO FV33506Filijala (OZNORJ, NAZORJ, ADRORJ, FV33506BankaSaFilijalom_OZNORJ ) VALUES (?,?,?,?)");
  pstmt.setInt(1,oznakaF);
  pstmt.setString(2,nazivF);
  pstmt.setString(3,adresaF);
  pstmt.setInt(4, oznakaB);
  pstmt.executeUpdate();
  pstmt.close();
      
      DBConnection.getConnection().commit();
    }
    catch(Exception ex){
      ex.printStackTrace();
      try{
        DBConnection.getConnection().rollback();
      }
      catch(Exception e){
        e.printStackTrace();
      }
      res = "Unos banke nije uspeo!";
    }
    return res;
  }

  public static String deleteBanka( String oznaka,
                                     String naziv,                                 
                                     String adresa){
    String res = null;
    int ozn=Integer.parseInt(oznaka);
    try{
      DBConnection.getConnection().setAutoCommit(false);
     PreparedStatement pstmt = DBConnection.getConnection().prepareStatement("SELECT nazorj FROM FV33506Banka WHERE oznorj="+ozn
        +" AND nazorj = '"+naziv+"' AND adrorj = '"+adresa+"'" );
      int rowsAffected = pstmt.executeUpdate();
      if(rowsAffected==0)
      {
        res = "Banka nije pronadjena.";
      }else{
    	  pstmt=DBConnection.getConnection().prepareStatement("DELETE FROM FV33506FilDep WHERE FV33506BankaSaFilijalom_OZNORJ="+ozn );
          pstmt.executeUpdate();
          pstmt=DBConnection.getConnection().prepareStatement("DELETE FROM FV33506Filijala WHERE FV33506BankaSaFilijalom_OZNORJ="+ozn );
          pstmt.executeUpdate();
          pstmt=DBConnection.getConnection().prepareStatement("DELETE FROM FV33506BankaSaFilijalom WHERE OZNORJ="+ozn );
          pstmt.executeUpdate();
          pstmt=DBConnection.getConnection().prepareStatement("DELETE FROM FV33506Banka WHERE OZNORJ="+ozn );
          pstmt.executeUpdate();
          
      }
      pstmt.close();
      DBConnection.getConnection().commit();
    }
    catch(Exception ex){
      ex.printStackTrace();
      try{
        DBConnection.getConnection().rollback();
      }
      catch(Exception e){
        e.printStackTrace();
      }
      res = "Brisanje banke nije uspelo!";
    }
    return res;
  }
}