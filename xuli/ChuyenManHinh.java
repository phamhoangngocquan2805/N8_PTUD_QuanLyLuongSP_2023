/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuli;

import gui.GDBaoCaoThongKe;
import gui.GDChinh;
import gui.GDPhanCong;
import gui.GDQLCongDoan;
import gui.GDQLHopDong;
import gui.GDQLNhanVienHanhChinh;
import gui.GDQLSanPham;
import gui.GDQLTaiKhoan;
import gui.GDTongQuan;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import others.BienMacDinh;
import static others.BienMacDinh.mauBorderBottomMenu;
import static others.BienMacDinh.mauDanhMucDangChon;
import static others.BienMacDinh.mauDen;
import static others.BienMacDinh.mauNenMenu;
import static others.BienMacDinh.mauTrang;

/**
 *
 * @author acer
 */
public class ChuyenManHinh implements BienMacDinh{
    public static JPanel pChinh;
    private String danhMucDangChon = "";
    private List<DanhMucBean> listDanhMucBean = null;

    public ChuyenManHinh(JPanel pChinh) {
        this.pChinh = pChinh;
    }
    
    public void setManHinhNoiDung(JPanel pDanhMucDangChon, JLabel lblDanhMucDangChon) throws SQLException {
        danhMucDangChon = "TrangChu";
        pDanhMucDangChon.setBackground(mauDanhMucDangChon);
        lblDanhMucDangChon.setBackground(mauDanhMucDangChon);
        lblDanhMucDangChon.setForeground(mauTrang);

        //load lại giao diện
        pChinh.removeAll();
        pChinh.setLayout(new BorderLayout());
        pChinh.add(new GDTongQuan());
        pChinh.validate();
        pChinh.repaint();
    }
    
    public void setSuKienClickDanhMuc(List<DanhMucBean> listDanhMucBean) {
        this.listDanhMucBean = listDanhMucBean;
        for (DanhMucBean item : listDanhMucBean) {
            item.getLbl().addMouseListener(new customSuKienMouseListener(item.getLoaiDanhMuc(), item.getPanel(), item.getLbl()));
        }
    }

    public class customSuKienMouseListener implements MouseListener {

        // pNoiDung dùng để set lại panel nội dung ở bên phải
        private JPanel pNoiDung;

        //3 thành phần tạo nên danh mục trong panel menu
        private String loaiDanhMuc;
        private JPanel panel;
        private JLabel lbl;

        public customSuKienMouseListener(String loaiDanhMuc, JPanel panel, JLabel lbl) {
            this.loaiDanhMuc = loaiDanhMuc;
            this.panel = panel;
            this.lbl = lbl;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            danhMucDangChon = loaiDanhMuc;
            switch (loaiDanhMuc) {
                case "TrangChu":  {
                    pNoiDung = new GDTongQuan();
                }
                break;


                case "QLHopDong":  {
                    pNoiDung = new GDQLHopDong();
                }
                break;
                
                case "QLSanPham": {
                    pNoiDung = new GDQLSanPham();
                }
                break;
                
                case "QLCongDoan" : {
                    pNoiDung = new GDQLCongDoan();
                }
                break;
                
                case "PhanCong": {
                    pNoiDung = new GDPhanCong();
                }
                break;
                
                case "QLTaiKhoan": {
                    pNoiDung = new GDQLTaiKhoan();
                }
                break;
                
                case "BaoCaoThongKe": {
                    pNoiDung = new GDBaoCaoThongKe();
                }
                break;
                
                default:
                    break;
            }
             pChinh.removeAll();
            pChinh.setLayout(new BorderLayout());
            pChinh.add(pNoiDung);
            pChinh.validate();
            pChinh.repaint();
            thayDoiBackGroundKhiClick(loaiDanhMuc);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // set hiệu ứng khi được để chuột vào
            panel.setBackground(mauDanhMucDangChon);
            lbl.setBackground(mauDanhMucDangChon);
            lbl.setForeground(mauTrang);
            lbl.setBorder(null);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //set hiệu ứng khi lia chuột ra chỗ khác
            if (!danhMucDangChon.equalsIgnoreCase(loaiDanhMuc)) {
                panel.setBackground(mauNenMenu);
                lbl.setBackground(mauNenMenu);
                lbl.setForeground(mauTrang);
//                lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, mauBorderBottomMenu));
            }
        }

        private void thayDoiBackGroundKhiClick(String loaiDangChon) {
            for (DanhMucBean item : listDanhMucBean) {
                if (item.getLoaiDanhMuc().equalsIgnoreCase(loaiDangChon)) {
                    item.getPanel().setBackground(mauDanhMucDangChon);
                    item.getLbl().setBackground(mauDanhMucDangChon);
                    item.getLbl().setForeground(mauTrang);
                    item.getLbl().setBorder(null);
                } else {
                    item.getPanel().setBackground(mauNenMenu);
                    item.getLbl().setBackground(mauNenMenu);
                    item.getLbl().setForeground(mauTrang);
//                    item.getLbl().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, mauBorderBottomMenu));
                }
            }
        }
    }
}
