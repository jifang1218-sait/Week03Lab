<%-- 
    Document   : agecalculator
    Created on : Jan 17, 2023, 12:49:06 PM
    Author     : jifang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form action="age" method="POST">
            <h1>Age Calculator</h1>
            <label for="ageField">Enter your age: </label>
            <input type="text" name="ageField" value="${age}"/><br>
            <input type="submit" value="Age next birthday"/>
        </form>
        ${result}<br>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
