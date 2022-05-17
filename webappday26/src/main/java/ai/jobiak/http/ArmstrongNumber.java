package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArmstrongNumber
 */
public class ArmstrongNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArmstrongNumber() {
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
		int temp=num1;
		int rem,res=0;
		while(temp!=0) {
			rem=temp%10;
			res+=Math.pow(rem, 3);
			temp/=10;
			
		}
		if(res==num1) {
			out.println("Your entered number is a Armstrong number");
		}
		else {
			out.println("Your entered number is not a Armstrong number");
		}
	
	}

}
