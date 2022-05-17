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
 * Servlet implementation class Calculator
 */
@WebServlet("/calci")
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 PrintWriter out=response.getWriter();
			ServletContext context=getServletContext();
			int num1=(int) context.getAttribute("numb1");
			int num2=(int) context.getAttribute("numb2");
			String op1=(String)context.getAttribute("op2");
        
        
         
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
