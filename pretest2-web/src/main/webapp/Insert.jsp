<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/5/2023
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Insert Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="Container">
<h2>Inser new Employee</h2>
<form action="employee" method="post" class="form-group">
    <p class="row">
        <label class="col-4">Employee Id:</label>
        <input name="employeeId" type="text" placeholder="Input Employee ID" class="col-4">
    </p>
    <p class="row">
        <label class="col-4">Employee Name:</label>
        <input name="employeeName" type="text" placeholder="Input Employee Name" class="col-4">
    </p>
    <p class="row">
        <label class="col-4">Add Employee existing in Company table:</label>
        <input name="companyName" type="text" placeholder="Input Company Name" class="col-4">
    </p>
    <p class="row">
        <label class="col-4">Add Employee without in Company table:</label>
    </p>
    <p class="row">
        <label class="col-4">Company Id:</label>
        <input name="companyId" type="text" placeholder="Input Company ID" class="col-4">
    </p>
    <p class="row">
        <label class="col-4">Company Name:</label>
        <input name="companyName" type="text" placeholder="Input Company Name" class="col-4">
    </p>
    <p class="text-center">
        <input type="submit" name="action" value="Create">
    </p>
</form>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
