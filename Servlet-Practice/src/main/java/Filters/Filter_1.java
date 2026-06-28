package Filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * Servlet Filter implementation class Filter_1
 */
@WebFilter("/filterEx")
public class Filter_1 implements Filter {
       
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("Filter Intialized");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("Before Servelt");
		
		 chain.doFilter(request, response);
		
		System.out.println("After Servlet");
		
	}
	
	@Override
	public void destroy()
	{
		System.out.println("FIlter Destroyed");
	}
	
}
