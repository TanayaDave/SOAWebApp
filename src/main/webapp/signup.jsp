<%-- 
    Document   : signup
    Created on : Nov 12, 2017, 3:35:21 PM
    Author     : shrikantjesu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Sign Up</title>
        <style>
            .center_div{
                margin: 0 auto;
                width:80% /* value of your choice which suits your alignment */
            }s 
        </style>
    </head>
    <body>

        <div class="center_div">
            <form class="form-horizontal justify-content-center" action="SignUpServlet" method="post">
                <h2 class="text-center">Sign Up</h2>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Username:</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="userName" placeholder="User Name">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Password:</label>
                    <div class="col-sm-2">
                        <input type="password" class="form-control" name="password" placeholder="Password">
                    </div>
                </div>
                <div class="form-group justify-content-center">
                    <label class="col-sm-2 control-label">Name: </label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" required  placeholder="First Name"  name="fName" maxlength="15">
                    </div>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" required  placeholder="Last Name"  name="lName" maxlength="15">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Address:</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="addrline1" placeholder="First Address Line">
                    </div>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="addrline2" placeholder="Second Address Line">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">City:</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="city" placeholder="City">
                    </div>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="zip" placeholder="Zip">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">State:</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="state" placeholder="State">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Phone No:</label>
                    <div class="col-sm-2">
                        <input type="text" class="form-control" name="phoneNo" placeholder="Phone No.">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Email:</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="email" placeholder="Email">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-xs-2 ">
                        <button class="btn btn-primary" type="submit" >Submit</button>
                        <a href="loginPage.jsp" class="btn btn-primary">Cancel</a>
                    </div>

                </div>
            </form>
        </div>
    </body>
</html>
