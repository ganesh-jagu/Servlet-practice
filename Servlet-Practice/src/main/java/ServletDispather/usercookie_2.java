package ServletDispather;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class usercookie_2 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	 {
		String user = null;
		Cookie ck[]= req.getCookies();
		for(Cookie cookie:ck) {
			if(cookie.getName().equals("user")) {
				user= cookie.getValue();	
			}
		}
		PrintWriter pw=res.getWriter();
		pw.println("Welcome mr/ms "+user);
				
	 }

}
