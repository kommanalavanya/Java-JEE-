package ai.jobiak.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cook")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CookieServlet() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cookie ck1=new Cookie("user","lavanya");
		Cookie ck2=new Cookie("pwd","lav@123");
		response.addCookie(ck1);
		response.addCookie(ck2);
		Cookie ck[]=request.getCookies();
		if(ck1!=null) {
		for(int i=0;i<ck.length;i++) {
			out.println(ck[i].getName()+ck[i].getValue());
		}
		}
	}

}
