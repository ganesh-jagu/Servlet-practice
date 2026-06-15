package Annotations;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/sum", "/mul"})
public class MultipleUrls extends HttpServlet{
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			
			PrintWriter pw= res.getWriter();
			String path=req.getServletPath();
			if(path.equals("/sum"))
				{
			int num1=Integer.parseInt (req.getParameter("num-1"));
			int num2=Integer.parseInt (req.getParameter("num-2"));
			int num3=num1+num2;		
			pw.println("Addition of "+num1+" & "+num2+" is "+num3);
				}
			else if (path.equals("/mul"))
			{
			int n1=Integer.parseInt (req.getParameter("n-1"));
			int n2=Integer.parseInt (req.getParameter("n-2"));
			int n3=n1*n2;
			pw.println("Multiplication of "+n1+" & "+n2+" is "+n3);
			}
			
		}

	}
