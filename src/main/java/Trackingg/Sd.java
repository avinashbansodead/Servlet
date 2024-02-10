package Trackingg;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ma")
public class Sd extends HttpServlet
{

 protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException, ServletException
   {
	     String email = req.getParameter("email");
		 String pass = req.getParameter("pass");
		 
		 Cookie c = new Cookie("email",email);
		 Cookie c1 = new Cookie("pass",pass);
		 resp.addCookie(c);
		 resp.addCookie(c1);
		 Cookie [] cookies = req.getCookies();
	 
	   
	   resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 out.println("Email:  " +email);
		 out.println("Pass:  "+pass);
		 out.println("<a href='so'>Servlet 2</a>");
		 out.println("Email: "+cookies[0].getValue());
		 out.println("Pass: "+cookies[1].getValue());
		 
	 
   }
}

