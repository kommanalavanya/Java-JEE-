package ai.jobiak.http;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws Exception 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private Connection connect() throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/onlineportal";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		return con;
		
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("FROMNAME");
		String subject=request.getParameter("SUBJECT");
		String content=request.getParameter("CONTENT");
		String size=request.getParameter("SIZE");
		response.getWriter().println(fname+subject+content+size);
		
			Connection con=null;
			try {
				con = connect();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		int count=0;
		try {
			PreparedStatement pst=con.prepareStatement("insert into signup values(?,?,?)");
			pst.setString(1,fname);
			pst.setString(2,subject);
			pst.setString(3,content);
			pst.setString(4,size);
		count=	pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-g
	}

		
		
		
	}

}
