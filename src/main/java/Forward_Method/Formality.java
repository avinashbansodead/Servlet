package Forward_Method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericFilter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/shot")
public class Formality extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String Email=req.getParameter("email");
		String Email1 ="jspider@gmail.com";
		String Pass=req.getParameter("pass");
		String Pass1="1234";
		if(Email1.equals(Email)&&Pass1.equals(Pass))
		{
			PrintWriter pw=res.getWriter();
			pw.write("Right credential");
			System.out.println("User name is Correct");
			RequestDispatcher rd=req.getRequestDispatcher("FWo.html");
			rd.forward(req, res);
			res.setContentType("text/html");
		}
		else
		{
			System.out.println("Wrong Credential");
			System.out.println("Enter correct Credential");
			PrintWriter pw=res.getWriter();
			pw.write("Wrong credential");
			
			RequestDispatcher rd=req.getRequestDispatcher("FLo.html");
			
			rd.include(req, res);
			res.setContentType("text/html");
			
		}
		
		
	}
}
