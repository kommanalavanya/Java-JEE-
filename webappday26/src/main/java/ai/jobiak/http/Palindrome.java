package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Palindrome
 */
public class Palindrome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Palindrome() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		PrintWriter out=response.getWriter();
		int temp=num1;
		int rev=0;
		int rem;
		while(temp!=0) {
			 rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(rev==num1) {
			out.println("Entered number is a palindrome");
		}
		else {
			out.println("Entered number is not  a palindrome");
		}
		
	}

}
