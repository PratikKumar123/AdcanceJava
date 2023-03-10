package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Regis
 */
public class Regis extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("userName");
		String pass = request.getParameter("userPass");
		String email = request.getParameter("userEmail");

		
		out.println(name);
		out.println(pass);
		out.println(email);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");

			PreparedStatement p = con.prepareStatement("insert into detail(userName,userPass,userEmail) values(?,?,?)");

			p.setString(1, name);
			p.setString(2, pass);
			p.setString(3, email);

			int i = p.executeUpdate();

			if (i == 1) {
				out.println("Record inserted successfully!!");
				System.out.println("Record inserted successfully!!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
