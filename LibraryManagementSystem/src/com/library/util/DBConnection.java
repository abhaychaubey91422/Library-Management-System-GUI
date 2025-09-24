package com.library.util;

import java.sql.*;

public class DBConnection {
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/librarydb", // DB name
                    "root",                                 // MySQL user
                    "root"                          // MySQL password
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
