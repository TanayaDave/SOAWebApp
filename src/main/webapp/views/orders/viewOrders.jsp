<%-- 
    Document   : addComments
    Created on : Nov 12, 2017, 10:38:45 PM
    Author     : user
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Add Comments</title>    </head>
    <body>
        <jsp:include page="../navbar.jsp"></jsp:include>
            <div class="container">
                <h2>View Orders</h2>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Order Id</th>
                            <th>Order Date</th>
                            <th>Customer Name</th>
                            <th>Location From</th>
                            <th>Location To</th>
                            <th>VIN</th>
                            <th>Amount</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                        <c:forEach items="${requestScope.orderList}" var="order">
                            <td><c:out value="${order.orderId}" /></td>
                            <td><c:out value="${order.orderDate}" /></td>
                            <td><c:out value="${order.locFrom}" /></td>
                            <td><c:out value="${order.locTo}" /></td>
                            <td><c:out value="${order.custName}" /></td>
                            <td><c:out value="${order.vin}" /></td>
                            <td><c:out value="${order.amt}" /></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
