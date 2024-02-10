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

@WebServlet("/session")
public class SessionExp1 extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException, ServletException
   {
	 Cookie [] cookies = req.getCookies();
	 for(Cookie c : cookies)
	 {
		 System.out.println(c.getValue());
	 }
   }
}

