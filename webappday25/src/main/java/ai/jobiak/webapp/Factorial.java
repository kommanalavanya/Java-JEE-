package ai.jobiak.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.*;

public class Factorial implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

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
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		out.println("The factorial of 5 is"+fact);
		ArrayList<String> list=new ArrayList<>();
		list.add("Orange");
		list.add("blue");
		list.add("pink");
		for(String color:list) {
			out.println(color+"::"+color.length());
		}
		HashMap<String,String> techInventors=new HashMap();
		techInventors.put("java","James gosling");
		techInventors.put("Cpp", "Bjarnee strousstrup");
		techInventors.put("C", "Dennis Ritchie");
		techInventors.put("Linux", "Linux Trava");
		techInventors.put("Microsoft", "Billgates");
		techInventors.put("faceboon", "Mark Zuckerberg");
		out.println(techInventors);
		
		Set<String> Keys=techInventors.keySet();
		for(String key:Keys) {
			out.println(techInventors.get(key)+" length of value->"+techInventors.get(key).length());
			
		}
		
		

	}

}
