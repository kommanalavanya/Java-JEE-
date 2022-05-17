package ai.jobiak.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterCookie
 */
@WebServlet("/counter")
public class CounterCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int count=1;
		int begin=0;
		if(begin==0) {
		Cookie counterCookie=new Cookie("Visits",count+"");
		response.addCookie(counterCookie);
		out.println("count="+count);
		begin++;
		}
		Cookie cookies[]=request.getCookies();
		
		if(cookies!=null) {
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().equals("Visits")) {
				
				int cookieCounter=Integer.parseInt(cookies[i].getValue());
				count=++cookieCounter;
			}
		
		
		
		}
		Cookie counterCookie=new Cookie("Visits",count+"");
		response.setContentType("text/html");
		response.addCookie(counterCookie);
		out.println("<h2>count="+count+"</h2>");
		}	
		
	}

}
