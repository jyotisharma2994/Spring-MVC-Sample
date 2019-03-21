<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h1>Display All Accounts Or Customers Form</h1>
<form action="displayAccountOrCustomer" method="get">
    <p><input type="radio" name="account" value="account">Account</p>
    <p><input type="radio" name="customer" value="customer">Customer</p>
    <input type="submit" value="Submit">
</form>
<a href="showHomePage" style="font-style: italic; font-size: 25px; color:#FFA500;">HomePage</a>
</body>
</html>