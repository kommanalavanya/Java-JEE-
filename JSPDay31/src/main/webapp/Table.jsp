<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Table.jsp" method="post">
Enter number to get the Table: <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
int num1 = Integer.parseInt(request.getParameter("num1"));
for(int i=1;i<=12;i++) {
	out.println(num1+"*"+i+"="+(num1*i)+"<br>");
	
}
}
%> 
</body>
</html>