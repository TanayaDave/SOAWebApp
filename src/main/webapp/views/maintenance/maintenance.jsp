<%-- 
    Document   : maintenance
    Created on : Nov 13, 2017, 5:39:57 PM
    Author     : user
--%>
<%@page import="java.util.List"%>
<%@page import="com.wsdl.Maintenance"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Maintenance</title>
    </head>
    <body>
        <jsp:include page="../navbar.jsp"></jsp:include>
        <div class="container">
            <h2>View Maintenance</h2>
            <a href="${pageContext.request.contextPath}/views/maintenance/addMaintenance.jsp">
                <button   style = float:right class="btn btn-primary ">Add Maintenance</button>
            </a>
            <table class="table">
                <thead>
                    <tr>
                        <th>Date</th>                       
                        <th>Cost</th>
                        <th>Description</th>
                        <th>Status</th>                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                    <c:forEach items="${requestScope.mainlist}" var="maint">
                        
                            <td><c:out value="${maint.date}" /></td>
                            <td><c:out value="${maint.cost}" /></td>
                            <td><c:out value="${maint.desc}" /></td>
                            <td><c:out value="${maint.status}" /></td>                            
                            <td><p data-placement="top" data-toggle="tooltip" title="Edit"><a href="${pageContext.request.contextPath}/MaintenanceServlet?param1=${maint.id}">
                                        <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></a>
                                </p></td>
                            <td><p data-placement="top" data-toggle="tooltip" title="Delete"><a href="${pageContext.request.contextPath}/MaintenanceServlet?delete=${maint.id}">
                                        <button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></a>
                                </p></td>
                        </tr>


                    </c:forEach>


                </tbody>
            </table>
        </div>


    </body>
</html>
