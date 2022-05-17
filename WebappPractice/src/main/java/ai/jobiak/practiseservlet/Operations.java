package ai.jobiak.practiseservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Operations
 */
@WebServlet("/operation")
public class Operations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Operations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		int n1=2,n2=3,n3=4,n4=5;
		context.setAttribute("num1", n1);
		context.setAttribute("num2", n2);
		context.setAttribute("num3", n3);
		context.setAttribute("num4", n4);
		RequestDispatcher rd=context.getRequestDispatcher("/square");
		rd.forward(request, response);
	}

}
