<%@page import="com.tech.entity.User"%>
<%@page errorPage="error_page.jsp" %>
<%

    User user = (User) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("index.jsp");
    }

%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <!--css-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css" >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="body-background">
            <div class="container-fluid m-0 p-0">

                <nav class="navbar navbar-light primary-background">
                    <a class="navbar-brand" href="#"><span class="fa fa-user-circle-o fa-3x"></span></a>

                    <ul class="nav justify-content-end">
                        <li class="nav-item">
                            <a class="nav-link active" href="#"><span class="fa fa-user-o"></span><%= user.getName()%> </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="index.jsp"><span class="fa fa-user-times"></span>Logout</a>
                        </li>
                    </ul>
                </nav>

                <div class="container">
                    <div class="row mx-3 my-3 mb-10">
                    
                    <div class="card mx-3" style="width: 18rem;">
                        <img src="img/java.png" class="card-img-top img-thumbnail" alt="...">
                        <div class="card-body text-center">
                            <h5 class="card-title">Java</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go to Page...</a>
                        </div>
                    </div>
                    <div class="card mx-3" style="width: 18rem;">
                        <img src="img/java-script.png" class="card-img-top img-thumbnail" alt="...">
                        <div class="card-body text-center">
                            <h5 class="card-title">Java Script</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go to Page...</a>
                        </div>
                    </div>
                    <div class="card mx-3" style="width: 18rem;">
                        <img src="img/data.png" class="card-img-top" alt="...">
                        <div class="card-body text-center">
                            <h5 class="card-title">Data Structure</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">coming Soon....</a>
                        </div>
                    </div>
                        <div class="card mx-3 mt-3" style="width: 18rem;">
                            <img src="img/python.png" class="card-img-top" alt="...">
                        <div class="card-body text-center">
                            <h5 class="card-title">Python Programming</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Coming soon...</a>
                        </div>
                    </div>
                        
                        
                    </div>
                    
                </div>





            </div>
        </div>
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
