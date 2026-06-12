package ServletDispather;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class SendRedirect_2 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("URL changed check once");
	}

}
