<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ArmstrongNumber.jsp" method="post">
Enter number to check if it is a Armstrong Number : <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int temp=num1;
	int rem,res=0;
	while(temp!=0) {
		rem=temp%10;
		res+=Math.pow(rem, 3);
		temp/=10;
		
	}
	if(res==num1) {
		out.println(num1+" is a Armstrong number");
	}
	else {
		out.println("Your entered number is not a Armstrong number");
	}
}
%> 
</body>
</html>