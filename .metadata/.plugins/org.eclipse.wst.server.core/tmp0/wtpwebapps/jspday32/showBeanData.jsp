<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="UserBean" class="ai.jobiak.model.User" scope="request"></jsp:useBean>
<h3>Your Data is:{
 FirstName:<jsp:getProperty name="UserBean" property="fname" /><br>
 Email: <jsp:getProperty name="UserBean" property="email" /><br>
 Mobile: <jsp:getProperty name="UserBean" property="mobile" />
 }
 </h3>
</body>
</html>