<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*"%>
<%!
int id;
String email,phoneno,name;

%>
<jsp:useBean id="c1" class="ai.jobiak.model.Contact" scope="request"> </jsp:useBean>
 <jsp:setProperty name="c1" property="cname" param="cname" />
 <jsp:setProperty name="c1" property="cid" param="cid"/>
 <jsp:setProperty name="c1" property="phoneno" param="phoneno"/>
  <jsp:setProperty name="c1" property="email" param="email"/>
  <%
try {
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/employee";
	Connection con=null;
	
	
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con=DriverManager.getConnection(url, userName, password);
	 
	 PreparedStatement ps=con.prepareStatement("insert into contact values(?,?,?,?)");
	  id=Integer.parseInt(request.getParameter("cid"));
	  email=request.getParameter("email");
	  phoneno=request.getParameter("phoneno");
	  name=request.getParameter("cname");
	  ps.setString(1,name);
	  ps.setInt(2,id);
	  ps.setString(3,phoneno);
	  ps.setString(4,email);
	ps.executeUpdate();
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

%>
   <jsp:forward page="view.jsp" ></jsp:forward>
  
</body>
</html>