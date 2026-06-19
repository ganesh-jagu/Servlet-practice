package JSTL_tags;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/eltag")
public class EL_tag extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws  IOException, ServletException
	{
		String name="Nani";
		req.setAttribute("name", name);
		RequestDispatcher rd= req.getRequestDispatcher("EL_Tag.jsp");
		rd.forward(req, res);
		
	}

}
