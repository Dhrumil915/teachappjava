package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"body-background\">\n");
      out.write("            <main>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header text-center banner-background primary-background\">\n");
      out.write("                                <span class=\"fa fa-users fa-3x\"></span>\n");
      out.write("                                <br>\n");
      out.write("                                <p>Register Here</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form action=\"RegistorServlate\" method=\"post\" id=\"user_registor\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"Name\">Name</label>\n");
      out.write("                                        <input type=\"text\" name=\"user_name\" class=\"form-control\" id=\"Name\" aria-describedby=\"NameHelp\">\n");
      out.write("                                        <small id=\"NameHelp\" class=\"form-text text-muted\"></small>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                        <input type=\"password\" name=\"user_password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"Gender\">Select Gender</label>\n");
      out.write("                                        <br>\n");
      out.write("                                        <input type=\"radio\"  id=\"male\" name=\"user_gender\">Male\n");
      out.write("                                        <input type=\"radio\"  id=\"female\" name=\"user_gender\">Female\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                        <input type=\"email\" name=\"user_email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"Phonenumber\">Phone Number</label>\n");
      out.write("                                        <input type=\"text\" name=\"phone_number\" class=\"form-control\" id=\"Phonenumber\" aria-describedby=\"Phonenumber\">\n");
      out.write("                                        <small id=\"Phonenumber\" class=\"form-text text-muted\"></small>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group form-check\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"check\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                        <label class=\"form-check-label\" for=\"exampleCheck1\">Agree terms and Condition</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"container text-center\" id=\"loader\" style=\"display: none;\">\n");
      out.write("                                        <span class=\"fa fa-spinner fa-spin fa-4x\"></span>\n");
      out.write("                                        <h4>please wait......</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <br>\n");
      out.write("                                    <button id=\"submit_btn\" type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n");
      out.write("            integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/mystyl.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                console.log(\"loded.....\");\n");
      out.write("\n");
      out.write("                $('#user_registor').on('submit', function (e) {\n");
      out.write("\n");
      out.write("                    e.preventDefault();\n");
      out.write("\n");
      out.write("                    //  form=new FormData(this);\n");
      out.write("                    let form = new FormData(this);\n");
      out.write("                    $('#submit_btn').hide();\n");
      out.write("                    $('#loader').show();\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"RegistorServlate\",\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: form,\n");
      out.write("                        success: function (data, textStatus, jqXHR) {\n");
      out.write("\n");
      out.write("                            console.log(data);\n");
      out.write("\n");
      out.write("                            $('#submit_btn').show();\n");
      out.write("                            $('#loader').hide();\n");
      out.write("\n");
      out.write("                               \n");
      out.write("                               if(data === \"done\"){\n");
      out.write("                                   swal(\"Hello world!\");\n");
      out.write("                                   window.location = \"index.jsp\"\n");
      out.write("                               }\n");
      out.write("                               else{\n");
      out.write("                                   swal(data);\n");
      out.write("                               }\n");
      out.write("                            console.log(\"sucess.....\");\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("\n");
      out.write("                            $('#submit_btn').show();\n");
      out.write("                            $('#loader').hide();\n");
      out.write("                            swal(\"Something Wrong....\");\n");
      out.write("                            console.log(\"error......\");\n");
      out.write("                        },\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
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
