<%-- 
    Document   : navbar
    Created on : Nov 9, 2017, 9:53:44 PM
    Author     : shrikantjesu
--%>
<script>
    function abc(event) {
        event.preventDefault();
        var href = event.currentTarget.getAttribute('href')
        window.location = '/SOAWebApp/' + href;
    }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">      
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="CSS/style.css">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Truck Shipping Company</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="welcome.jsp" onclick='abc(event);'>Home</a></li>
            <li><a href="views/truck/viewTrucks.jsp" onclick='abc(event);'>Trucks</a></li>      
             <li><a href="#">Customers</a></li>
            <li><a href="views/pricing/addPricing.jsp">Pricing</a></li>
            <li><a href="#">Generate Invoices</a></li>
            <li><a href="views/maintenance/addMaintenance.jsp">Maintenance</a></li>
            <li><a href="EmployeeServlet">Employees</a></li>
            <li><a href="#">View Comments</a></li>
        </ul>
    </div>
</nav> 

