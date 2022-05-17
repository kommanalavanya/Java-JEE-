package ai.jobiak.practiseservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class ApplyAadharCard
 */
@WebServlet("/apply")
public class ApplyAadharCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyAadharCard() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("name");
		int agestr=Integer.parseInt(request.getParameter("age"));
		String genderstr=request.getParameter("gender");
		String emailstr=request.getParameter("email");
		String datestr=request.getParameter("date");
		String citystr=request.getParameter("city");
		int count=0;
		try {
			Connection con=connect();
			
			PreparedStatement ps=con.prepareStatement("insert into aadhar values(?,?,?,?,?,?)");
			ps.setString(1,fname);
			ps.setInt(2, agestr);
			ps.setString(3, genderstr);
			ps.setString(4, emailstr);
			ps.setString(5, datestr);
			ps.setString(6, citystr);
			count=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
