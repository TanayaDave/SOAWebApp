<%@page import="java.util.List"%>
<%@page import="com.wsdl.Employee"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>

        </style>
        <title>Pricing</title>
    </head>
    <body>
        <jsp:include page="../navbar.jsp"></jsp:include>

        <div class="container">
            <h2>View Price</h2>
            <a href="${pageContext.request.contextPath}/views/pricing/addPricing.jsp">
                <button   style = float:right class="btn btn-primary ">Add Price</button>
            </a>
             <table class="table">
                <thead>
                    <tr>
                        <th>Location Code</th>
                        <th>Location Name</th>
                        <th>Price</th>

                    </tr>
                </thead>
                <tbody>
                    <tr>
                        
                        <c:forEach items="${requestScope.loclist}" var="loc">
                             <td><c:out value="${loc.locCode}" /></td>
                            <td><c:out value="${loc.locName}" /></td>
                            <td><c:out value="${loc.price}" /></td>
                            <td><p data-placement="top" data-toggle="tooltip" title="Edit"><a href="${pageContext.request.contextPath}/PricingServlet?param1=${loc.locId}">
                                        <button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></a>
                                </p></td>
                            <td><p data-placement="top" data-toggle="tooltip" title="Delete"><a href="${pageContext.request.contextPath}/PricingServlet?delete=${loc.locId}"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></a>
                                </p></td>
                        </tr>


                    </c:forEach>


                </tbody>
            </table>
        </div>

    </body>
</html>


