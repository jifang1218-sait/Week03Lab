<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 17, 2023, 1:58:45 PM
    Author     : jifang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <label for="fieldFirst">First: </label>
            <input type="text" name="fieldFirst" value="${first}"/><br>
            <label for="fieldSecond">Second: </label>
            <input type="text" name="fieldSecond" value="${second}"/><br>
            <input type="submit" name="action" value="+">
            <input type="submit" name="action" value="-">        
            <input type="submit" name="action" value="*">        
            <input type="submit" name="action" value="%">
        </form><br>
        Result: ${result}<br>
        <a href="age">Age Calculator</a>
    </body>
</html>
