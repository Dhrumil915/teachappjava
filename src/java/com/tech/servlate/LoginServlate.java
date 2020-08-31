package com.tech.servlate;

import com.tech.dao.UserDao;
import com.tech.entity.Message;
import com.tech.entity.User;
import com.tech.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlate extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlate</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //Login
          //  user_email,user_password
            //Fetch email and passwoed from request
            String useremail = request.getParameter("user_email");
            String userpassword = request.getParameter("user_password");
            
            UserDao dao = new UserDao(ConnectionProvider.getConncetion());
           User u = dao.getEmailPassword(useremail, userpassword);
           
           if(u == null){
               // error
               out.println("Invalid Details");
               Message msg = new Message("Invalid Details....", "error", "alert-danger");
               HttpSession s = request.getSession();
               s.setAttribute("msg", msg);
               
               response.sendRedirect("index.jsp");
           }
           else{
               //sucess
               HttpSession s = request.getSession();
               s.setAttribute("currentUser", u);
               response.sendRedirect("Profile.jsp");
           }
            
            out.println("</body>");
            out.println("</html>");
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
