package ai.jobiak.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("/cart2")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		
		ArrayList<Product> itemsList=null;
		HttpSession shoppingCart=req.getSession();
		if(shoppingCart.isNew()) {
			itemsList=new ArrayList<>();
			shoppingCart.setAttribute("items", itemsList);
			
		}else {
			itemsList=(ArrayList<Product>)shoppingCart.getAttribute("items");
			Product p=new Product("AFJ101tR","XHW5 QuadCopter",5375.00);
			itemsList.add(p);
			for(Product product:itemsList) {
				out.println("<h3>Description: "+product.getDescription());
			}
		}
		
		
	}
	
}
