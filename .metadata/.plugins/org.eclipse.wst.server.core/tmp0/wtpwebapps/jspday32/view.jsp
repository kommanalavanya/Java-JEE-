<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<jsp:useBean id="c1" class="ai.jobiak.model.Contact" scope="request"></jsp:useBean>
<jsp:getProperty name="c1" property="cname" /><br>
<jsp:getProperty name="c1" property="cid" /><br>
<jsp:getProperty name="c1" property="phoneno" /><br>
<jsp:getProperty name="c1" property="email" /><br>

</body>
</html>