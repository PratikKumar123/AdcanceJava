package Task1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	
	public void delete() throws SQLException {
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		try {

			int check = stmt.executeUpdate("delete  from studdetails");

			if (check == 0) {
				System.out.println("Not Deleted");
			} else {
				System.out.println("Deleted Successfully :");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
