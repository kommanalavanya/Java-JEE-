package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Scanner;
/**
 * Servlet implementation class ModifyCard
 */
@WebServlet("/modify")
public class ModifyCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyCard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    private Connection connect() throws Exception {
    	String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/onlineportal";
		Connection con=null;
		
		
			
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con=DriverManager.getConnection(url, userName, password);
			
		 
		return con;
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try {
			Connection con=connect();
			Statement stmt=con.createStatement();
			String sql="select *from aadhar";
			 out.println("Select any of the following Aadhar data to update");
			   
			 out.println("1.age");
				out.println("2.Gender");
			
				out.println("3.Email");
				out.println("4.DateofBirth");
				out.println("5.City");
				Scanner sc=new Scanner(System.in);
				int ch=sc.nextInt();
				out.println("enter your name");
				String editName=sc.next();
				switch(ch) {
				case 1:
				String sql1="UPDATE aadhar set name=editDoorNo where s";
				}
				String sql1="UPDATE aadhar set doorNo=editDoorNo where sid=id";
				 stmt.executeUpdate(sql1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
