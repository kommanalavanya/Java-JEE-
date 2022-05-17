<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Palindrome.jsp" method="post">
Enter number to check if it is a Palindrome : <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int temp=num1;
	int rev=0;
	int rem;
	while(temp!=0) {
		 rem=temp%10;
		rev=(rev*10)+rem;
		temp=temp/10;
	}
	if(rev==num1) {
		out.println(num1+" is a palindrome");
	}
	else {
		out.println(num1+" number is not  a palindrome");
	}
}
%>
</body>
</html>