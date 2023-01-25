package com.SpringOrm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar;
import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");

		StudentDao std = c.getBean("studentdao", StudentDao.class);

//    	 Student s = new Student();
//    	 s.setId(1012);
//    	 s.setName("Pratik");
//    	 s.setCity("kolkta");
//    	 
//    	 int r = std.insert(s);
//    	 System.out.println(r);

		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while (exit) {
			System.out.println("Press 1 for add new Student");
			System.out.println("Press 2 for display all Student");
			System.out.println("Press 3 for gettting one single Student");
			System.out.println("Press 4 for delete Student");
			System.out.println("Press 5 for update Student");
			System.out.println("Press 6 for exit");

			try {
				int input = sc.nextInt();

				switch (input) {

				case 1:
					System.out.println("Enter user id :");
					int uid = sc.nextInt();
					System.out.println("Enter user name :");
					String uname = sc.next();
					System.out.println("Enter user CITY :");
					String ucity = sc.next();
					
					Student s = new Student();
					s.setId(uid);
					s.setName(uname);
					s.setCity(ucity);
					
					int r = std.insert(s);
					System.out.println("_______________");
					System.out.println();
					break;
				case 2:
					List<Student> s1 = std.getAllStudent();
					for(Student s3:s1) {
						System.out.println("Id :"+s3.getId());
						System.out.println("Name :"+s3.getName());
						System.out.println("City :"+s3.getCity());
						System.out.println("________________");
					}
					break;
				case 3:
					System.out.println("Enter user id :");
					int usid = sc.nextInt();
					Student s3 = std.getStudent(usid);
					System.out.println("Id :"+s3.getId());
					System.out.println("Name :"+s3.getName());
					System.out.println("City :"+s3.getCity());
					System.out.println("________________");
					break;
				case 4:
					System.out.println("Enter user id :");
					int id = sc.nextInt();
					std.deleteStudent(id);
					System.out.println("Deleted ");
					break;
				case 5:
					
					
					break;
				case 6:
					
					exit=false;
					break;

				default:
					System.out.println("");
				}

			} catch (Exception e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}

		}
	System.out.println("Thaank you ");

	}
}
