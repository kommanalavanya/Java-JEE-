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
 * Servlet implementation class CubeServlet
 */
@WebServlet("/cube")
public class CubeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CubeServlet() {
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
		int n2=(int) context.getAttribute("numb2");
		//out.println("cube of"+n2+"is "+(n2*n2*n2));
		context.setAttribute("numb2", n2);
		int n1=(int) context.getAttribute("numb1");
		context.setAttribute("numb1", n1);
		int n3=(int) context.getAttribute("numb3");
		context.setAttribute("numb3", n3);
		int n4=(int) context.getAttribute("numb4");
		context.setAttribute("numb4", n4);
		
		RequestDispatcher rd=context.getRequestDispatcher("/root");
		rd.forward(request, response);
	}

}
