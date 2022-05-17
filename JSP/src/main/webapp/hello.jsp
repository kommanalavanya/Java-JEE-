<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Scriptlet tag</h2>
<%
String name=request.getParameter("uname");
out.println("welcome "+name);
%>
<h2>Expression tag</h2>
<%="welcome "+request.getParameter("uname") %>
<h2>Declaration tag</h2>
<%!int data=50; %>
<%="the value is "+data %>
<h2>Declaring method</h2>
<%!int cube(int n){
	return n*n*n;
	
}
	
	%>
<%="cube of 3 is "+cube(3) %>
</body>
</html>