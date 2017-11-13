<%-- 
    Document   : addComments
    Created on : Nov 12, 2017, 10:38:45 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="CSS/style.css">
        <title>Add Comments</title>    </head>
    <body>
        <div class="container">
            <button  class="well" type="button" id="Back">Back</button>
            <div class="col-lg-12 well">
                <div class="row">
                    <form action="${pageContext.request.contextPath}/CommentServlet" method="post">
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Date</label>
                                    <input type="text" name="date" placeholder="DD-MM-YYYY" class="form-control">
                                </div>                                
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Type</label>
                                    <input type="text" name="type" placeholder="Enter Type Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Comment</label>
                                    <textarea rows="5" cols="50" name="comment" placeholder="Enter Comment Here.." class="form-control"></textarea>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-lg btn-info">Add</button>
                        </div>
                    </form>                
        </div>
    </body>
</html>
