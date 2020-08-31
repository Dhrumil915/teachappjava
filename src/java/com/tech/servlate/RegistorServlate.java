package com.tech.servlate;

import com.tech.dao.UserDao;
import com.tech.entity.User;
import com.tech.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
public class RegistorServlate extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           
           
            // Fetch All Form Data
            
            String check = request.getParameter("check");
              if(check == null){
                  out.print("Box Not Check");
              }
              //user_name,user_password,gender,user_email,phone_number
              else{
                  String name = request.getParameter("user_name");
                  String password = request.getParameter("user_password");
                  String gender = request.getParameter("user_gender");
                  String email = request.getParameter("user_email");
                  String phone_number = request.getParameter("phone_number");
                  
                  //Create user Object and set all set all data to all object...
                  User user = new User(name, password, gender, email, phone_number);
                  
                  
                  //Create User Dao Object
                  UserDao da = new UserDao(ConnectionProvider.getConncetion());
                  if(da.saveuser(user)){
                      // Save...
                      out.println("done");
                  }
                  else{
                      out.println("error");
                  }
              }
            
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
