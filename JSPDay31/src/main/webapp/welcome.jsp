<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a=10;
public int cube(int n){
	return n*n*n;
}
ArrayList<String> topics=new ArrayList<>();


%>
<h1>
<%=new String("Welcome Jobiak Java Giants+Hulks+Marvels")+a %>
</h1>
<h2>
<%out.println("You can write java in tags-which are known as scriplets/expressions/declarations/comments");
out.println(a);
%>

</h2>
<h3> 5^3 is:<%=cube(5) %></h3>
<h3>
<% 
topics.add("html,css,js");
topics.add("TYpeScript and Angular10");
topics.add("Spring,Spring Boot,Hibernate&JPA");
topics.add("Git,Jenkins,junit&aws");
for(String topic:topics){
out.println(topic+"<br>");
}
%>
<h3>Elements is ArrayList is <%=topics.size()%></h3>
</h3>
</body>
</html>