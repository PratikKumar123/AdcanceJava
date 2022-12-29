package Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String email = request.getParameter("lemail");
		String pass = request.getParameter("lpwd");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup", "root", "root");

			PreparedStatement p = con.prepareStatement("select userEmail,userPass from registrationdata");

			ResultSet r = p.executeQuery();

			if (email.equals(r.getString("userEmail")) && pass.equals(r.getString("userPass"))) {
				out.println("Login Successfully !!");
				RequestDispatcher rf = request.getRequestDispatcher("welcome.html");
				rf.forward(request, response);
			} else {
				out.println("Error !!");
			}

			int i = p.executeUpdate();

			if (i == 1) {
				out.println("Record inserted successfully!!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
