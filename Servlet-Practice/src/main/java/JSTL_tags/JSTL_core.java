package JSTL_tags;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl_core")
public class JSTL_core extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		List <String> li=new ArrayList<>();
		li.add("Python");
		li.add("java");
		li.add("C");
		
		req.setAttribute("cources", li);
		RequestDispatcher rd=  req.getRequestDispatcher("JSTL_Core.jsp");
		rd.forward(req,res);
	}

}
