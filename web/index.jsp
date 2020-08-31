<%@page import="com.tech.entity.Message"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css" >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>

        </style>
    </head>
    <body>
        <div class="body-background">
            <!--Banner-->
            <div class="container-fluid m-0 p-0">
                <div class="jumbotron primary-background banner-background">
                    <div class="container">
                        <h1 class="display-3">Welcome Friends</h1>
                        <h2>Tech Code</h2>
                        <p>Computers can only execute the machine code instructions which are part of their instruction set.
                            Because these instructions are difficult for humans to read, 
                            and writing good programs in machine code or other low-level programming languages is a time-consuming task,
                            most programmers write in the source code of a high-level programming language. </p>
                    </div>
                </div>                      
            </div>
            <!-- login-->
            <main class="mt-10">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 offset-md-4">
                            <div class="card">
                                <div class="card-header primary-background text-center">
                                    <span class="fa fa-user-plus fa-3x"></span>
                                    <br>
                                    <p>Login Here</p>  
                                </div> 
                                <div>
                                    <%
                                        Message m = (Message) session.getAttribute("msg");
                                        if (m != null) {
                                    %>
                                    <div class="alert <%= m.getCssClass() %>" role="alert">
                                        <%= m.getContent()    %>
                                    </div>

                                    <%
                                            session.removeAttribute("msg");
                                        }
                                    %>
                                </div>
                                <div class="card-body ">
                                    <form action="LoginServlate" method="post">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Email address</label>
                                            <input type="email" name="user_email" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">Password</label>
                                            <input type="password" name="user_password" required class="form-control" id="exampleInputPassword1">
                                        </div>
                                        <div class="container text-center">
                                            <button type="submit" class="btn btn-primary">Submit</button>
                                        </div>

                                    </form>
                                    <div class="footer">
                                        <div clas="form-group mt-5 text-center">
                                            <a class="signup-page" href="Registor.jsp">SignUp Here</a>
                                        </div>

                                    </div>
                                </div>
                            </div>  
                        </div>
                    </div>
            </main>
        </div>


        <%
            Connection conn = ConnectionProvider.getConncetion();
        %>  
      <!-- <h1><%= conn%></h1>-->


        <!--javascript-->
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="js/mystyl.js"></script>

    </body>
</html>
