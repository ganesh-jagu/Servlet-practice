package ServletDispather;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class userCookie_1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String user=(String) req.getParameter("user");
		
		Cookie ck=new Cookie("user",user);
		res.addCookie(ck);
		
		res.sendRedirect("userck2");
				
	}

}
