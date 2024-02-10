import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/po")
public class Http_Ses extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException, ServletException
   {
	   HttpSession hs = req.getSession();

	   String email=req.getParameter("email");
	   String pass=req.getParameter("pass");



	   hs.setAttribute("email",email);
	   hs.setAttribute("pass",pass);
	   String s=(String) hs.getAttribute("email");
		 String s1= (String) hs.getAttribute("pass");
	   resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 out.println("Hello  "+s);
		 out.println("<a href='serv'>Servlet 2</a>");

   }
}
