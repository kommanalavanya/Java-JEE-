package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet   {

	 public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		  
//		   PrintWriter out=res.getWriter();
//		   int res1=(int)req.getAttribute("res1");
//		   res1=res1*res1;
//		   out.println("Square of a number is"+res1);
		 HttpSession session=req.getSession();
		 int k=(int)session.getAttribute("k");
		 k=k*k;
		 PrintWriter out=res.getWriter();
		 
		 out.println("Square of a number is"+k);
		 
	 }
		   

}
