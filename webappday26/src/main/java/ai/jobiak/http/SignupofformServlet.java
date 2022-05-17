package ai.jobiak.http;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupofformServlet
 */

public class SignupofformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupofformServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws Exception 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    private Connection connect() throws Exception {
    	String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=null;
		
		
			
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con=DriverManager.getConnection(url, userName, password);
			
		 
		return con;
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fnamestr=request.getParameter("fname");
		String emailstr=request.getParameter("email");
		String mobilestr=request.getParameter("mobhile");
		int count=0;
		try {
			Connection con=connect();
			
			PreparedStatement ps=con.prepareStatement("insert into signup values(?,?,?)");
			ps.setString(1,fnamestr);
			ps.setString(2, emailstr);
			ps.setString(3, mobilestr);
			count=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().println(count+"record inserted");
	}

}
