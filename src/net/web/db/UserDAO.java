package net.web.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.web.beans.User;
import net.web.utils.AppConstants;
 
public class UserDAO {
	
	public static List<User> allUser(Connection conn) throws SQLException{
		List<User> list = new ArrayList();
		String sql = String.format("SELECT * FROM %s", AppConstants.TABLE_USER);
		Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(sql);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	        User user = new User(rs.getInt(AppConstants.TBL_USER_ID),
	        		rs.getString(AppConstants.TBL_USER_USERNAME),
	        		rs.getString(AppConstants.TBL_USER_PASSWORD),
	        		rs.getString(AppConstants.TBL_USER_HOTEN),
	        		rs.getString(AppConstants.TBL_USER_DIACHI),
	        		rs.getString(AppConstants.TBL_USER_EMAIL),
	        		rs.getString(AppConstants.TBL_USER_DIENTHOAI));
	        list.add(user);
	      }
	      st.close();
		return list;
	}
	
	public static User findUserById(Connection conn, int userId) throws SQLException {
			
		User user = new User();
        String sql = String.format("SELECT * FROM %s where id = ?", AppConstants.TABLE_USER);
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, userId);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	user.setId(rs.getInt("id"));
            user.setUsername(rs.getString(AppConstants.TBL_USER_USERNAME));
            user.setPassword(rs.getString(AppConstants.TBL_USER_PASSWORD));
            return user;
        }
        return null;
	}
	
	public static User isExistUser(Connection conn, String username, String password) throws SQLException {
		
		User user = new User();
        String sql = String.format("SELECT * FROM %s WHERE %s = ? AND %s = ?", AppConstants.TABLE_USER, 
        		AppConstants.TBL_USER_USERNAME, 
        		AppConstants.TBL_USER_PASSWORD);
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	user.setId(rs.getInt(AppConstants.TBL_USER_ID));
            user.setUsername(username);
            user.setPassword(password);
            return user;
        }
        return null;
	}
	
	public static void insertUser(Connection conn, String username, String password) throws SQLException {
		String sql = String.format("INSERT INTO %s (%s, %s) VALUES(?, ?)", AppConstants.TABLE_USER, 
				AppConstants.TBL_USER_USERNAME, AppConstants.TBL_USER_PASSWORD);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
	}
	
	public static void updateUser(Connection conn,int userId, String username, String password) throws SQLException {
		String sql = String.format("UPDATE %s SET %s = ?, %s = ?", AppConstants.TABLE_USER, 
				AppConstants.TBL_USER_USERNAME, AppConstants.TBL_USER_PASSWORD);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
        int rs = pstm.executeUpdate();
	}
	
	public static void delete(Connection conn, int userId) throws SQLException {
		String sql = String.format("DELETE FROM %s WHERE ID = ?", AppConstants.TABLE_USER);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, userId);
        boolean rs = pstm.execute();
	}
	
	
 
    public static User findUser(Connection conn, //
            String userName, String password) throws SQLException {
    	String sql = String.format("SELECT * FROM %s WHERE %s = ? AND %s = ?", AppConstants.TABLE_USER, 
        		AppConstants.TBL_USER_USERNAME, 
        		AppConstants.TBL_USER_PASSWORD);
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            User user = new User();
            user.setUsername(userName);
            user.setPassword(password);
            return user;
        }
        return null;
    }
}