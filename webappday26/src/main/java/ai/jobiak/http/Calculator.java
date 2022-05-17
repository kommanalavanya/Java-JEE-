package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		 
	 }
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        PrintWriter out = response.getWriter();
                int num1 = Integer.parseInt(request.getParameter("avalue"));
                int num2 = Integer.parseInt(request.getParameter("bvalue"));
               
                String op1 = request.getParameter("op"); 
                int res=0;
                if(op1.equals("+"))
                	res=num1+num2;
                if(op1.equals("-"))
                	res=num1-num2;
                if(op1.equals("*"))
                	res=num1*num2;
                if(op1.equals("/"))
                	res=num1/num2;
                if(op1.equals("%"))
                	res=num1%num2;
                out.println(res);
      
        
	}

}
