package com.cisco;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/add")
public class NumFilter extends HttpFilter implements Filter {
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();
		
		if(Integer.parseInt(req.getParameter("num1"))>=0 && Integer.parseInt(req.getParameter("num2"))>=0) {

			chain.doFilter(request, response);	
		} else {
			out.println("Please enter only positive numbers");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
