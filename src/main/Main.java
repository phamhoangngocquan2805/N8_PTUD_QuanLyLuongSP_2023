/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import connectDB.ConnectDB;
import dao.CongNhan_DAO;
import entity.CongNhan;
import gui.GDChinh;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       try {
			ConnectDB.getInstance().connect();
//			JOptionPane.showMessageDialog(this, "Kết nối thành công");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//       new GDChinh().setVisible(true);
        CongNhan_DAO dao = new CongNhan_DAO();
        ArrayList<CongNhan> ds = dao.getAllCongNhan();
        for(CongNhan i: ds)
        {
            System.out.println(i.getHoTen());
        }
//        CongNhan a;
////        a = new CongNhan("111211", "nam", true, LocalDateTime.of(2003, 1, 1, 0, 0), "123456789", "hcm", true, LocalDateTime.of(2023, 1, 1, 0, 0), 24000.0, 200000.0);
////        dao.createCongNhan(a);
        
    }
    
}
