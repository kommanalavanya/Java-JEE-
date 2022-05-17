<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Forward tag</h2>
<jsp:forward page="forward2.jsp">
<h2>Using Parameter</h2>
<jsp:param name="name" value="lavanya"/>
</jsp:forward>


</body>
</html>