package Servla;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericFilter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/diiia")
public class Demooo extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String username=req.getParameter("username");
		System.out.println(username);
		
		// TODO Auto-generated method stub
		
		PrintWriter pw=res.getWriter();
		pw.write("<h1>welcome</h1>"+username);
		pw.println("<h1>welcome</h1>");
		
	}
}
