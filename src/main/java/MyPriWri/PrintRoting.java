package MyPriWri;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericFilter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/wrootee")
public class PrintRoting extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String username=req.getParameter("username");
		String username1 ="Anant";
		if(username1.equals(username))
		{
			System.out.println("User name is Correct");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		
		PrintWriter pw=res.getWriter();
		pw.write("<h1>welcome"+username1+"</h1>");
		pw.write("<i>welcome</i>");
		
	}
}
