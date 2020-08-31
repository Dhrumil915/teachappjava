package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.helper.ConnectionProvider;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"body-background\">\n");
      out.write("            <!--Banner-->\n");
      out.write("            <div class=\"container-fluid m-0 p-0\">\n");
      out.write("                <div class=\"jumbotron primary-background banner-background\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h1 class=\"display-3\">Welcome Friends</h1>\n");
      out.write("                        <h2>Tech Code</h2>\n");
      out.write("                        <p>Computers can only execute the machine code instructions which are part of their instruction set.\n");
      out.write("                            Because these instructions are difficult for humans to read, \n");
      out.write("                            and writing good programs in machine code or other low-level programming languages is a time-consuming task,\n");
      out.write("                            most programmers write in the source code of a high-level programming language. </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>                      \n");
      out.write("            </div>\n");
      out.write("            <!-- login-->\n");
      out.write("            <main class=\"mt-10\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 offset-md-4\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header primary-background text-center\">\n");
      out.write("                                    <span class=\"fa fa-user-plus fa-3x\"></span>\n");
      out.write("                                    <br>\n");
      out.write("                                    <p>Login Here</p>  \n");
      out.write("                                </div> \n");
      out.write("                                <div>\n");
      out.write("                                    <div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("                                        A simple primary alert—check it out!\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body \">\n");
      out.write("                                    <form action=\"LoginServlate\" method=\"post\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                            <input type=\"email\" name=\"user_email\" required class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                                            <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"user_password\" required class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"container text-center\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"footer\">\n");
      out.write("                                        <div clas=\"form-group mt-5 text-center\">\n");
      out.write("                                            <a class=\"signup-page\" href=\"Registor.jsp\">SignUp Here</a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Connection conn = ConnectionProvider.getConncetion();
        
      out.write("  \n");
      out.write("      <!-- <h1>");
      out.print( conn);
      out.write("</h1>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--javascript-->\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n");
      out.write("            integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/mystyl.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
