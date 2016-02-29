package org.uncc.ssdi08.apartments.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

	public static boolean isValidLogin(String username, String password)
	{
		boolean status = false;  
        Connection conn = null;  
        PreparedStatement pst = null;  
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "ssdi_08";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String sql_password = "";  
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager  
                    .getConnection(url + dbName, userName, sql_password);  
  
            pst = conn  
                    .prepareStatement("select * from user_details where username=? and password=?");  
            pst.setString(1, username);  
            pst.setString(2, password);  
  
            rs = pst.executeQuery();  
            status = rs.next();  
  
        } catch (Exception e) {  
            System.out.println(e);  
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (pst != null) {  
                try {  
                    pst.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return status;  
	}
}
