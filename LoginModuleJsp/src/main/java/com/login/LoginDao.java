package com.login;

import java.sql.*;

public class LoginDao {
	
	public boolean check(String uname, String pwd) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginjsp", "root", "root");
			
			PreparedStatement pst = con.prepareStatement("select * from users where uname=? and pwd=?");
			pst.setString(1, uname);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			return(rs.next());

//			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
