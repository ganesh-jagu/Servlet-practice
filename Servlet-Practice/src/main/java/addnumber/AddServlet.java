package addnumber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	// Service method for request  
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		System.out.println("Add of two numbers are:"+c);
		
		PrintWriter out=res.getWriter(); 
		out.println("Addition of two numbers ="+c);
		
	}
	// dopost method for post request
	/* public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		System.out.println("Add of two numbers are:"+c);
		
		PrintWriter out=res.getWriter(); 
		out.println("Post Result="+c);
	} */
	//doget method for get request
	 /* public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		System.out.println("Add of two numbers are:"+c);
		
		PrintWriter out=res.getWriter(); 
		out.println("Get Result="+c);
		
		
				} */
}
