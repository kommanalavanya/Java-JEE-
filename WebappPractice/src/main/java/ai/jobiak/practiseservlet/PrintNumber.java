package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AreaOfSquare
 */
@WebServlet("/area")
public class PrintNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		
		int n1=(int) context.getAttribute("numb1");
		out.println("square of a number is "+(n1*n1));
		int n2=(int) context.getAttribute("numb2");
		out.println("cube of a number is "+(n2*n2*n2));
		int n3=(int) context.getAttribute("numb3");
		out.println("Square root of a number is "+Math.sqrt(n3));
		int n4=(int) context.getAttribute("numb4");
		out.println("The fourth number is "+n4);
	}

}
