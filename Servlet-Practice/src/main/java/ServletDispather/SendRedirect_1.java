package ServletDispather;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class SendRedirect_1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw= res.getWriter();
		pw.println("sending to next servlet using the redirect method")
		res.sendRedirect("second");
	}
	
}
