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
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Truck Shipping Company</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="welcome.jsp" onclick='abc(event);'>Home</a></li>
            <li><a href="TruckServlet" onclick='abc(event);'>Trucks</a></li>      
            <li><a href="#">Orders</a></li>
             <li><a href="#">Customers</a></li>
            <li><a href="PricingServlet" onclick='abc(event);'>Pricing</a></li>
            <li><a href="#">Generate Invoices</a></li>
            <li><a href="MaintenanceServlet">Maintenance</a></li>
            <li><a href="EmployeeServlet" onclick='abc(event);'>Employees</a></li>
            <li><a href="#">View Comments</a></li>
        </ul>
    </div>
</nav> 

