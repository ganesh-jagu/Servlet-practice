package Filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FilterEx extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		System.out.println("this is servlet");
		
		PrintWriter pw= res.getWriter();
		pw.println("Inside the Servelet");
	}

}
