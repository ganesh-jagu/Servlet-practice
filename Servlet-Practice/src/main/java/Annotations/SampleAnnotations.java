package Annotations;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/substract") //or (value="/substract")


public class SampleAnnotations extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int n1=Integer.parseInt (req.getParameter("n1"));
		int n2=Integer.parseInt (req.getParameter("n2"));
		int n3=n1-n2;
		PrintWriter pw= res.getWriter();
		pw.println("Substartion of "+n1+" & "+n2+" is "+n3);
		
	}

}
