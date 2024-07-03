package com.user.container;

import java.io.IOException;
import java.io.PrintWriter;

import com.user.dao.UserDao;
import com.user.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/getUser")
public class GetUserContainer extends HttpServlet {
	
	public User getUser(String uname) {
		UserDao userDao = new UserDao();
		User u1 = userDao.getUser(uname);
		return u1;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		User u1 = getUser(uname);
		
		if(u1.getUname() == null) {
			out.println("No such user exists!");
		} else {
			request.setAttribute("user", u1);
			RequestDispatcher rd = request.getRequestDispatcher("showUser.jsp");
			rd.forward(request, response);
			//out.println(u1.toString());
		}
	}
}
