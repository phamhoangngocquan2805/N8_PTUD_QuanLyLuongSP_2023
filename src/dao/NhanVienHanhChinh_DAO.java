/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connectDB.ConnectDB;
import entity.CongNhan;
import entity.NhanVienHanhChinh;
import entity.PhongBan;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 *
 * @author vuhai
 */
public class NhanVienHanhChinh_DAO {
    public ArrayList<NhanVienHanhChinh> getAllNhanVien()
	{
		ArrayList<NhanVienHanhChinh> dsNhanVien = new ArrayList<NhanVienHanhChinh>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from NhanVienHanhChinh";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			{
				String maNV = rs.getString(1);
				String hoTen = rs.getString(2);
                                Boolean phai = rs.getBoolean(3);
                                LocalDateTime ngaySinh = rs.getTimestamp(4).toLocalDateTime();
                                String soDT = rs.getString(5);
                                String diaChi = rs.getString(6);
                                Boolean tinhTrang = rs.getBoolean(7);
                                LocalDateTime ngayVaoLam = rs.getTimestamp(8).toLocalDateTime();
                                String hinhAnh = rs.getString(9);
                                double heSoLuong = rs.getFloat(10);
                                double luognCoBan = rs.getFloat(11);
                                String chucVu = rs.getString(12);
                                String email = rs.getString(13);
                                double tienPhuCapTheoNgay = rs.getFloat(14);
                                double tienChuyenCan = rs.getFloat(15);
                                String ghiChu = rs.getString(16);
				PhongBan_DAO pbdao = new PhongBan_DAO();
                                PhongBan phongBan = pbdao.getPhongBanTheoMa(rs.getString(17));
				NhanVienHanhChinh nv = new NhanVienHanhChinh(maNV, hoTen, true, ngaySinh, soDT, diaChi, true, ngayVaoLam, hinhAnh, heSoLuong, luognCoBan, chucVu, email, tienPhuCapTheoNgay, tienChuyenCan, ghiChu, phongBan);
				dsNhanVien.add(nv);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsNhanVien;
	}
	
    public boolean createNhanVien(NhanVienHanhChinh nv)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("insert into NhanVienHanhChinh values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stm.setString(1, nv.getMaNV());
			stm.setString(2, nv.getHoTen());
			stm.setBoolean(3, nv.isPhai());
                        stm.setString(4, nv.getNgaySinhString());
                        stm.setString(5, nv.getSoDT());
                        stm.setString(6, nv.getDiaChi());
                        stm.setBoolean(7, nv.isTinhTrang());
                        stm.setString(8, nv.getNgayVaoLamString());
                        stm.setString(9, nv.getHinhAnh());
                        stm.setFloat(10, (float) nv.getHeSoLuong());
                        stm.setFloat(11, (float) nv.getLuongCoBan());
                        stm.setString(12, nv.getChucVu());
                        stm.setString(13, nv.getEmail());
                        stm.setFloat(14, (float )nv.getTienPhuCapTheoNgay());
                        stm.setFloat(15, (float)nv.getTienChuyenCan());
                        stm.setString(16, nv.getGhiChu());
                        stm.setString(17, nv.getPhongBan().getMaPB());
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
public boolean updateCongNhan(NhanVienHanhChinh nv)
	{
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		int n = 0;
		try {
			stm = con.prepareStatement("update NhanVienHanhChinh set tenNV = ?, phai = ?, ngaySinh = ?, soDT = ?, diaChi = ?, tinhTrang = ?, ngayVaoLam = ?, hinhAnh = ?, heSoLuong = ?, luongCoBan = ?, chucVu = ?, email = ?, tienPhuCapTheoNgay = ?, tienChuyenCan = ?, ghiChu = ?, maPB = ?  where maNV = ?");
			stm.setString(18, nv.getMaNV());
			stm.setString(1, nv.getHoTen());
			stm.setBoolean(2, nv.isPhai());
                        stm.setString(3, nv.getNgaySinhString());
                        stm.setString(4, nv.getSoDT());
                        stm.setString(5, nv.getDiaChi());
                        stm.setBoolean(6, nv.isTinhTrang());
                        stm.setString(7, nv.getNgayVaoLamString());
                        stm.setString(8, nv.getHinhAnh());
                        stm.setFloat(9, (float) nv.getHeSoLuong());
                        stm.setFloat(10, (float) nv.getLuongCoBan());
                        stm.setString(11, nv.getChucVu());
                        stm.setString(12, nv.getEmail());
                        stm.setFloat(13, (float )nv.getTienPhuCapTheoNgay());
                        stm.setFloat(14, (float)nv.getTienChuyenCan());
                        stm.setString(15, nv.getGhiChu());
                        stm.setString(16, nv.getPhongBan().getMaPB());
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

        public NhanVienHanhChinh getNhanVienTheoMa(String maNV)
        {
            ArrayList<NhanVienHanhChinh> dsNV = getAllNhanVien();
            for(NhanVienHanhChinh x : dsNV)
            {
                if(x.getMaNV().equalsIgnoreCase(maNV))
                    return x;
            }
            return null;
        }
}
