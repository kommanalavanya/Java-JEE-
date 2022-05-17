<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Factorial.jsp" method="post">
Enter number to get the factorial: <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
int num1 = Integer.parseInt(request.getParameter("num1"));
int fact=1;
for(int i=1;i<=num1;i++) {
	fact*=i;
}
out.println("The factorial  is"+fact);

}
%> 
</body>
</html>