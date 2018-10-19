package net.web.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.web.beans.NhaSanXuat;
import net.web.beans.SanPham;
import net.web.utils.AppConstants;
 
public class SanPhamDAO {
	
	public static List<SanPham> allSanPham(Connection conn) throws SQLException{
		List<SanPham> list = new ArrayList();
		String sql = String.format("SELECT * FROM %s", AppConstants.TABLE_SANPHAM);
		Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(sql);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	    	  SanPham nsx = new SanPham(rs.getInt(AppConstants.TBL_SANPHAM_ID),
		        		rs.getInt(AppConstants.TBL_SANPHAM_NHASANXUAT_ID),
		        		rs.getString(AppConstants.TBL_SANPHAM_TENSP),
		        		rs.getDouble(AppConstants.TBL_SANPHAM_GIA),
		        		rs.getString(AppConstants.TBL_SANPHAM_MANHINH),
		        		rs.getString(AppConstants.TBL_SANPHAM_KICHTHUOC),
		        		rs.getString(AppConstants.TBL_SANPHAM_CPU),
		        		rs.getString(AppConstants.TBL_SANPHAM_TRONGLUONG),
		        		rs.getString(AppConstants.TBL_SANPHAM_RAM),
		        		rs.getString(AppConstants.TBL_SANPHAM_PIN),
		        		rs.getString(AppConstants.TBL_SANPHAM_HINHANH)
	        		
	    			  );
	        list.add(nsx);
	      }
	      st.close();
		return list;
	}
	
	public static SanPham findSanPhamById(Connection conn, int nsxId) throws SQLException {
			
		SanPham sp = new SanPham();
        String sql = String.format("SELECT * FROM %s WHERE ID = ?", AppConstants.TABLE_SANPHAM);
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, nsxId);
        pstm.setInt(2, nsxId);
        pstm.setInt(3, nsxId);
        pstm.setInt(4, nsxId);
        pstm.setInt(5, nsxId);
        
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	sp.setId(rs.getInt("id"));
        	sp.setNhasanxuatId(rs.getInt(AppConstants.TBL_SANPHAM_NHASANXUAT_ID));
            return sp;
        }
        return null;
	}
		
	public static boolean insertSanPham(Connection conn, String tennsx, String nhasanxuat, String tensp , String kichthuoc, String cpu, String trongluong, String ram, String pin, String hinhanh,
			String gia) throws SQLException {
		String sql = String.format("INSERT INTO %s (%s, %s, %s, %s, %s, %s, %s ,%s ,%s,%s,) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", AppConstants.TABLE_SANPHAM, 
				
				AppConstants.TBL_NHASANXUAT_TENNSX, 
				AppConstants.TBL_SANPHAM_NHASANXUAT_ID,				
				AppConstants.TBL_SANPHAM_TENSP,
				AppConstants.TBL_SANPHAM_GIA,
				AppConstants.TBL_SANPHAM_MANHINH,
				AppConstants.TBL_SANPHAM_KICHTHUOC,
				AppConstants.TBL_SANPHAM_TRONGLUONG,
				AppConstants.TBL_SANPHAM_CPU,
				AppConstants.TBL_SANPHAM_RAM,
				AppConstants.TBL_SANPHAM_PIN,
				AppConstants.TBL_SANPHAM_HINHANH);
				
		
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, tennsx);
        pstm.setString(2, nhasanxuat);
        pstm.setString(3, tennsx);
        pstm.setString(4, tennsx);
        pstm.setString(5, tennsx);
        pstm.setString(6, tennsx);
        pstm.setString(7, tennsx);
        pstm.setString(8, tennsx);
        pstm.setString(9, tennsx);
        pstm.setString(10, tennsx);
        
        return pstm.execute();
	}
	
	public static void updateNhaSanXuat(Connection conn, int nsxId, String tennsx) throws SQLException {
		String sql = String.format("UPDATE %s SET %s = ? WHERE ID = ?", AppConstants.TABLE_SANPHAM, 
				AppConstants.TBL_NHASANXUAT_TENNSX);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, tennsx);
        pstm.setInt(2, nsxId);
        int rs = pstm.executeUpdate();
	}
	
	public static void delete(Connection conn, int nsxId) throws SQLException {
		String sql = String.format("DELETE FROM %s WHERE ID = ?", AppConstants.TABLE_SANPHAM);
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, nsxId);
        boolean rs = pstm.execute();
	}
}