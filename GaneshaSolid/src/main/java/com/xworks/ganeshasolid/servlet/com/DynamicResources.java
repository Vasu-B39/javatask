package com.xworks.ganeshasolid.servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/vasu" ,loadOnStartup=1)
public class DynamicResources extends HttpServlet{
	
	public DynamicResources()
	{
		System.out.println("Created Dyanamic Resource");
	}
	
	@Override
	public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
	{
		System.out.println("Testing Servlet in Dynamic Resources");
	}
 
}
