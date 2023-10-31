/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import connectDB.ConnectDB;
import dao.CongNhan_DAO;
import entity.CongNhan;
import gui.GDChinh;
import gui.Login;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
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
    private Login loginForm;
    public  void main(String[] args) throws SQLException {
        loginForm = new Login();
        loginForm.setVisible(true);
        loginForm.addWindowFocusListener((WindowFocusListener) new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosing(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
//       try {
//			ConnectDB.getInstance().connect();
////			JOptionPane.showMessageDialog(this, "Kết nối thành công");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
////       new GDChinh().setVisible(true);
//        CongNhan_DAO dao = new CongNhan_DAO();
//        ArrayList<CongNhan> ds = dao.getAllCongNhan();
//        for(CongNhan i: ds)
//        {
//            System.out.println(i.getHoTen());
//        }
////        CongNhan a;
//////        a = new CongNhan("111211", "nam", true, LocalDateTime.of(2003, 1, 1, 0, 0), "123456789", "hcm", true, LocalDateTime.of(2023, 1, 1, 0, 0), 24000.0, 200000.0);
//////        dao.createCongNhan(a);
        
    }
    
}
