package ServletDispather;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.*;

public class IncudeDispather1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter pw = res.getWriter();
		pw.println("Hedder part");
		
		RequestDispatcher rd=req.getRequestDispatcher("content");
		rd.include(req, res);
		
		pw.println("Footer part");
	
	}
	

}
