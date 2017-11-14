<%-- 
    Document   : viewTrucks
    Created on : Nov 13, 2017, 1:11:32 AM
    Author     : shrikantjesu
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>JSP Page</title>
    </head>
    <body>

        <jsp:include page="../navbar.jsp"></jsp:include>

            <div class="container">
                <h2>View Trucks</h2>
                <a href="${pageContext.request.contextPath}/views/truck/addNewTruck.jsp">
                <button style = float:right class="btn btn-primary ">Add Truck</button>
            </a>
            <table class="table">
                <thead>
                    <tr>
                        <th>VIN</th>
                        <th>Color</th>
                        <th>Capacity</th>
                        <th>Type</th>
                        <th>License Plate No.</th>
                        <th>Year</th>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach items="${truckList}" var="truck">
                        <tr>
                            <td><c:out value="${truck.vin}" /></td>
                            <td><c:out value="${truck.color}" /></td>
                            <td><c:out value="${truck.capacity}" /></td>
                            <td><c:out value="${truck.type}" /></td>
                            <td><c:out value="${truck.licPlateNo}" /></td>
                            <td><c:out value="${truck.year}" /></td>
                            <td><p data-placement="top" data-toggle="tooltip" title="Edit">
                                    <a href="${pageContext.request.contextPath}/TruckServlet?param1=${truck.id}">
                                        <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" >
                                            <span class="glyphicon glyphicon-pencil"></span></button></p></td>
                            <td><p data-placement="top" data-toggle="tooltip" title="Delete">
                                    <a href="${pageContext.request.contextPath}/TruckServlet?delete=${truck.id}">
                                        <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>
                        </tr>
                    </c:forEach>


                </tbody>
            </table>
        </div>
    </body>
</html>
