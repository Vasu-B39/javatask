package com.xworkz.contact.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/contact" , loadOnStartup = 1)
public class Contact extends HttpServlet{
	
	public Contact() {
		System.out.println("Created Contact Resources.........");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String cmt = req.getParameter("cmt");
		
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("mobile", mobile);
		req.setAttribute("cmt", cmt);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("contactSucess.jsp");
		dispatcher.forward(req, resp);

	}

}
