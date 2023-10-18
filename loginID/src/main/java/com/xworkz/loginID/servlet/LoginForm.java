package com.xworkz.loginID.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(urlPatterns = "/login", loadOnStartup = 1)
public class LoginForm extends HttpServlet{
	
	public LoginForm() {
		System.out.println("Created login Resources....");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userid=req.getParameter("userid");
		String password=req.getParameter("password");
		
		if (userid.equals("admin") && password.equals("secret")) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("loginSucess.jsp");
			req.setAttribute("userid",userid);
			dispatcher.forward(req, resp);
		} else {
			req.setAttribute("error", "LoginID are not matching...");
			RequestDispatcher dispatcher1 = req.getRequestDispatcher("loginUnsucess.jsp");
			dispatcher1.forward(req, resp);
		}
		
		
	
		
		
	
		
	}
	
}
