package Servlet_Interface;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet")
public class My_Servlet implements Servlet
{

	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException 
	{
		this.config=config;
		System.out.println("Servlet Object is created");
		
	}

	public ServletConfig getServletConfig() {
		
		return this.config ;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("Service Method is called");
		//destroy();
		
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by Avinash";
	}

	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

}
