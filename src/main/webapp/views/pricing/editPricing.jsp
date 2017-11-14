<%-- 
    Document   : addEmployee
    Created on : Nov 9, 2017, 1:16:31 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="CSS/style.css">
        <title>Edit Price</title>
    </head>
    <body>
        <jsp:include page="../navbar.jsp"></jsp:include>

        <!-- <div class="main">
                <button type="button" id="Back"  class="btn btn-primary">Back</button>               
        </div>
        -->
        <input type=hidden name=opr id=opr value=2>
        <%
            HttpSession sess = request.getSession();
        %>

        <div class="container">
              <a href="${pageContext.request.contextPath}/PricingServlet">
             <button  name = "back" class="well" type="button" id="Back">Back</button>
              </a>
            <div class="col-lg-12 well">
                <div class="row">
                    <form action="${pageContext.request.contextPath}/PricingServlet" method="post">
                        <c:forEach items="${requestScope.locs}" var="loc">
                            <input type="hidden" name="update" value="${loc.locId}">

                            <div class="col-sm-12">
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Location Code</label>
                                        <input type="text" name="loccode" value="<c:out value="${loc.locCode}"/>" placeholder="Enter Location code Here.." class="form-control">
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label>Location name</label>
                                        <input type="text" name="locname" value="<c:out value="${loc.locName}"/>" placeholder="Enter Loc name.." class="form-control">
                                    </div>
                                </div>		
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Price</label>
                                        <input type="text" id="DOB" name="price" value="<c:out value="${loc.price}"/>" placeholder="price" class="form-control">
                                    </div>
                                <button type="submit" class="btn btn-lg btn-info">Submit</button>					
                            </div>
                        </c:forEach>

                    </form> 
                </div>
            </div>
        </div>



    </body>
</html>
