package com.xworkz.loginID.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/address", loadOnStartup = 2)
public class Address  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String hnum=req.getParameter("hnum");
		String village=req.getParameter("village");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		
	
		
		req.setAttribute("hnum", hnum);
		req.setAttribute("village", village);
		req.setAttribute("city", city);
		req.setAttribute("state", state);
		req.setAttribute("country", country);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("addressDisplay.jsp");
		dispatcher.forward(req, resp);
	}
	

}
