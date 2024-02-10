package Trackingg;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/so")
public class Jet extends HttpServlet
{
	
	 protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException, ServletException
	   {
		 Cookie [] cookies = req.getCookies();
		 for(Cookie c : cookies)
		 {
			 System.out.println(c.getValue());
		 }
		 resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 out.println("Email: "+cookies[0].getValue());
		 out.println("Pass: "+cookies[1].getValue());
	   }
}
