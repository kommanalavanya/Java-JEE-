<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PrimeNumber.jsp" method="post">
Enter number to check if it is a PrimeNumber: <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
	int num1 = Integer.parseInt(request.getParameter("num1"));
	 boolean flag = false;
	    for (int i = 2; i <= num1 / 2; ++i) {
	      // condition for nonprime number
	      if (num1% i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	     out.println(num1 + " is a prime number.");
	    else
	    out.println(num1 + " is not a prime number.");

}
%> 
</body>
</html>