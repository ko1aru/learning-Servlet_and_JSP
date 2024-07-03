package com.login;

import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginDb extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException  {
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		LoginDao loginDao = new LoginDao();

		boolean isFound = loginDao.check(uname, pass);
		if(isFound == false) {
			System.out.println("Invalid credentials!");
			response.sendRedirect("login.jsp");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		}
	}
}
