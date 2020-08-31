package com.tech.helper;
import java.sql.*;

public class ConnectionProvider {
  private static Connection conn;
  
  public static Connection getConncetion(){
      
      try{
       if(conn == null){
            //driver class load
          Class.forName("com.mysql.jdbc.Driver");
          
          //create coonnection
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tech","root","root");
       }
      }
      catch(Exception e){
          e.printStackTrace();
      }
      
      
      return conn;
  }
}
