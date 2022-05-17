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
 * Servlet implementation class MainServlet
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		int n1=Integer.parseInt(request.getParameter("avalue"));
		int n2=Integer.parseInt(request.getParameter("bvalue"));
		String op1 = request.getParameter("op"); 
		context.setAttribute("numb1", n1);
		context.setAttribute("numb2", n2);
		context.setAttribute("op2", op1);
		RequestDispatcher rd=context.getRequestDispatcher("/calci");
		rd.forward(request, response);
	}

}
