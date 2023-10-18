package com.xworkz.match.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/match", loadOnStartup = 1)
public class Matches extends HttpServlet{
	
	public Matches() {
		System.out.println("Created Match Resources...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String date=req.getParameter("date");
		String team1=req.getParameter("team1");
		String team1CName=req.getParameter("team1CName");
		String team2=req.getParameter("team2");
		String team2CName=req.getParameter("team2CName");
		String umpireName=req.getParameter("umpireName");
		String thirdUmpireName=req.getParameter("thirdUmpireName");
		String stadiumName=req.getParameter("stadiumName");
		
	
		System.out.println(name);
		System.out.println(country);
		System.out.println(date);
		System.out.println(team1);
		System.out.println(team1CName);
		System.out.println(team2);
		System.out.println(team2CName);
		System.out.println(umpireName);
		System.out.println(thirdUmpireName);
		System.out.println(stadiumName);
	   
		if(name!=null)	
		{
			req.setAttribute("name", name);
			req.setAttribute("country", country);
			req.setAttribute("date", date);
			req.setAttribute("team1", team1);
			req.setAttribute("team1CName", team1CName);
			req.setAttribute("team2", team2);
			req.setAttribute("team2CName", team2CName);
			req.setAttribute("umpireName", umpireName);
			req.setAttribute("thirdUmpireName", thirdUmpireName);
			req.setAttribute("stadiumName", stadiumName);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("matchSucess.jsp");
			dispatcher.forward(req, resp);
		}
		else
		{
			req.setAttribute("error", "check enterd details");
			RequestDispatcher dispatcher=req.getRequestDispatcher("match.jsp");
			dispatcher.forward(req, resp);
		}
		
		
	}

}
