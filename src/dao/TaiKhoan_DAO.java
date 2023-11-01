/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.NhanVienHanhChinh;
import entity.TaiKhoan;
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
public class TaiKhoan_DAO {
    public ArrayList<TaiKhoan> getAllTaiKhoan()
	{
		ArrayList<TaiKhoan> dsTK = new ArrayList<TaiKhoan>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from TaiKhoan";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next())
			{
				String maTK = rs.getString(1);
				String tenTK = rs.getString(2);
                                String matKhau = rs.getString(3);
                                String quyenHan = rs.getString(4);
                                NhanVienHanhChinh_DAO nvdao = new NhanVienHanhChinh_DAO();
                                NhanVienHanhChinh nv = nvdao.getNhanVienTheoMa(rs.getString(5));
                                TaiKhoan tk = new TaiKhoan(maTK, tenTK, matKhau, quyenHan, nv);
				dsTK.add(tk);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dsTK;
	}
	
    public boolean createTaiKhoan(final TaiKhoan tk) {
        ConnectDB.getInstance();
        final Connection con = ConnectDB.getConnection();
        PreparedStatement stm = null;
        int n = 0;
        try {
            stm = con.prepareStatement("insert into TaiKhoan values(?, ?, ?, ?, ?)");
            stm.setString(1, tk.getMaTK());
            stm.setString(2, tk.getTenTK());
            stm.setString(3, tk.getMatKhau());
            stm.setString(4, tk.getQuyenHan());
            stm.setString(5, tk.getNv().getMaNV());
            n = stm.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            try {
                stm.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        finally {
            try {
                stm.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        return n > 0;
    }
    
    public boolean updateCongNhan(final TaiKhoan tk) {
        ConnectDB.getInstance();
        final Connection con = ConnectDB.getConnection();
        PreparedStatement stm = null;
        int n = 0;
        try {
            stm = con.prepareStatement("update TaiKhoan set tenTK = ?, matKhau = ?, quyenHan = ?, maNV = ? where maTK = ?");
            stm.setString(5, tk.getMaTK());
            stm.setString(4, tk.getTenTK());
            stm.setString(3, tk.getMatKhau());
            stm.setString(2, tk.getQuyenHan());
            stm.setString(1, tk.getNv().getMaNV());
            n = stm.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            try {
                stm.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        finally {
            try {
                stm.close();
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        return n > 0;
    }

        public TaiKhoan getTaiKhoanTheoMa(String maTK)
        {
            ArrayList<TaiKhoan> dsTK = getAllTaiKhoan();
            for(TaiKhoan x : dsTK)
            {
                if(x.getMaTK().equalsIgnoreCase(maTK))
                    return x;
            }
            return null;
        }
}
