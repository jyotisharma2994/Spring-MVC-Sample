<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h1>search Account By ID</h1>
<form action="getAccountBalance" method="get">
    <table style="with: 50%">
        <tr>
            <td>Enter Account ID</td><td><input type="text" name="acID" /></td></tr>
    </table>
    <input type="submit" value="SEARCH" />
</form>
<a href="showHomePage"  style="font-style: italic; font-size: 25px; color:#FFA500;">HomePage</a>

</body>
</html>