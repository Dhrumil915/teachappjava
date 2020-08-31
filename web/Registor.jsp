<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html">
        <title>Register</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css" type="text/css" >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <div class="body-background">
            <main>
                <div class="container">
                    <div class="col-md-6 offset-md-3">
                        <div class="card">
                            <div class="card-header text-center banner-background primary-background">
                                <span class="fa fa-users fa-3x"></span>
                                <br>
                                <p>Register Here</p>
                            </div>
                            <div class="card-body">
                                <form action="RegistorServlate" method="post" id="user_registor">
                                    <div class="form-group">
                                        <label for="Name">Name</label>
                                        <input type="text" name="user_name" class="form-control" id="Name" aria-describedby="NameHelp" placeholder="Enter Name">
                                        <small id="NameHelp" class="form-text text-muted"></small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" name="user_password" class="form-control" id="exampleInputPassword1" placeholder="Enter password">
                                    </div>
                                    <div class="form-group">
                                        <label for="Gender">Select Gender</label>
                                        <br>
                                        <input type="radio"  id="male" name="user_gender">Male
                                        <input type="radio"  id="female" name="user_gender">Female

                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input type="email" name="user_email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>

                                    <div class="form-group">
                                        <label for="Phonenumber">Phone Number</label>
                                        <input type="text" name="phone_number" class="form-control" id="Phonenumber" aria-describedby="Phonenumber" placeholder="Enter phonenumber">
                                        <small id="Phonenumber" class="form-text text-muted"></small>
                                    </div>
                                    <div class="form-group form-check">
                                        <input type="checkbox" name="check" class="form-check-input" id="exampleCheck1">
                                        <label class="form-check-label" for="exampleCheck1">Agree terms and Condition</label>
                                    </div>
                                    <br>
                                    <div class="container text-center" id="loader" style="display: none;">
                                        <span class="fa fa-spinner fa-spin fa-4x"></span>
                                        <h4>please wait......</h4>
                                    </div>
                                    <br>
                                    <button id="submit_btn" type="submit" class="btn btn-primary">Submit</button>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>








        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="js/mystyl.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>

        <script>

                    $(document).ready(function () {
            console.log("loded.....");
                    $('#user_registor').on('submit', function (e) {

            e.preventDefault();
                    //  form=new FormData(this);
                    let form = new FormData(this);
                    $('#submit_btn').hide();
                    $('#loader').show();
                    $.ajax({
                    url: "RegistorServlate",
                            type: 'POST',
                            data: form,
                            success: function (data, textStatus, jqXHR) {

                            console.log(data);
                                    $('#submit_btn').show();
                                    $('#loader').hide();
                                  
        
                                  if(data.trim() === 'done'){
                                    swal("Your Register Sucessful.......")
                                            .then((value)=>{
                                       window.location="index.jsp"        
                                    });
                                   
                                }
                                else{
                                    swal(data);
                                }
                            },
                            error: function (jqXHR, textStatus, errorThrown) {

                            $('#submit_btn').show();
                                    $('#loader').hide();
                                    swal("Something Wrong....");
                                    console.log("error......");
                            },
                            processData: false,
                            contentType: false
                    });
            });
            });

        </script>


    </body>
</html>
