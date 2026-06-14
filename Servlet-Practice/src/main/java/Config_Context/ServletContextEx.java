package Config_Context;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletContextEx extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		
		ServletContext ctx=getServletContext();
		String str=ctx.getInitParameter("name");
		pw.println("Hello "+str);
		
		ServletConfig cfg=getServletConfig();
		String village=cfg.getInitParameter("Village");
		pw.println("my village name is:"+village);
	}

}
