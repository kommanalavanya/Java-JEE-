package ai.jobiak.attributes;

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
 * Servlet implementation class CreateAttributeServlet
 */
@WebServlet("/attribute")
public class CreateAttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAttributeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	ServletContext context=getServletContext();
	context.setAttribute("dbName","mySql");
	context.setAttribute("dbVersion","8.0.28");
	request.setAttribute("jdk","17.01");//will be alive till the request is in progress on server side
	request.setAttribute("Os","Windows 10");//they are lost once the response is sent to client
	RequestDispatcher dispatcher=context.getRequestDispatcher("/readattribute");
	dispatcher.forward(request, response);
	
		
	}

}
