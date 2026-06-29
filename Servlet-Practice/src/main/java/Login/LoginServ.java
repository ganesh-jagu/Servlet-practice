package Login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServ extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("user");
		String pass=req.getParameter("pass");
		
		String tempuser="ganesh";
		String temppass="Pass";
		
		HttpSession session= req.getSession();
		
		
		
		if(uname.equals(tempuser) && pass.equals(temppass))
		{
			session.setAttribute("user", uname);
			res.sendRedirect("wellcome.jsp");
			
		}
		else
		{
			res.sendRedirect("loginPage.jsp");
		}
		
	}

}
