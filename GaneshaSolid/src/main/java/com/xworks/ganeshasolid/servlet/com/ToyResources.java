package com.xworks.ganeshasolid.servlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

@WebServlet(urlPatterns = "/toy" ,loadOnStartup=2)
public class ToyResources extends HttpServlet{

	public ToyResources() {
		System.out.println(" Required Toys Information");
	}
	  
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("Name");
		String age=req.getParameter("Age");
		String quantity=req.getParameter("Quantity");
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Quantity is "+quantity);
		
		res.setContentType("text/plain");
		
		PrintWriter writer=res.getWriter();
		writer.println(name +"Information saved Sucessfully....");
		
	}
}
