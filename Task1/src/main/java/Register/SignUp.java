package Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pwd");
		String city = request.getParameter("city");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup", "root", "root");

			PreparedStatement p = con.prepareStatement("insert into registrationdata(userName,userEmail,userPass,city) values(?,?,?,?)");

			p.setString(1, name);
			p.setString(2, email);
			p.setString(3, pass);
			p.setString(4, city);
			

			int i = p.executeUpdate();

			if (i == 1) {
				out.println("Registration  successfully!!");
				RequestDispatcher rf = request.getRequestDispatcher("login.html");
				rf.forward(request, response);
			}else {
				out.println("Registration  error!!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
