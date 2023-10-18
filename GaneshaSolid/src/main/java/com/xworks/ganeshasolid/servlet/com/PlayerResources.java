package com.xworks.ganeshasolid.servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//@WebServlet(urlPatterns = "/toy" ,loadOnStartup=3)
public class PlayerResources extends  HttpServlet{

	public PlayerResources() {
		System.out.println("Create Player Resources");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=getInitParameter("Name");
		String sport=getInitParameter("Sport");
		String id=getInitParameter("ID");
		
		
	}
	
}
