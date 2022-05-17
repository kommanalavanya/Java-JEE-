<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  name="calci" action="calculator.jsp" method="post">
input1 :<input type="text" name="avalue" ><br/>
input2 :<input type="text"  name="bvalue" ><br/>
Enter operator: <input type="text" name="op"><br>	
<input type="submit" value="submit" />    
</form> 
<hr/>
<% 
    if(request.getParameter("avalue")!=null && request.getParameter("bvalue")!=null){
int num1 = Integer.parseInt(request.getParameter("avalue"));
int num2 = Integer.parseInt(request.getParameter("bvalue"));
    
String op1 = request.getParameter("op"); 
int res=0;
if(op1.equals("+"))
	res=num1+num2;
if(op1.equals("-"))
	res=num1-num2;
if(op1.equals("*"))
	res=num1*num2;
if(op1.equals("/"))
	res=num1/num2;
if(op1.equals("%"))
	res=num1%num2;
out.println(res);
    }
%> 
               
                

                
   
</body>
</html>