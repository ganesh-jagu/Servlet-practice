package Filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/username_filter")
public class usernameserv extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String user=req.getParameter("user");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>hello mr/ms "+user+"</h1>");
	}
}
