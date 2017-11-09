<%-- 
    Document   : addEmployee
    Created on : Nov 9, 2017, 1:16:31 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" href="CSS/style.css">
        <title>Add Employee</title>
    </head>
    <body>
        
         <div class="main">
                <button type="button"  class="btn btn-primary">View</button>
                <button type="button" onclick="AddEmp()" class="btn btn-primary">Add</button>            
                <button type="button" class="btn btn-primary">Update</button>
                <button type="button" class="btn btn-primary">Delete</button> 
        </div>
        
        
         </br></br></br></br>
            <table id="tbl" class="table table-striped table-bordered"  cellspacing="0" width="100%"  >
                <br/><br/><tr><td></td></tr> 
            <tr>
                <td><center><input type="text"required placeholder="First Name" name="First" maxlength="19">
                <input type="text"required  placeholder="Last Name"  name="Last" maxlength="19"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Role" name="Role" maxlength="20"></center></td></tr>
<tr><td><center><input type="text" required placeholder="SSN" name="SSN" maxlength="10"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Date of Birth" name="DateBirth" maxlength="20"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Date of Hired" name="DateHired" maxlength="20"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Address Line 1" name="Address1" maxlength="40">
    <input type="text" required placeholder="Address Line 2" name="Address2" maxlength="40"></center></td></tr>
<tr><td><center><input type="text" required placeholder="City" name="City" maxlength="40">
    <input type="text" required placeholder="State" name="State" maxlength="40"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Zip" name="Zip" maxlength="5"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Phone Number" name="PhoneNumber" maxlength="10">
    <input type="text" required placeholder="Alt Phone Number" name="AltPhoneNumber" maxlength="10"></center></td></tr>
<tr><td><center><input type="text" required placeholder="Email" name="Email" maxlength="40">
    <input type="text" required placeholder="Fax Number" name="FaxNumber" maxlength="10"></center></td></tr>
            <tr><td><center><input type="submit" id="submit" value="Add"></center></td></tr> 
            </table>
      
    </body>
</html>
