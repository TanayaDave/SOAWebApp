<%-- 
    Document   : editMaintenance
    Created on : Nov 13, 2017, 11:25:20 PM
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
        <title>Edit Maintenance</title>
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
             <a href="${pageContext.request.contextPath}/MaintenanceServlet">
            <button  class="well" type="button" id="Back">Back</button>
             </a>
            <div class="col-lg-12 well">
                <div class="row">
                    <form action="${pageContext.request.contextPath}/MaintenanceServlet" method="post">
                        <c:forEach items="${requestScope.main}" var="main">
                            <input type="hidden" name="update" value="${main.id}">
                            
                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Date</label>
                                    <input type="text" name="date" value="<c:out value="${main.date}"/>" placeholder="DD-MM-YYYY" class="form-control">
                                </div>                                
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Cost</label>
                                    <input type="text" name="cost" value="<c:out value="${main.cost}"/>" placeholder="Enter Cost Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Description</label>
                                    <input type="text" name="description" value="<c:out value="${main.desc}"/>" placeholder="Enter Description Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Status</label>
                                    <input type="text" name="status" value="<c:out value="${main.status}"/>" placeholder="Enter Status Here.." class="form-control">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-lg btn-info">Submit</button>
                        </div>
                                 </c:forEach>
                    </form>   
                    
        </div>
        
        
    </body>
</html>
