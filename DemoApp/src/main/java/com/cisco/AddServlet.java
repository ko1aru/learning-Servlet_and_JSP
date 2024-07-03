package com.cisco;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AddServlet extends HttpServlet {
	
	public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1 + num2;
		resp.getWriter().println(sum);
		
/*		req.setAttribute("res", sum);
 * 
 * 		RequestDispatcher reqDis = req.getRequestDispatcher("sq");
 * 		reqDis.forward(req, resp);
 */
		resp.sendRedirect("sq?sum=" + sum);		//URL-rewriting
		
/*		Cookie cookie = new Cookie("sum", sum+"");
		resp.addCookie(cookie);
	
		resp.sendRedirect("sq");
 */
	}
}
