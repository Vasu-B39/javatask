package com.xworkz.absentSucess.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/loan", loadOnStartup = 1)
public class Loan extends HttpServlet{
	
	public Loan() {
		System.out.println("Created loan Servlet...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String amount=req.getParameter("amount");
		String working=req.getParameter("working");
		String interest=req.getParameter("interest");
		String shurity=req.getParameter("shurity");
		String company=req.getParameter("company");
		String loanTenure=req.getParameter("loanTenure");
		String loanType=req.getParameter("loanType");
		String terms=req.getParameter("terms");
		
		req.setAttribute("name", name);
		req.setAttribute("amount", amount);
		req.setAttribute("working", working);
		req.setAttribute("interest", interest);
		req.setAttribute("shurity", shurity);
		req.setAttribute("company", company);
		req.setAttribute("loanTenure", loanTenure);
		req.setAttribute("loanType", loanType);
		req.setAttribute("terms", terms);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("loanDisplay.jsp");
		dispatcher.forward(req, resp);
		
	}

	

}
