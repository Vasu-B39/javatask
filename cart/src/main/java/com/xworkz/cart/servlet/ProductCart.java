package com.xworkz.cart.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cart", loadOnStartup = 1)
public class ProductCart extends HttpServlet{
	
	public ProductCart() {
		System.out.println("Created Product Cart Resources...");
	}
	
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	String type = req.getParameter("type");
	String price = req.getParameter("price");
	String brand = req.getParameter("brand");
	String quantity = req.getParameter("quantity");
	
	System.out.println(name);
	System.out.println(type);
	System.out.println(price);
	System.out.println(brand);
	System.out.println(quantity);

	if (!price.isEmpty()) 
	{
		int updated_value = Integer.parseInt(price);
		int updated_quantity=Integer.parseInt(quantity);
		int total=updated_value*updated_quantity;
		
		
		req.setAttribute("name", name);
		req.setAttribute("type", type);
		req.setAttribute("price", price);
		req.setAttribute("brand", brand);
		req.setAttribute("quantity", quantity);
		req.setAttribute("Total", total);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("productSuccess.jsp");
		dispatcher.forward(req, resp);
	} 
	else
	{
		req.setAttribute("error", "Check Price");
		RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
		dispatcher.forward(req, resp);
	}
}
	

}
