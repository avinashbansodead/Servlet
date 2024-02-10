import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Avi")
public class ServletDemo3 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 int i=12;
	 if(i%2==0)
	 {
		 System.out.println("Even number");
	 }
	 else 
	 {
		 System.out.println("it is odd number");
	 }
		
	}

}
