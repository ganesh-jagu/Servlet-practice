package ServletDispather;
import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdditionSe extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		
		int n3=n1+n2;
		int n4=n1*n2;
		HttpSession ses=req.getSession();
		ses.setAttribute("add", n3);
		ses.setAttribute("mul",n4);
		
		res.sendRedirect("multiplication");
	
	}
}
