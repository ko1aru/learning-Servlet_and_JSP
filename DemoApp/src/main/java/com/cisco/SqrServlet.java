package com.cisco;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/sq")
public class SqrServlet extends HttpServlet{
	
	public void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().println("Square of sum is: " + sqr(req, resp));
	}
	
	public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().println("Square of sum is: " + sqr(req, resp));
	}
	
	public int sqr(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		int num = (int) req.getAttribute("res");
		int num = Integer.parseInt(req.getParameter("sum"));	//URL-rewrite OR sendRedirect
		
/*		int num = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("sum")) {
				num = Integer.parseInt(c.getValue());
			}
		}
*/		
		PrintWriter out = resp.getWriter();
		out.println("Sum is: " + num);
		int sqr = num * num;
		return sqr;
	}
}