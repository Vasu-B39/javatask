package com.xworkz.station.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/station" ,loadOnStartup=1) 
public class Station extends HttpServlet{
	
	public Station() {
		System.out.println("Created Digital Police Station");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String stname=req.getParameter("Station-Nmae");
		String headconst=req.getParameter("Head-Constable");
		String location=req.getParameter("Location");
		String asscom=req.getParameter("Assistant-Comm");
		String inspector=req.getParameter("Inspector-Name");
		String cells=req.getParameter("Num-Cells");
		String si=req.getParameter("SI-Name");
		String cases=req.getParameter("Num-Case");
		
		System.out.println("Station Nmae :"+stname);
		System.out.println("Head Constable :"+headconst);
		System.out.println("Location :"+location);
		System.out.println("Assistant-Comm :" +asscom);
		System.out.println("Inspector-Name :"+inspector);
		System.out.println("Num-Cells :"+cells);
		System.out.println("SI-Name :"+si);
		System.out.println("Number of Cases :"+cases);
		
		res.setContentType("text/plain");
		PrintWriter writer=res.getWriter();
		writer.print("Station Name is" +stname);
		writer.print("Station area is" +location);
	

}
