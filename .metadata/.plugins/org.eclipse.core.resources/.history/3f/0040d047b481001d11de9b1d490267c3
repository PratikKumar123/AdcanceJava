package Task1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public void insert() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		try {
			System.out.println("Enter id number :");
			int a = sc.nextInt();
			System.out.println("Enter Your Name :");
			String b = sc.next();
			System.out.println("Enter Location :");
			String c = sc.next();
			System.out.println("Enter your designation :");
			String d = sc.next();
			
				
			
			 stmt.addBatch("INSERT INTO studdetails (id ,studName, Address,Designation) VALUES('" + a + "','" + b + "','" + c + "','" + d + "')");
//			 stmt.addBatch("INSERT INTO studdetails (id ,studName, Address,Designation) VALUES(2,'Golu','Chennai','Nodejs')");
//			 stmt.addBatch("INSERT INTO studdetails (id ,studName, Address,Designation) VALUES(3,'Pratik','gujrat','Nodejs')");
			 
			 stmt.executeBatch();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
