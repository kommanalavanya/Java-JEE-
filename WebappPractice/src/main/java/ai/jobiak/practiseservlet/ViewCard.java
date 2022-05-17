package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class ViewCard
 */
@WebServlet("/view")
public class ViewCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCard() {
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
			String sql="select *from aadhar";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				out.println("name:"+rs.getString(1));
				out.println("age:"+rs.getInt(2));
				out.println("gender:"+rs.getString(3));
				out.println("email:"+rs.getString(4));
				out.println("dateofbirth:"+rs.getString(5));
				out.println("city:"+rs.getString(6));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
