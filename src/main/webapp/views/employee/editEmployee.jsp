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
        <title>Edit Employee</title>
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
              <a href="${pageContext.request.contextPath}/EmployeeServlet">
             <button  name = "back" class="well" type="button" id="Back">Back</button>
              </a>
            <div class="col-lg-12 well">
                <div class="row">
                    <form action="${pageContext.request.contextPath}/EmployeeServlet" method="post">
                        <c:forEach items="${requestScope.emp}" var="emp">
                            <input type="hidden" name="update" value="${emp.id}">

                            <div class="col-sm-12">
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>First Name</label>
                                        <input type="text" name="FName" value="<c:out value="${emp.empFirstName}"/>" placeholder="Enter First Name Here.." class="form-control">
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label>Last Name</label>
                                        <input type="text" name="LName" value="<c:out value="${emp.empLastName}"/>" placeholder="Enter Last Name Here.." class="form-control">
                                    </div>
                                </div>		
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Date of Birth</label>
                                        <input type="text" id="DOB" name="DOB" value="<c:out value="${emp.dob}"/>" placeholder="DD-MM-YYYY" class="form-control">
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label>Date of Hire</label>
                                        <input type="text" id="DOH" name="DOH" value="<c:out value="${emp.dateHired}"/>"  placeholder="DD-MM-YYYY" class="form-control">
                                    </div>
                                </div>	
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Address Line 1</label>
                                        <input type="text" name="AddrL1" value="<c:out value="${emp.address.addressLine1}"/>"  placeholder="Enter Address Line 1 Here.." class="form-control">
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label>Address Line 2</label>
                                        <input type="text" name="AddrL2" value="<c:out value="${emp.address.addressLine2}"/>"  placeholder="Enter Address Line 2 Here.." class="form-control">
                                    </div>
                                </div>	
                                <div class="row">
                                    <div class="col-sm-4 form-group">
                                        <label>City</label>
                                        <input type="text" name="City" value="<c:out value="${emp.address.city}"/>" placeholder="Enter City Name Here.." class="form-control">
                                    </div>	
                                    <div class="col-sm-4 form-group">
                                        <label>State</label>
                                        <input type="text" name="State" value="<c:out value="${emp.address.state}"/>" placeholder="Enter State Name Here.." class="form-control">
                                    </div>	
                                    <div class="col-sm-4 form-group">
                                        <label>Zip</label>
                                        <input type="text" name="Zip" name="Zip" value="<c:out value="${emp.address.zip}"/>" placeholder="Enter Zip Code Here.." class="form-control">
                                    </div>		
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Role</label>
                                        <input type="text" name="Role" value="<c:out value="${emp.role}"/>"  placeholder="Enter Designation Here.." class="form-control">
                                    </div>		
                                    <div class="col-sm-6 form-group">
                                        <label>SSN</label>
                                        <input type="text" name="SSN"  value="<c:out value="${emp.ssn}"/>" name="SSN" placeholder="Enter SSN Here.." class="form-control">
                                    </div>	
                                </div>						
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Phone Number</label>
                                        <input type="text" name="PNo" value="<c:out value="${emp.cotactDetails.phoneNumber}"/>" placeholder="Enter Phone Number Here.." class="form-control">
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label>Alternate Phone Number</label>
                                        <input type="text" name="APNo" value="<c:out value="${emp.cotactDetails.altPhoneNumber}"/>" placeholder="Enter Alternate Phone Number Here.." class="form-control">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-6 form-group">
                                        <label>Email Address</label>
                                        <input type="text" name="EAddr" value="<c:out value="${emp.cotactDetails.email}"/>" placeholder="Enter Email Address Here.." class="form-control">
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label>Fax Number</label>
                                        <input type="text" id="FNo" value="<c:out value="${emp.cotactDetails.faxNumber}"/>" name="FNo" placeholder="Enter Fax Number Here.." class="form-control">
                                    </div>
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
