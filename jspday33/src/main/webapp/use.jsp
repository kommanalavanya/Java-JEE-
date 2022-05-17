<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="demonstrates include directive vs standard action include"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="source2.jsp" %>
<h3>
I am using source.jsp
<jsp:include page="source.jsp"></jsp:include> <!-- used for request or runtime -->
</h3>
<h2>

<jsp:include page="source.jsp"></jsp:include>
</h2>
<%@include file="source3.jsp" %>  <!-- used for static content -->
</body>
</html>