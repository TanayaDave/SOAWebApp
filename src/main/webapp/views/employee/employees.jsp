<%-- 
    Document   : employees
    Created on : Nov 8, 2017, 10:08:09 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="import" href="../nav.html">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="CSS/style.css">
        
        <title>Employees</title>
    </head>
    <body>
        <jsp:include page="../navbar.jsp"></jsp:include>
        <div class="main">
            <button type="button" onclick="ViewList()" class="btn btn-primary">View</button>
            <button type="button" class="btn btn-primary">Add</button>            
            <button type="button" class="btn btn-primary">Update</button>
            <button type="button" class="btn btn-primary">Delete</button> 
        </div>

        <script type="text/javascript">
            function ViewList()
            {
                document.getElementById("tbl").style.display = "table";
            }
        </script>


        </br></br></br></br>
        <table id="tbl" class="table table-striped table-bordered" style="display:none" cellspacing="0" width="100%"  >
            <tr>
                <td>Employee Id</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Role</td>
                <td>SSN</td>
                <td>Date of Birth</td>
                <td>Date Hired</td>
                <td>Address</td>
                <td>Phone Number</td>
                <td>Email</td>
                <td>Fax Number</td>    
            </tr>

            <form action="EmployeeServlet" method="get">
                <div class="main">
                    <button type="submit" name="checkbtn" value="1" class="btn btn-primary">View</button>
                    <button type="submit" name="checkbtn" value="2" class="btn btn-primary">Add</button>            
                    <button type="submit" name="checkbtn" value="3" class="btn btn-primary">Update</button>
                    <button type="submit" name="checkbtn" value="4" class="btn btn-primary">Delete</button> 
                </div>
            </form>



    </body>
</html>


