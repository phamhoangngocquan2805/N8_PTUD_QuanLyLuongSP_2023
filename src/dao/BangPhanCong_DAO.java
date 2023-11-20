/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.BangPhanCong;
import entity.CongDoan;
import entity.CongNhan;
import entity.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author vuhai
 */
public class BangPhanCong_DAO {
    public ArrayList<BangPhanCong> getAllBangPhanCong()
	{
		ArrayList<BangPhanCong> dsBangPhanCong = new ArrayList<BangPhanCong>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from BangPhanCong";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			{
				String maBangPhanCong = rs.getString(1);
                                int soLuong = rs.getInt(2);
                                
                                CongDoan_DAO cddao = new CongDoan_DAO();
                                CongDoan cd = cddao.getCongDoanTheoMa(rs.getString(3));
                                
                                CongNhan_DAO cndao = new CongNhan_DAO();
                                CongNhan cn = cndao.getCongNhanTheoMa(rs.getString(4));

				BangPhanCong bpc = new BangPhanCong(maBangPhanCong, soLuong, cd, cn);
				dsBangPhanCong.add(bpc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsBangPhanCong;
	}
	
    public boolean createBangPhanCong(BangPhanCong bpc)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("insert into BangPhanCong values(?, ?, ?, ?)");
			stm.setString(1, bpc.getMaBangPC());
                        stm.setInt(2, bpc.getSoLuong());
                        stm.setString(3, bpc.getCongDoan().getMaCD());
                        stm.setString(4, bpc.getCongNhan().getMaCN());
			n = stm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				stm.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n > 0;
	}
        public boolean updateBangPhanCong(BangPhanCong bpc)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("update BangPhanCong set soLuong = ?, maCD = ?, maCN = ? where maBangPC = ?");
			stm.setString(4, bpc.getMaBangPC());
                        stm.setInt(1, bpc.getSoLuong());
                        stm.setString(2, bpc.getCongDoan().getMaCD());
                        stm.setString(3, bpc.getCongNhan().getMaCN());
			n = stm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				stm.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n > 0;
	}

        public BangPhanCong getBangPhanCongTheoMa(String maBangPhanCong)
        {
            ArrayList<BangPhanCong> dsSP = getAllBangPhanCong();
            for(BangPhanCong x : dsSP)
            {
                if(x.getMaBangPC().equalsIgnoreCase(maBangPhanCong))
                    return x;
            }
            return null;
        }
        
        public BangPhanCong getBangPhanCongMoiNhat()
	{
		BangPhanCong bpc = new BangPhanCong();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "SELECT TOP 1 * FROM BangPhanCong ORDER BY maBangPC DESC;";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			{
				String maBangPhanCong = rs.getString(1);
                                int soLuong = rs.getInt(2);
                                
                                CongDoan_DAO cddao = new CongDoan_DAO();
                                CongDoan cd = cddao.getCongDoanTheoMa(rs.getString(3));
                                
                                CongNhan_DAO cndao = new CongNhan_DAO();
                                CongNhan cn = cndao.getCongNhanTheoMa(rs.getString(4));

				bpc = new BangPhanCong(maBangPhanCong, soLuong, cd, cn);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bpc;
	}
        public boolean xoaBangPhanCong(String maBangPC)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("delete BangPhanCong where maBangPC = ?");
			stm.setString(1, maBangPC);
			n = stm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				stm.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return n > 0;
	}
}
