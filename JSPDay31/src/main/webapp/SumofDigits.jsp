<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SumofDigits.jsp" method="post">
Enter number to get Sum of Digits : <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int sum=0;
	  while (num1 != 0)
      {
          sum = sum + num1 % 10;
          num1 = num1/10;
      }
	  out.println("The sum of digits is "+sum);
}
%> 
</body>
</html>