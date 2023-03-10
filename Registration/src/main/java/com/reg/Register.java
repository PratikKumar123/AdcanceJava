package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;


public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("userName");
		String pass = req.getParameter("userPass");
		String email = req.getParameter("userEmail");
		
		PrintWriter w = res.getWriter();
		w.println(name);
		w.println(pass);
		w.println(email);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");

			PreparedStatement p = con.prepareStatement("insert into detail(userName,userPass,userEmail) values(?,?,?)");

			p.setString(1, name);
			p.setString(2, pass);
			p.setString(3, email);
			
			p.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
