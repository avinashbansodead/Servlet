package Servla;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericFilter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/patchhh")
public class Patchhh extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("hiii");
		RequestDispatcher rd=req.getRequestDispatcher("Wlp.html");
		rd.forward(req, res);
	}
	
	
}
