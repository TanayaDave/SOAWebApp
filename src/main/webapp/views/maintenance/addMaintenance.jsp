<%-- 
    Document   : addMaintenance
    Created on : Nov 13, 2017, 2:06:54 PM
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
        <title>Add Maintenance</title>    </head>
    </head>
    <body>
         <div class="container">
            <button  class="well" type="button" id="Back">Back</button>
            <div class="col-lg-12 well">
                <div class="row">
                    <form action="${pageContext.request.contextPath}/MaintenanceServlet" method="post">
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Date</label>
                                    <input type="text" name="date" placeholder="DD-MM-YYYY" class="form-control">
                                </div>                                
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Cost</label>
                                    <input type="text" name="cost" placeholder="Enter Cost Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Description</label>
                                    <input type="text" name="description" placeholder="Enter Description Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Status</label>
                                    <input type="text" name="status" placeholder="Enter Status Here.." class="form-control">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-lg btn-info">Add</button>
                        </div>
                    </form>                
        </div>
    </body>
</html>
