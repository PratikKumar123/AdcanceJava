package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try {
			
		
		 PrintWriter out = response.getWriter();  
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    Cookie ck=new Cookie("uname",n); 
		    response.addCookie(ck);
		 
		    //creating submit button  
		    out.print("<form action='/servlet2'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>"); 
		    
		    out.close();
		}catch(Exception e){
		System.out.println(e);
		}
	}

}
