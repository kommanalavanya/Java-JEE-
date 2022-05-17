package ai.jobiak.practiseservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet 
{
   public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	   int i=Integer.parseInt(req.getParameter("num1"));
	   int j=Integer.parseInt(req.getParameter("num2"));
	   int k=i+j;
//	   HttpSession session=req.getSession();
//	   session.setAttribute("k", k);
//	   res.sendRedirect("sq");
	   
	   
//	   PrintWriter out=res.getWriter();
//	req.setAttribute("res1",res1);
//	   RequestDispatcher rd=req.getRequestDispatcher("sq");
//	   rd.forward(req, res);
	      
   }
}
