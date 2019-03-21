<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h1>Create New Account Form</h1>

<hr>
<form action="saveCreateNewAccount" method="post">
    <table style="with: 100%", border="2", align="center">
        <tr>
            <td>Customer Name</td>
            <td><input type="text" name="customerName"required="required"/><br></td>
        </tr>

        <tr>
            <td>Account Balance</td>
            <td><input type="text" name="accountBalance" required="required"/><br></td>
        </tr>
    </table>
    <input type="submit" value="SAVE" action=""/>
</form>

<a href="showHomePage" style="font-style: italic; font-size: 25px; color:#FFA500;">HomePage</a>
</body>
</html>