/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.HopDong;
import entity.HopDong;
import entity.NhanVienHanhChinh;
import entity.PhongBan;
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
public class HopDong_DAO {
       public ArrayList<HopDong> getAllHopDong()
	{
		ArrayList<HopDong> dsHopDong = new ArrayList<HopDong>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from HopDong";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			{
				String maHD = rs.getString(1);
				String tenHD = rs.getString(2);
                                
                                LocalDateTime ngayKiHD = rs.getTimestamp(3).toLocalDateTime();

                                LocalDateTime ngayBanGiao = rs.getTimestamp(4).toLocalDateTime();

                                String ghiChu = rs.getString(5);
                                int trangThai = rs.getInt(6);
                                NhanVienHanhChinh_DAO nvdao = new NhanVienHanhChinh_DAO();
                                NhanVienHanhChinh nv = nvdao.getNhanVienTheoMa(rs.getString(7));
				HopDong hd = new HopDong(maHD, tenHD, ngayKiHD, ngayBanGiao, ghiChu, trangThai, nv);
				dsHopDong.add(hd);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsHopDong;
	}
	
    public boolean createHopDong(HopDong hd)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("insert into HopDong values(?, ?, ?, ?, ?, ?, ?)");
			stm.setString(1, hd.getMaHD());
			stm.setString(2, hd.getTenHD());
                        stm.setString(3, hd.getNgayKiHDString());
                        stm.setString(4, hd.getNgayBanGiaoString());
                        stm.setString(5, hd.getGhiChu());
                        stm.setInt(6, hd.getTrangThai());
                        stm.setString(7, hd.getNv().getMaNV());
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
        public boolean updateHopDong(HopDong hd)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("update HopDong set tenHD = ?, ngayKiHD = ?, ngayBanGiao = ?, ghiChu = ?, trangThai = ?, maNV = ? where maHD = ?");
			stm.setString(7, hd.getMaHD());
			stm.setString(1, hd.getTenHD());
                        stm.setString(2, hd.getNgayKiHDString());
                        stm.setString(3, hd.getNgayBanGiaoString());
                        stm.setString(4, hd.getGhiChu());
                        stm.setInt(5, hd.getTrangThai());
                        stm.setString(6, hd.getNv().getMaNV());
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

        public HopDong getHopDongTheoMa(String maHD)
        {
            ArrayList<HopDong> dsHD = getAllHopDong();
            for(HopDong x : dsHD)
            {
                if(x.getMaHD().equalsIgnoreCase(maHD))
                    return x;
            }
            return null;
        }
}
