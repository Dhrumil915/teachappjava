package com.tech.dao;

import com.tech.entity.User;
import java.sql.*;

public class UserDao {
    
    private Connection conn;
    
    public UserDao(Connection conn){
        this.conn = conn;
    }
    //Method To Insert into Databse
    
    public boolean saveuser(User user){
         boolean f = false;
        try{
           //user-->Database
           
            
            String sql ="insert into user(name, password, gender, email, phone_number) values (?,?,?,?,?)";
        
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, user.getName());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getGender());
            pst.setString(4, user.getEmail());
            pst.setString(5, user.getPhone_number());
             
            pst.executeUpdate();
             f = true;
        }
        catch(Exception e){
            e.printStackTrace(); 
        }
             return f;
    }
    
    //get user by email id and password
    public User getEmailPassword(String email, String password){
        User user = null;
        
        
        try{
            String sql = "select * from user where email=? and password=?";
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            
            ResultSet set = pst.executeQuery();
            if(set.next()){
             user=new User();
             
             //data from db
             String name = set.getString("name");
             //set to user objcet
             user.setName(name);
             
             user.setId(set.getInt("id"));
             user.setPassword(set.getString("password"));
             user.setEmail(set.getString("email"));
             user.setGender(set.getString("gender"));
             user.setPhone_number(set.getString("phone_nuumber"));
             user.setReg_date(set.getTimestamp("reg_date"));
            }
            else{
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return user;
    }
}
