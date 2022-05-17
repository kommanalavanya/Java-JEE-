<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int count=0;
%>
<%
if(session.isNew()){
	session.setAttribute("visits",count+"");
}else{
	String counterstr=(String)session.getAttribute("visits");
	if(counterstr!=null){
		count=Integer.parseInt(counterstr);
	}
	count++;
	session.setAttribute("visits",count+"");
}
%>
<h2>You visited <%=count %></h2>
</body>
</html>