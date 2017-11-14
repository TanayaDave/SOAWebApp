<%-- 
    Document   : addPricing
    Created on : Nov 13, 2017, 12:08:46 AM
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
    </head>
    <body>
        <jsp:include page="../navbar.jsp"></jsp:include>

        <div class="container">
            <a href="${pageContext.request.contextPath}/PricingServlet">
             <button  class="well" type="button" id="Back">Back</button>
            </a> 
            <div class="col-lg-12 well">
                <div class="row">
                    <form action="${pageContext.request.contextPath}/PricingServlet" method="post">
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Location Code</label>
                                    <input type="text" name="loccode" placeholder="Enter Location Code Here.." class="form-control">
                                </div>                                
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Location Name</label>
                                    <input type="text" name="locname" placeholder="Enter Location Name Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Price</label>
                                    <input type="text" name="price" placeholder="Enter Price Here.." class="form-control">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-lg btn-info">Add</button>
                        </div>
                    </form>                
        </div>
    </body>
</html>
