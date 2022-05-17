<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For Example</title>
</head>
<body>
<h2>Enter your Data</h2>
<form name="signupform" action="form.jsp" method="post">
Enter First Name: <input type="text" name="fname"><br><br>
Enter email: <input type="text" name="email"><br><br>
Enter mobile: <input type="text" name="mobile"><br><br>	
Click to send data<input type="submit" value="send"><br>
<input type="reset"  value="clear">
</form>
<hr/>
FirstName:<%=request.getParameter("fname") %><br>
Email:<%=request.getParameter("email") %><br>
Mobile:<%=request.getParameter("mobile") %><br>


<hr/>
</body>
</html>