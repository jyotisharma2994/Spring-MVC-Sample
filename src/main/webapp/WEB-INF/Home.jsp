<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>AccountTracker</title>
</head>
<body>
<form name="frmHome" method="get" action="showHomepage">
    <div class=design01>
        <table border="2" align="center" width="1000">
            <h1>Account Tracking System</h1>

            <tr>
            <td align="center" wi><a href="showCreateNewAccount  "
                                     style="font-style: italic; font-size: 25px; color:#FFA500;">Create New Account</a>
            </td>
            <td align="center"><a href="showSearchAccountByID"
                                  style="font-style: italic; font-size: 25px; color:#FFA500;">Search Account by
                ID</a></td>
            <td align="center"><a href="showAllAccountsOrCustomersOnly"
                                  style="font-style: italic; font-size: 25px; color:#FFA500;">Display all Accounts
                or Customers only</a></td>
            <td align="center"><a href="showTransferFunds"
                                  style="font-style: italic; font-size: 25px; color:#FFA500;">Transfer Funds from
                one account to another</a></td>
            </tr>
        </table>

    </div>
</form>
</body>
</html>