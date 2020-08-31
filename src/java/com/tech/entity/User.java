package com.tech.entity;
import java.sql.*;
public class User {
     
    private int id;
    private String name;
    private String password;
    private String gender;
    private String email;
    private String phone_number;
    private Timestamp reg_date;

    public User(int id, String name, String password, String gender, String email, String phone_number, Timestamp reg_date) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.phone_number = phone_number;
        this.reg_date = reg_date;
    }
    
    public User(){
        
    }

    public User(String name, String password, String gender, String email, String phone_number) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.phone_number = phone_number;
       
    }
    
    //Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }
    
    
    
}
