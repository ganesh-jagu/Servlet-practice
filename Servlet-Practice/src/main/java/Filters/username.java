package Filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class username
 */
@WebFilter("/username_filter")
public class username implements Filter {
       
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("Initialaized");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("Filter");
		String user=request.getParameter("user");
		
		PrintWriter pw=response.getWriter();
		if(user==null || user.trim().isEmpty()) {
			pw.println("enter the proper user name");
		}
		else {
		chain.doFilter(request, response);
		}
		
	}
	
	public void destroy()
	{
		System.out.println("FIlter Destroyed");
	}
}
