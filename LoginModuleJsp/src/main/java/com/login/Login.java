package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

public class Login extends HttpServlet {
	HashSet<String> unames;
	HashMap<String, String> pwds;
	
	public Login() {
		unames = new HashSet<String>();
		unames.add("aakash");
		unames.add("adhakshn");
		
		pwds = new HashMap<String, String>();
		pwds.put("aakash", "aakash");
		pwds.put("adhakshn", "cisco123");
	}
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		
		boolean isFound = false;
		
		for(String u : unames) {
			if(u.equals(uname)) {
				isFound = true;
				break;
			}
		}
		
		if(isFound == false) {
			out.println("Invalid username!");
			response.sendRedirect("login.jsp");
		} else {
			if(pwd.equals(pwds.get(uname))) {
				HttpSession session = request.getSession();
				session.setAttribute("username", uname);
				
				response.sendRedirect("welcome.jsp");
//				response.sendRedirect("welcome.jsp?uname="+uname);
			} else {
				out.println("Invalid password!");
				response.sendRedirect("login.jsp");
			}
		}
		
	}
}