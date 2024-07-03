package com.cisco;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		out.println(name);
		
		ServletConfig con = getServletConfig();
		name = con.getInitParameter("name");
		out.println(name);
	}
}