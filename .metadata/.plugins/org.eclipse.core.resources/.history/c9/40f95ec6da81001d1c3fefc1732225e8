package Task1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	private static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techouts", "root", "root");
		} catch (Exception e) {
			System.out.println("Driver not found.");
		}
		return con;
	}
}