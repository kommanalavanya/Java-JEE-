package ai.jobiak.webapp;

import java.io.*;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet implements Servlet {

	

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
	try {
		System.out.println("entered init");
		FileOutputStream fos=new FileOutputStream("Hello.txt");
		fos.write("this is added in init to demonstrate the timing of init  method".getBytes());
		fos.close();
		System.out.println("exited init");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	res.getWriter().println("this is from servise.......");

	}
	@Override
	public void destroy() {
		//cleanupwork-serialization
		try {
			System.out.println("entered destroy()");
			FileOutputStream fos=new FileOutputStream("Hello.txt",true);//true for appending the text
			fos.write("this is added in destroy to demonstrate the timing of destroy  method".getBytes());
			fos.close();
			System.out.println("exited destroy");
			Thread.currentThread().join();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
