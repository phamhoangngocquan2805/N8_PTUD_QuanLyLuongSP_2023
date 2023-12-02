/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.BangChamCongNhanVien;
import entity.CongDoan;
import entity.CongNhan;
import entity.NhanVienHanhChinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author vuhai
 */
public class BangChamCongNhanVien_DAO {
    public ArrayList<BangChamCongNhanVien> getAllBangChamCongNhanVien()
	{
		ArrayList<BangChamCongNhanVien> dsBangChamCongNhanVien = new ArrayList<BangChamCongNhanVien>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from BangChamCongNhanVien";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			{
				String maBangChamCong = rs.getString(1);
                                LocalTime gioVao = rs.getTime(2).toLocalTime();
                                LocalTime gioRa = rs.getTime(3).toLocalTime();
                                LocalDateTime ngayChamCong = rs.getTimestamp(4).toLocalDateTime();
                                String caLamViec = rs.getString(5);
                                NhanVienHanhChinh_DAO nvdao = new NhanVienHanhChinh_DAO();
                                NhanVienHanhChinh nv = nvdao.getNhanVienTheoMa(rs.getString(6));

				BangChamCongNhanVien bcc = new BangChamCongNhanVien(maBangChamCong, gioVao, gioRa, ngayChamCong, caLamViec, nv);
				dsBangChamCongNhanVien.add(bcc);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsBangChamCongNhanVien;
	}
	
    public boolean createBangChamCongNhanVien(BangChamCongNhanVien bcc)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("insert into BangChamCongNhanVien values(?, ?, ?, ?, ?, ?)");
			stm.setString(1, bcc.getMaBangChamCong());
                        stm.setString(2, bcc.getGioVaoString());
                        stm.setString(3, bcc.getGioRaString());
                        stm.setString(4, bcc.getNgayChamCongString());
                        stm.setString(5, bcc.getCaLamViec());
                        stm.setString(6, bcc.getNv().getMaNV());
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
        public boolean updateBangChamCongNhanVien(BangChamCongNhanVien bcc)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("update BangChamCongNhanVien set gioVao = ?, gioRa = ?, ngayChamCong = ?, caLamViec = ? where maBangChamCong = ?");
			stm.setString(6, bcc.getMaBangChamCong());
                        stm.setString(1, bcc.getGioVaoString());
                        stm.setString(2, bcc.getGioRaString());
                        stm.setString(3, bcc.getNgayChamCongString());
                        stm.setString(4, bcc.getCaLamViec());
                        stm.setString(5, bcc.getNv().getMaNV());
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

        public BangChamCongNhanVien getBangChamCongNhanVienTheoMa(String maBangChamCongNhanVien)
        {
            ArrayList<BangChamCongNhanVien> dsSP = getAllBangChamCongNhanVien();
            for(BangChamCongNhanVien x : dsSP)
            {
                if(x.getMaBangChamCong().equalsIgnoreCase(maBangChamCongNhanVien))
                    return x;
            }
            return null;
        }
}
