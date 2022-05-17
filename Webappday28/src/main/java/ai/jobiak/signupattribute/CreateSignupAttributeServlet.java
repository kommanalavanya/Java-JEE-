package ai.jobiak.signupattribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class CreateSignupAttributeServlet
 */
@WebServlet("/signupdb")
public class CreateSignupAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSignupAttributeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
			try {
				 Connection con=connect();
				 
					
				
					String sql1="Select *from signup";
					Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ResultSet rs=st.executeQuery(sql1);
				
					rs.first();
					PrintWriter out=response.getWriter();
					ServletContext context=getServletContext();
						//out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getString(4)+"::"+rs.getString(5));
					context.setAttribute("fname", rs.getString(1));
					context.setAttribute("email", rs.getString(2));
					context.setAttribute("mobile",rs.getString(3));
					RequestDispatcher dispatcher=context.getRequestDispatcher("/readsignupdb");
				dispatcher.forward(request, response);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}		

		
	


}