package ServletDispather;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Qube extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int n1= Integer.parseInt(req.getParameter("n1"));
		int n2= Integer.parseInt(req.getParameter("n2"));
		
		int n3=n1+n2;
		
		// forward method
		req.setAttribute("add", n3);
		
		RequestDispatcher rd=req.getRequestDispatcher("forward");
		rd.forward(req, res);
		
	}
}
