package SessionExp;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exp")
public class SessionExpire extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException, ServletException
   {
	     String email = req.getParameter("email");
		 String pass = req.getParameter("pass");
		 
		 Cookie c = new Cookie("email",email);
		 c.setMaxAge(10);
		 Cookie c1 = new Cookie("pass",pass);
		 c1.setMaxAge(10);
		 
		 resp.addCookie(c);
		 resp.addCookie(c1);
		 
	 
	   RequestDispatcher rd = req.getRequestDispatcher("SessionEx1.html");
	   rd.forward(req, resp);
   }
}

