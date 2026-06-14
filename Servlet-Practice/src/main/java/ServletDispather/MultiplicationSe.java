package ServletDispather;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MultiplicationSe extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		HttpSession ses=req.getSession();
		
		// ses.removeAttribute("add");
		int sum= (int) ses.getAttribute("add");
		int mul= (int) ses.getAttribute("mul");
		
		PrintWriter pw=res.getWriter();
		pw.println("Addition"+sum);
		pw.println("Multipliction"+mul);
		
		
	}

}
