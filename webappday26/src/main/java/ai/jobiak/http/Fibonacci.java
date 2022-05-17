package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fibonacci
 */
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fibonacci() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(request.getParameter("num1"));
		PrintWriter out=response.getWriter();
	    
		int t1=0,t2=1;
		int next=t1+t2;
		if(num1==0) {
			out.println(t1);
		}
		else if(num1==1) {
			out.println(t2);
		}
		else {
			out.println(0);
			out.println(1);
		for(int i=3;i<=num1;i++) {
			
			t1=t2;
			t2=next;
			next=t1+t2;
			out.println(next);
		}
		}
		
	}

}
