package Task2;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws SQLException {
//		CreateTable cr = new CreateTable();
//		cr.create();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Click 1 to Insert  :");
		System.out.println("Click 2  to Delete Data :");
		System.out.println("Click 3 to update Data :");
		System.out.println("Click 4 to Read  Data :");
		int no = sc.nextInt();

		switch (no) {

		case 1:
			Insert  i = new Insert();
			i.insert();
			break;
		case 2:
			Delete d = new Delete();
			d.delete();
			break;
		case 3: 
			
			Update u = new Update();
			u.update();
		
			break;
		case 4:
			Read a = new Read();
			a.read();
			break;

		default:
			System.out.println("Enter no between 1 to 4");
		}
	}

}
