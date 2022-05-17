<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="directive1.jsp" %>
<jsp:include page="action.jsp">
<jsp:param name="name" value="jsp"/>
</jsp:include>
<%@include file="directive2.jsp" %>
<!-- include directive is used for static content -->
<!-- include action is used for request or runtime -->
</body>
</html>