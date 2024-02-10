package Servlet;

import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/a1")
public  class ServletToHtml extends GenericServlet{ 
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("byyy");
	String email=req.getParameter("email");
	System.out.println(email);
	String pass=req.getParameter("pass");
	System.out.println(pass);
	
	RequestDispatcher rd=req.getRequestDispatcher("/File2.html");
	rd.forward(req, res);
	rd.include(req, res);
	
	
}
}