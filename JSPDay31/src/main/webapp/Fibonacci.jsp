<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Fibonacci.jsp" method="post">
Enter number to get the Fibonacci series : <input type type="text" name="num1"><br/>
<input type="submit" value="submit" />  
</form>
<hr>
<% 
if(request.getParameter("num1")!=null ){
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int t1=0,t2=1;
	int next=t1+t2;
	if(num1==0) {
		out.println(t1);
	}
	else if(num1==1) {
		out.println(t2);
	}
	else {
		out.println("The fibonacci series is "+"<br>");
		out.println(0+"<br>");
		
		out.println(1+"<br>");
	for(int i=3;i<=num1;i++) {
		
		t1=t2;
		t2=next;
		next=t1+t2;
		
		out.println(next+"<br>");
	}
	}
}
%>
</body>
</html>