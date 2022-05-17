<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<h2>Check</h2>
 <jsp:useBean id="UserBean" class="ai.jobiak.model.User" scope="request"> </jsp:useBean>
 <jsp:setProperty name="UserBean" property="fname" param="fname" />
 <jsp:setProperty name="UserBean" property="email" param="email"/>
 <jsp:setProperty name="UserBean" property="mobile" param="mobile"/>

 <jsp:forward page="showBeanData.jsp" ></jsp:forward>
</body>
</html>