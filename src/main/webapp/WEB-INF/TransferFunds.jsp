<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="frmTransferFunds" method="post" action="transferFunds1">

    <table border="1" align="center" width=500 style="background-color: black;">
        <tr style="color:white; text-align:center; font-size: 25px;" >
            <td>Transfer funds from Account ID(Sender's) </td><td><input type="text" name="senderAccountId"></td>
        </tr>

        <tr style="color:white; text-align:center; font-size: 25px;" >
            <td>Transfer funds to Account ID(Receiver's) </td><td><input type="text" name="receiverAccountId"></td>
        </tr>

        <tr style="color:white; text-align:center; font-size: 25px;" >
            <td>Amount to be transferred</td><td><input type="text" name="balance"></td>
        </tr>

        <tr>
            <td align="center" colspan="2" height="50"><input type="submit" name="btnOperation" value="TRANSFER" action="" style="font-size: 25px; font-family: times;"></td>
        </tr>

    </table>
</form>
<a href="showHomePage"  style="font-style: italic; font-size: 25px; color:#FFA500;">HomePage</a>
</body>
</html>
