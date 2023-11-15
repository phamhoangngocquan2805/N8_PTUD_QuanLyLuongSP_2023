/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.SanPham;
import gui.GDQLSanPham;
import entity.CongDoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author vuhai
 */
public class CongDoan_DAO {

    public ArrayList<CongDoan> getAllCongDoan() {
        ArrayList<CongDoan> dsCongDoan = new ArrayList<CongDoan>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();
            String sql = "select * from CongDoan";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String maCD = rs.getString(1);
                String tenCD = rs.getString(2);
                int soLuong = rs.getInt(3);
                double donGia = rs.getFloat(4);
                Date ngayBatDau = rs.getDate(5);
                Date ngayKetThuc = rs.getDate(6);
                String tenCDTruoc = rs.getString(7);
                int trangThai = rs.getInt(8);
                SanPham_DAO spdao = new SanPham_DAO();
                SanPham sp = spdao.getSanPhamTheoMa(rs.getString(9));

                CongDoan cd = new CongDoan(maCD, tenCD, soLuong, donGia, ngayBatDau, ngayKetThuc, tenCDTruoc, trangThai, sp);
                dsCongDoan.add(cd);
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return dsCongDoan;
    }

    public boolean createCongDoan(CongDoan cd) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stm = null;
        int n = 0;
        try {
            stm = con.prepareStatement("insert into CongDoan values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, cd.getMaCD());
            stm.setString(2, cd.getTenCD());
            stm.setInt(3, cd.getSoLuong());
            stm.setFloat(4, (float) cd.getDonGia());
            stm.setString(5, cd.getNgayBatDauString());
            stm.setString(6, cd.getNgayKetThucString());
            stm.setString(7, cd.getTenCDTruoc());
            stm.setInt(8, cd.getTrangThai());
            stm.setString(9, cd.getSanPham().getMaSP());
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

    public boolean updateCongDoan(CongDoan cd) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stm = null;
        int n = 0;
        try {
            stm = con.prepareStatement("update CongDoan set tenCD = ?, soLuong = ?, donGia = ?, ngayBatDau = ?, ngayKetThuc = ?, tenCDTruoc = ?, trangThai = ?, maSP = ? where maCD = ?");
            stm.setString(9, cd.getMaCD());
            stm.setString(1, cd.getTenCD());
            stm.setInt(2, cd.getSoLuong());
            stm.setFloat(3, (float) cd.getDonGia());
            stm.setString(4, cd.getNgayBatDauString());
            stm.setString(5, cd.getNgayKetThucString());
            stm.setString(6, cd.getTenCDTruoc());
            stm.setInt(7, cd.getTrangThai());
            stm.setString(8, cd.getSanPham().getMaSP());
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

//    public boolean (String maCD) throws SQLException {
//        ConnectDB.getInstance();
//        Connection con = ConnectDB.getConnection();
//        ConnectDB.connect();
//        PreparedStatement prepStmt = null;
//        int n = 0;
//
//        Connection con = ConnectDB.getConnection();
//
//        try {
//            String sql = "Delete from Xe WHERE maXe=?";
//            prepStmt = con.prepareStatement(sql);
//
//            prepStmt.setString(1, maCD);
//            n = prepStmt.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                prepStmt.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return n > 0;
//    }
    public boolean xoaCongDoan(String ma) throws SQLException {
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("delete CongDoan where maCD = ?");
            stmt.setString(1, ma);
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n > 0;
    }

    public CongDoan getCongDoanTheoMa(String maCD) {
        ArrayList<CongDoan> dsSP = getAllCongDoan();
        for (CongDoan x : dsSP) {
            if (x.getMaCD().equalsIgnoreCase(maCD)) {
                return x;
            }
        }
        return null;
    }

}
