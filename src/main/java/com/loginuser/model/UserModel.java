package com.loginuser.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {
    private static final String LOGIN_QUERY = 
        "SELECT id FROM user WHERE username = ? AND password = ?";

    public long login(String username, String password) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = Mydb.getCon();
            stmt = con.prepareStatement(LOGIN_QUERY);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            rs = stmt.executeQuery();
            
            return rs.next() ? rs.getLong("id") : -1;
            
        } finally {
            closeResources(rs, stmt, con);
        }
    }

    private void closeResources(ResultSet rs, PreparedStatement stmt, Connection con) {
        closeResource(rs);
        closeResource(stmt);
        closeResource(con);
    }

    private void closeResource(AutoCloseable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (Exception e) {
                // Log this error if needed
                System.err.println("Error closing resource: " + e.getMessage());
            }
        }
    }
}