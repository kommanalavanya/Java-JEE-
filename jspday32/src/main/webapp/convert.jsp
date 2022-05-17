<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="ai.jobiak.model.Contact"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>

<%


String userName = "root";
String password = "admin";
String url = "jdbc:mysql://localhost:3306/employee";
Connection con=null;
ArrayList<Contact> contactList=new ArrayList<>();
try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection(url,userName, password);
			Statement st=con.createStatement();
			String sql="select *from contact";
			ResultSet rs=st.executeQuery(sql);
while(rs.next())
{
Contact c1=new Contact(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
contactList.add(c1);
} 
rs=st.executeQuery(sql);
int count=0;

while(rs.next()){
	count=count+1;
}
if(count==contactList.size()){
	for(int i=0;i<contactList.size();i++){
		out.println(contactList.get(i));
	}
}
else{
	out.println("Size of the arrayList is not equal to no. of records in the table");
}
}catch (Exception e) { 
 e.printStackTrace(); 
 }
finally {
	if(con!=null){
		try{
			con.close();
		}catch (Exception e) { 
			 e.printStackTrace(); 
			 }
	}
}

%>
</body>
</html>