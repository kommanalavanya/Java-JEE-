package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SigninForm
 */
@WebServlet("/signin")
public class SigninForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninForm() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		String fname=request.getParameter("fname");
		String Phone=request.getParameter("phone");
		String Email=request.getParameter("email");
	
		int count=0;
		try {
			Connection con=connect();
			
			PreparedStatement ps=con.prepareStatement("insert into signin values(?,?,?)");
			ps.setString(1,fname);
			ps.setString(2, Phone);
			ps.setString(3, Email);
			count=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//response.getWriter().println(count+"record inserted");
		ServletContext context=getServletContext();
		context.setAttribute("Name",fname );
		context.setAttribute("Mobhile",Phone);
		context.setAttribute("Email", Email);
		RequestDispatcher rd=context.getRequestDispatcher("/print?admin=jyo");
		rd.forward(request, response);
	}

		
		
		
		
		
		
		
		
		
		
		
	

}
