package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SquareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		
		int n1=(int) context.getAttribute("num1");
		context.setAttribute("numb1", n1);
		//out.println("square of"+n1+"is "+(n1*n1));
		int n2=(int) context.getAttribute("num2");
		context.setAttribute("numb2", n2);
		int n3=(int) context.getAttribute("num3");
		context.setAttribute("numb3", n3);
		int n4=(int) context.getAttribute("num4");
		context.setAttribute("numb4", n4);
		RequestDispatcher rd=context.getRequestDispatcher("/cube");
		rd.forward(request, response);
		int contextCounter=Integer.parseInt(context.getInitParameter("counter"));
	}

}
