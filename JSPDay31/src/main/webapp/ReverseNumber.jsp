<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ReverseNumber.jsp" method="post">
Enter number to get the Reverse of it: <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int temp=num1;
	int rev=0;
	while(temp!=0) {
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	out.println("The reverse of a number is "+rev);
}
%> 
</body>
</html>