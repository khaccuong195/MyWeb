package net.web.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.web.beans.NhaSanXuat;
import net.web.utils.AppConstants;
 
public class NhaSanXuatDAO {
	
	public static List<NhaSanXuat> allNhaSanXuat(Connection conn) throws SQLException{
		List<NhaSanXuat> list = new ArrayList();
		String sql = String.format("SELECT * FROM %s", AppConstants.TABLE_NHASANXUAT);
		Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(sql);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	        NhaSanXuat nsx = new NhaSanXuat(rs.getInt(AppConstants.TBL_NHASANXUAT_ID),
	        		rs.getString(AppConstants.TBL_NHASANXUAT_TENNSX));
	        list.add(nsx);
	      }
	      st.close();
		return list;
	}
	
	public static NhaSanXuat findNhaSanXuatById(Connection conn, int nsxId) throws SQLException {
			
		NhaSanXuat nsx = new NhaSanXuat();
        String sql = String.format("SELECT * FROM %s WHERE ID = ?", AppConstants.TABLE_NHASANXUAT);
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, nsxId);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	nsx.setId(rs.getInt("id"));
        	nsx.setTennsx(rs.getString(AppConstants.TBL_NHASANXUAT_TENNSX));
            return nsx;
        }
        return null;
	}
		
	public static boolean insertNhaSanXuat(Connection conn, String tennsx) throws SQLException {
		String sql = String.format("INSERT INTO %s (%s) VALUES(?)", AppConstants.TABLE_NHASANXUAT, 
				AppConstants.TBL_NHASANXUAT_TENNSX);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, tennsx);
        return pstm.execute();
	}
	
	public static void updateNhaSanXuat(Connection conn, int nsxId, String tennsx) throws SQLException {
		String sql = String.format("UPDATE %s SET %s = ? WHERE ID = ?", AppConstants.TABLE_NHASANXUAT, 
				AppConstants.TBL_NHASANXUAT_TENNSX);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, tennsx);
        pstm.setInt(2, nsxId);
        int rs = pstm.executeUpdate();
	}
	
	public static void delete(Connection conn, int nsxId) throws SQLException {
		String sql = String.format("DELETE FROM %s WHERE ID = ?", AppConstants.TABLE_NHASANXUAT);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, nsxId);
        boolean rs = pstm.execute();
	}
}