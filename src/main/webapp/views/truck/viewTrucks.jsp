<%-- 
    Document   : viewTrucks
    Created on : Nov 13, 2017, 1:11:32 AM
    Author     : shrikantjesu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:include page="../navbar.jsp"></jsp:include>
        <h2>View Trucks</h2>
        <a href="${pageContext.request.contextPath}/views/truck/addNewTruck.jsp">
            <button style = float:right class="btn btn-primary ">Add Employee</button>
        </a>
    </body>
</html>
