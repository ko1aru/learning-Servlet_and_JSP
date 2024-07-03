package com.user.dao;

import java.sql.*;

import com.user.model.User;

public class UserDao {
	Connection con;
	
	public UserDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginjsp", "root", "root");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public User getUser(String uname) {
		User u = new User();
		
		try {
			PreparedStatement pst = con.prepareStatement("select * from users where uname=?");
			pst.setString(1, uname);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				u.setUname(uname);
				u.setPwd(rs.getString("pwd"));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}
}
