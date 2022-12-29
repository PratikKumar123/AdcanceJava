package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		PrintWriter pw =  res.getWriter();
		pw.println("Welcome "+name);
		
		ServletContext context=getServletContext();  
		   
		String Name=context.getInitParameter("name");  
		pw.println("name is="+Name);
		
		ServletConfig sc=getServletConfig();  
		  
		String newName=sc.getInitParameter("newName");  
		pw.println("new name is="+newName);
	}
	

}
