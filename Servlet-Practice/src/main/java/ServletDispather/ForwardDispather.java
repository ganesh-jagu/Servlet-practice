package ServletDispather;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ForwardDispather extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int add= (int) req.getAttribute("add");
		int qube= add*add*add;
		PrintWriter pr=res.getWriter();
		pr.println("Qube value of " + add + " is "+qube);
		
	}

}
