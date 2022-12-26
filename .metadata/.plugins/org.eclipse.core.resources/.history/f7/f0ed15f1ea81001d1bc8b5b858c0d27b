package Task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {

	public void read() throws SQLException {
		Connection c = Connection1.getCon();
		PreparedStatement p = c.prepareStatement("select id,name,location,designation from crud_op");
		
		ResultSet r = p.executeQuery();
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+ r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
		}
	}
}
