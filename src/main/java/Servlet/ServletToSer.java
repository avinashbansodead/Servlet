package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericFilter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/asdf1")
public class ServletToSer  extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String Email=req.getParameter("email");
	
		//String pass=req.getParameter("pass");
		RequestDispatcher rd=req.getRequestDispatcher("/as");
		rd.forward(req, res);
	}
	
	
}
