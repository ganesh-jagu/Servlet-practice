package addnumber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PrintingData extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String str=req.getParameter("data1");
		PrintWriter out=res.getWriter();
		out.println("<html> <body bgcolor=green> <h1 align=center> ");
		out.println(str);
		out.println("</h1> </body> </html>");
	}
	

}
