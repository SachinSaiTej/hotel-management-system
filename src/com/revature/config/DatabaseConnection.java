package com.revature.config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection con = null;
	CallableStatement cns = null;
    static
    {
        String url = "jdbc:mysql://localhost/gd";
        String user = "root";
        String pass = "200104";
        try {
        //  Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (/*ClassNotFoundException |*/ SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
/*
 * public static void main(String args[]) { Connection conne =
 * DriverManager.getConnection(url, user, pass); } }
 */
}