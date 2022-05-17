<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String str=request.getParameter("uname");
out.println(str);
pageContext.setAttribute("user",str,PageContext.SESSION_SCOPE);
%>
<h2>Page Directive</h2>
<%@page import ="java.util.Date" %>
Today is <%=new Date() %>
<a href="pagecontext2.jsp">second page</a>  
</body>
</html>