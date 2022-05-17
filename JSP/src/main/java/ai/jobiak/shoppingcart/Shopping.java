package ai.jobiak.shoppingcart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;

/**
 * Servlet implementation class Shopping
 */
@WebServlet("/shop")
public class Shopping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Shopping() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private ArrayList<Product> getProducts() throws SQLException
    {
    	 String userName="root";
         String password="admin";
         String url="jdbc:mysql://localhost:3306/world";
         
         try
 		{
 		Class.forName("com.mysql.cj.jdbc.Driver");
 		}catch (ClassNotFoundException e) {
 	        e.printStackTrace();
 		}
         Connection con=DriverManager.getConnection(url,userName,password);
         Statement stmt=con.createStatement();
         String selectSQL="select *from products";
         ResultSet rs=stmt.executeQuery(selectSQL);
         int i=0;
         ArrayList<Product> totalItemsList=new ArrayList<Product>();
         Product p=null;
         while(rs.next())
         {
        	  p=new Product(rs.getString(1),rs.getString(2),rs.getDouble(3));
        	  totalItemsList.add(p);
         }
         return totalItemsList;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//out.println("database");
		response.setContentType("text/html");
		try {
			ArrayList<Product> totalItemsList = getProducts();
			for(Product product:totalItemsList)
			{
			out.println("<a href='shop?item="+product.getProductId()+"&option=add'> Add item"+product.getProductId()+"</a><br>");
			}
		
		if(request.getQueryString()!=null)
		{
		String QueryStr=request.getQueryString();
		String array[]=QueryStr.split("&");
		String productId=array[0].split("=")[1];
		String option=array[1].split("=")[1];
		
		HttpSession shoppingCart=request.getSession(); 
		ArrayList<Product> selecteditemList=null; 
		if(option.equals("add"))
		{
		if(shoppingCart.isNew())
		{ selecteditemList=new ArrayList<Product>();
		shoppingCart.setAttribute("items",selecteditemList); 
		}
		else {
		  selecteditemList=(ArrayList<Product>) shoppingCart.getAttribute("items"); 
		  for(Product product:totalItemsList)
		  {
			  if(product.getProductId().equals(productId))
			  {
				  selecteditemList.add(product);
				  break;
			  }
		  }
		  shoppingCart.setAttribute("items",selecteditemList); 
		  out.println("<h2>Items in your cart are.....</h2>");
		  for(Product product:selecteditemList)
			{
				out.println("Product Id :"+product.getProductId()+" Name : "+product.getDescription()+" Price : "+product.getPrice()+"<br>");
			}
		  }
		}
		else if(option.equals("remove"))
		{
			selecteditemList=(ArrayList<Product>) shoppingCart.getAttribute("items");
			selecteditemList.remove(productId);
			 for(int i=0;i<selecteditemList.size();i++) 
			  {
			        if(selecteditemList.get(i).getProductId().equals(productId))
			        	selecteditemList.remove(i);
			  } 
			 out.println("<h2>Items in your cart are.....</h2>");
			 for(Product product:selecteditemList)
				{
			      out.println("Product Id : "+product.getProductId()+ " Name : "+product.getDescription()+" Price : "+product.getPrice()+"<br>");
				}
		}
		   
		  double value=0;
		  if(selecteditemList.size()>0) 
		  { for(Product product:selecteditemList) 
		  {
		  out.println("<a href='shop?item="+product.getProductId() +"&option=remove'> remove item"+product.getProductId()+"</a><br>");
		  value+=product.getPrice(); 
		  } 
		  }
		  out.println("<h2>Cart size is #"+selecteditemList.size()+"</h2>");
		  out.println("<h2>Cart value is #"+value+"</h2>");
		} }catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
