package addnumber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqrDispather extends HttpServlet {
	
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			int t= (int)req.getAttribute("t");
			
			int s=t*t;
		PrintWriter out=res.getWriter();
		out.println("Addition of tow nubers:"+t);
		out.println("SqareRoot:"+s);
			
		}
	

}
