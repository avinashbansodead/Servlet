package DeleteSession;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/delete")
public class SessionDel extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServerException,IOException, ServletException
   {
	   HttpSession hs = req.getSession();
	   
	   String email=req.getParameter("email");
	   String pass=req.getParameter("pass");
	   
	   
	   hs.setAttribute("email",email);
	   hs.setAttribute("pass",pass);
	   hs.removeAttribute("email");
	   hs.removeAttribute("pass");
	   
	     String s=(String) hs.getAttribute("email");
		 String s1= (String) hs.getAttribute("pass");
		 
		 System.out.println("Data is deleted");
		 
   }
}
