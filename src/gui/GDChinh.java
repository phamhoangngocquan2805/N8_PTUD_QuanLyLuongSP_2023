/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import connectDB.ConnectDB;
import entity.NhanVienHanhChinh;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import xuli.ChuyenManHinh;
import static xuli.ChuyenManHinh.pChinh;
import xuli.DanhMucBean;

/**
 *
 * @author acer
 */
public class GDChinh extends javax.swing.JFrame {

    /**
     * Creates new form GDChinh1
     */
    private GDLogin gdlogin;
    private NhanVienHanhChinh nvLog;
    
    public GDChinh() throws SQLException {

        icon();
        this.setTitle("Chương trình quản lý lương sản phẩm của công ty Thịnh Vượng.");
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        gdlogin = new GDLogin();
        gdlogin.setVisible(true);
        this.gdlogin.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosing(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosed(WindowEvent e) {
                nvLog = gdlogin.getCurrNV();
                setVisible(true);
                ChuyenManHinh dieuKhien = new ChuyenManHinh(pNoiDung);
                try {
                    dieuKhien.setManHinhNoiDung(pHome, lblHome);
                } catch (SQLException ex) {
                    Logger.getLogger(GDChinh.class.getName()).log(Level.SEVERE, null, ex);
                }

                List<DanhMucBean> listDanhMucBean = new ArrayList<>();
                listDanhMucBean.add(new DanhMucBean("TrangChu", pHome, lblHome));
                listDanhMucBean.add(new DanhMucBean("QLNhanSu", pQLNhanSu, lblQLNhanSu));
                listDanhMucBean.add(new DanhMucBean("QLHopDong", pQLHopDong, lblQLHopDong));
                listDanhMucBean.add(new DanhMucBean("QLSanPham", pQLSanPham, lblQLSanPham));
                listDanhMucBean.add(new DanhMucBean("QLCongDoan", pQLCongDoan, lblQLCongDoan));
                listDanhMucBean.add(new DanhMucBean("PhanCong", pPhanCong, lblPhanCong));
                listDanhMucBean.add(new DanhMucBean("QLChamCong", pQLChamCong, lblQLChamCong));
                listDanhMucBean.add(new DanhMucBean("QLLuong", pQLLuong, lblQLLuong));
                listDanhMucBean.add(new DanhMucBean("BaoCaoThongKe", pBaoCao, lblBaoCao));
                listDanhMucBean.add(new DanhMucBean("QLTaiKhoan", pQLTaiKhoan, lblQLTaiKhoan));

                dieuKhien.setSuKienClickDanhMuc(listDanhMucBean);
                
                String tl = LocalDateTime.now().toString();
                jLabel12.setText("Ngày " + tl.substring(8,10) +  " tháng " + tl.substring(5,7) + " năm " + tl.substring(0, 4));
//                JOptionPane.showMessageDialog(null, nvLog.toString());
                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(nvLog.getHinhAnh())));
                jLabel14.setText(nvLog.getHoTen());
            }

            @Override
            public void windowIconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowActivated(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        
    }

    public void icon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuNhanSu = new javax.swing.JPopupMenu();
        nhanVienHanhChinh = new javax.swing.JMenuItem();
        congNhan = new javax.swing.JMenuItem();
        menuChamCong = new javax.swing.JPopupMenu();
        chamCongNVHC = new javax.swing.JMenuItem();
        chamCongCongNhan = new javax.swing.JMenuItem();
        menuLuong = new javax.swing.JPopupMenu();
        tinhLuongNVHC = new javax.swing.JMenuItem();
        tinhLuongCongNhan = new javax.swing.JMenuItem();
        xemBangLuong = new javax.swing.JMenuItem();
        pBackGroundMain = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        pNhanVien = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pListMenu = new javax.swing.JPanel();
        pHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        pQLNhanSu = new javax.swing.JPanel();
        lblQLNhanSu = new javax.swing.JLabel();
        pQLHopDong = new javax.swing.JPanel();
        lblQLHopDong = new javax.swing.JLabel();
        pQLSanPham = new javax.swing.JPanel();
        lblQLSanPham = new javax.swing.JLabel();
        pQLCongDoan = new javax.swing.JPanel();
        lblQLCongDoan = new javax.swing.JLabel();
        pPhanCong = new javax.swing.JPanel();
        lblPhanCong = new javax.swing.JLabel();
        pQLChamCong = new javax.swing.JPanel();
        lblQLChamCong = new javax.swing.JLabel();
        pQLLuong = new javax.swing.JPanel();
        lblQLLuong = new javax.swing.JLabel();
        pBaoCao = new javax.swing.JPanel();
        lblBaoCao = new javax.swing.JLabel();
        pQLTaiKhoan = new javax.swing.JPanel();
        lblQLTaiKhoan = new javax.swing.JLabel();
        pDangXuat = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pNoiDung = new javax.swing.JPanel();
        pTittle = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pTongQuan = new javax.swing.JPanel();

        nhanVienHanhChinh.setBackground(new java.awt.Color(191, 95, 95));
        nhanVienHanhChinh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nhanVienHanhChinh.setForeground(new java.awt.Color(235, 228, 228));
        nhanVienHanhChinh.setText("Nhân viên hành chính");
        nhanVienHanhChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanVienHanhChinhActionPerformed(evt);
            }
        });
        menuNhanSu.add(nhanVienHanhChinh);

        congNhan.setBackground(new java.awt.Color(191, 95, 95));
        congNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        congNhan.setForeground(new java.awt.Color(235, 228, 228));
        congNhan.setText("Công nhân");
        congNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congNhanActionPerformed(evt);
            }
        });
        menuNhanSu.add(congNhan);

        chamCongNVHC.setBackground(new java.awt.Color(191, 95, 95));
        chamCongNVHC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chamCongNVHC.setForeground(new java.awt.Color(235, 228, 228));
        chamCongNVHC.setText("Nhân viên hành chính");
        chamCongNVHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamCongNVHCActionPerformed(evt);
            }
        });
        menuChamCong.add(chamCongNVHC);

        chamCongCongNhan.setBackground(new java.awt.Color(191, 95, 95));
        chamCongCongNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chamCongCongNhan.setForeground(new java.awt.Color(235, 228, 228));
        chamCongCongNhan.setText("Công nhân");
        chamCongCongNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamCongCongNhanActionPerformed(evt);
            }
        });
        menuChamCong.add(chamCongCongNhan);

        tinhLuongNVHC.setBackground(new java.awt.Color(191, 95, 95));
        tinhLuongNVHC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tinhLuongNVHC.setForeground(new java.awt.Color(235, 228, 228));
        tinhLuongNVHC.setText("Tính lương nhân viên");
        tinhLuongNVHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhLuongNVHCActionPerformed(evt);
            }
        });
        menuLuong.add(tinhLuongNVHC);

        tinhLuongCongNhan.setBackground(new java.awt.Color(191, 95, 95));
        tinhLuongCongNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tinhLuongCongNhan.setForeground(new java.awt.Color(235, 228, 228));
        tinhLuongCongNhan.setText("Tính lương công nhân");
        tinhLuongCongNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhLuongCongNhanActionPerformed(evt);
            }
        });
        menuLuong.add(tinhLuongCongNhan);

        xemBangLuong.setBackground(new java.awt.Color(191, 95, 95));
        xemBangLuong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xemBangLuong.setForeground(new java.awt.Color(235, 228, 228));
        xemBangLuong.setText("Xem bảng lương");
        xemBangLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemBangLuongActionPerformed(evt);
            }
        });
        menuLuong.add(xemBangLuong);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pBackGroundMain.setBackground(new java.awt.Color(255, 255, 255));
        pBackGroundMain.setPreferredSize(new java.awt.Dimension(1200, 735));

        pMenu.setBackground(new java.awt.Color(255, 255, 255));
        pMenu.setPreferredSize(new java.awt.Dimension(236, 720));

        pNhanVien.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ngày tháng năm");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user_60px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Tên nhân viên");

        javax.swing.GroupLayout pNhanVienLayout = new javax.swing.GroupLayout(pNhanVien);
        pNhanVien.setLayout(pNhanVienLayout);
        pNhanVienLayout.setHorizontalGroup(
            pNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pNhanVienLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pNhanVienLayout.setVerticalGroup(
            pNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNhanVienLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pListMenu.setBackground(new java.awt.Color(255, 255, 255));
        pListMenu.setPreferredSize(new java.awt.Dimension(230, 611));

        pHome.setBackground(new java.awt.Color(191, 95, 95));

        lblHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(235, 228, 228));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_32px.png"))); // NOI18N
        lblHome.setText("Trang chủ");
        lblHome.setToolTipText("Trang chủ");

        javax.swing.GroupLayout pHomeLayout = new javax.swing.GroupLayout(pHome);
        pHome.setLayout(pHomeLayout);
        pHomeLayout.setHorizontalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pHomeLayout.setVerticalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLNhanSu.setBackground(new java.awt.Color(191, 95, 95));

        lblQLNhanSu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLNhanSu.setForeground(new java.awt.Color(235, 228, 228));
        lblQLNhanSu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhansu_32px.png"))); // NOI18N
        lblQLNhanSu.setText("Quản lý nhân sự");
        lblQLNhanSu.setToolTipText("Quản lý nhân sự");
        lblQLNhanSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNhanSuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pQLNhanSuLayout = new javax.swing.GroupLayout(pQLNhanSu);
        pQLNhanSu.setLayout(pQLNhanSuLayout);
        pQLNhanSuLayout.setHorizontalGroup(
            pQLNhanSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLNhanSuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLNhanSuLayout.setVerticalGroup(
            pQLNhanSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLHopDong.setBackground(new java.awt.Color(191, 95, 95));

        lblQLHopDong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLHopDong.setForeground(new java.awt.Color(235, 228, 228));
        lblQLHopDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hopdong_32px.png"))); // NOI18N
        lblQLHopDong.setText("Quản lý hợp đồng");
        lblQLHopDong.setToolTipText("Quản lý hợp đồng");

        javax.swing.GroupLayout pQLHopDongLayout = new javax.swing.GroupLayout(pQLHopDong);
        pQLHopDong.setLayout(pQLHopDongLayout);
        pQLHopDongLayout.setHorizontalGroup(
            pQLHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLHopDongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLHopDongLayout.setVerticalGroup(
            pQLHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLSanPham.setBackground(new java.awt.Color(191, 95, 95));

        lblQLSanPham.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLSanPham.setForeground(new java.awt.Color(235, 228, 228));
        lblQLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sanpham_32px.png"))); // NOI18N
        lblQLSanPham.setText("Quản lý sản phẩm");
        lblQLSanPham.setToolTipText("Quản lý sản phẩm");

        javax.swing.GroupLayout pQLSanPhamLayout = new javax.swing.GroupLayout(pQLSanPham);
        pQLSanPham.setLayout(pQLSanPhamLayout);
        pQLSanPhamLayout.setHorizontalGroup(
            pQLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLSanPhamLayout.setVerticalGroup(
            pQLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLCongDoan.setBackground(new java.awt.Color(191, 95, 95));

        lblQLCongDoan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLCongDoan.setForeground(new java.awt.Color(235, 228, 228));
        lblQLCongDoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/congdoan_32px.png"))); // NOI18N
        lblQLCongDoan.setText("Quản lý công đoạn");
        lblQLCongDoan.setToolTipText("Quản lý công đoạn");

        javax.swing.GroupLayout pQLCongDoanLayout = new javax.swing.GroupLayout(pQLCongDoan);
        pQLCongDoan.setLayout(pQLCongDoanLayout);
        pQLCongDoanLayout.setHorizontalGroup(
            pQLCongDoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLCongDoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLCongDoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLCongDoanLayout.setVerticalGroup(
            pQLCongDoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLCongDoan, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pPhanCong.setBackground(new java.awt.Color(191, 95, 95));
        pPhanCong.setPreferredSize(new java.awt.Dimension(236, 50));

        lblPhanCong.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblPhanCong.setForeground(new java.awt.Color(235, 228, 228));
        lblPhanCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phancong_32px.png"))); // NOI18N
        lblPhanCong.setText("Phân công công đoạn");
        lblPhanCong.setToolTipText("Phân công công đoạn");

        javax.swing.GroupLayout pPhanCongLayout = new javax.swing.GroupLayout(pPhanCong);
        pPhanCong.setLayout(pPhanCongLayout);
        pPhanCongLayout.setHorizontalGroup(
            pPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPhanCongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhanCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pPhanCongLayout.setVerticalGroup(
            pPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPhanCong, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLChamCong.setBackground(new java.awt.Color(191, 95, 95));

        lblQLChamCong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLChamCong.setForeground(new java.awt.Color(235, 228, 228));
        lblQLChamCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chamcong_32px.png"))); // NOI18N
        lblQLChamCong.setText("Quản lý chấm công");
        lblQLChamCong.setToolTipText("Quản lý chấm công");
        lblQLChamCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLChamCongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pQLChamCongLayout = new javax.swing.GroupLayout(pQLChamCong);
        pQLChamCong.setLayout(pQLChamCongLayout);
        pQLChamCongLayout.setHorizontalGroup(
            pQLChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLChamCongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLChamCongLayout.setVerticalGroup(
            pQLChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLLuong.setBackground(new java.awt.Color(191, 95, 95));

        lblQLLuong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLLuong.setForeground(new java.awt.Color(235, 228, 228));
        lblQLLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/luong_32px.png"))); // NOI18N
        lblQLLuong.setText("Quản lý lương");
        lblQLLuong.setToolTipText("Quản lý lương");
        lblQLLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLLuongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pQLLuongLayout = new javax.swing.GroupLayout(pQLLuong);
        pQLLuong.setLayout(pQLLuongLayout);
        pQLLuongLayout.setHorizontalGroup(
            pQLLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLLuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLLuongLayout.setVerticalGroup(
            pQLLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pBaoCao.setBackground(new java.awt.Color(191, 95, 95));

        lblBaoCao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBaoCao.setForeground(new java.awt.Color(235, 228, 228));
        lblBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongke_32px.png"))); // NOI18N
        lblBaoCao.setText("Báo cáo thống kê");
        lblBaoCao.setToolTipText("Báo cáo thống kê");

        javax.swing.GroupLayout pBaoCaoLayout = new javax.swing.GroupLayout(pBaoCao);
        pBaoCao.setLayout(pBaoCaoLayout);
        pBaoCaoLayout.setHorizontalGroup(
            pBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBaoCaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pBaoCaoLayout.setVerticalGroup(
            pBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pQLTaiKhoan.setBackground(new java.awt.Color(191, 95, 95));

        lblQLTaiKhoan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblQLTaiKhoan.setForeground(new java.awt.Color(235, 228, 228));
        lblQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/qltaikhoan_32px.png"))); // NOI18N
        lblQLTaiKhoan.setText("Quản lý tài khoản");
        lblQLTaiKhoan.setToolTipText("Quản lý tài khoản");

        javax.swing.GroupLayout pQLTaiKhoanLayout = new javax.swing.GroupLayout(pQLTaiKhoan);
        pQLTaiKhoan.setLayout(pQLTaiKhoanLayout);
        pQLTaiKhoanLayout.setHorizontalGroup(
            pQLTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pQLTaiKhoanLayout.setVerticalGroup(
            pQLTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pDangXuat.setBackground(new java.awt.Color(191, 95, 95));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 228, 228));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout_32px.png"))); // NOI18N
        jLabel11.setText("Đăng xuất");
        jLabel11.setToolTipText("Đăng xuất");

        javax.swing.GroupLayout pDangXuatLayout = new javax.swing.GroupLayout(pDangXuat);
        pDangXuat.setLayout(pDangXuatLayout);
        pDangXuatLayout.setHorizontalGroup(
            pDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDangXuatLayout.setVerticalGroup(
            pDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pListMenuLayout = new javax.swing.GroupLayout(pListMenu);
        pListMenu.setLayout(pListMenuLayout);
        pListMenuLayout.setHorizontalGroup(
            pListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLCongDoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pPhanCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pQLTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pListMenuLayout.setVerticalGroup(
            pListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListMenuLayout.createSequentialGroup()
                .addComponent(pHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLNhanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLCongDoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPhanCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pQLTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pListMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addComponent(pNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pListMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        );

        pNoiDung.setMaximumSize(new java.awt.Dimension(958, 735));
        pNoiDung.setPreferredSize(new java.awt.Dimension(958, 735));

        pTittle.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(191, 95, 95));

        javax.swing.GroupLayout pTittleLayout = new javax.swing.GroupLayout(pTittle);
        pTittle.setLayout(pTittleLayout);
        pTittleLayout.setHorizontalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTittleLayout.setVerticalGroup(
            pTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pTongQuan.setBackground(new java.awt.Color(134, 102, 134));

        javax.swing.GroupLayout pTongQuanLayout = new javax.swing.GroupLayout(pTongQuan);
        pTongQuan.setLayout(pTongQuanLayout);
        pTongQuanLayout.setHorizontalGroup(
            pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pTongQuanLayout.setVerticalGroup(
            pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pNoiDungLayout = new javax.swing.GroupLayout(pNoiDung);
        pNoiDung.setLayout(pNoiDungLayout);
        pNoiDungLayout.setHorizontalGroup(
            pNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pNoiDungLayout.setVerticalGroup(
            pNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNoiDungLayout.createSequentialGroup()
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pBackGroundMainLayout = new javax.swing.GroupLayout(pBackGroundMain);
        pBackGroundMain.setLayout(pBackGroundMainLayout);
        pBackGroundMainLayout.setHorizontalGroup(
            pBackGroundMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBackGroundMainLayout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBackGroundMainLayout.setVerticalGroup(
            pBackGroundMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addComponent(pNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBackGroundMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBackGroundMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void congNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congNhanActionPerformed
        pNoiDung = new GDQLCongNhan();
        reFresh();
    }//GEN-LAST:event_congNhanActionPerformed

    private void nhanVienHanhChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanVienHanhChinhActionPerformed
        pNoiDung = new GDQLNhanVienHanhChinh();
        reFresh();
    }//GEN-LAST:event_nhanVienHanhChinhActionPerformed

    private void lblQLNhanSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNhanSuMouseClicked
        menuNhanSu.show(pHome, evt.getX(), evt.getY());
    }//GEN-LAST:event_lblQLNhanSuMouseClicked

    private void lblQLChamCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLChamCongMouseClicked
        menuChamCong.show(pQLChamCong, evt.getX(), evt.getY());
    }//GEN-LAST:event_lblQLChamCongMouseClicked

    private void lblQLLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLLuongMouseClicked
        menuLuong.show(pQLLuong, evt.getX(), evt.getY());
    }//GEN-LAST:event_lblQLLuongMouseClicked

    private void chamCongNVHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamCongNVHCActionPerformed
        pNoiDung = new GDQLChamCongNVHC();
        reFresh();
    }//GEN-LAST:event_chamCongNVHCActionPerformed

    private void chamCongCongNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamCongCongNhanActionPerformed
        pNoiDung = new GDQLChamCongCN();
        reFresh();
    }//GEN-LAST:event_chamCongCongNhanActionPerformed

    private void tinhLuongNVHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhLuongNVHCActionPerformed
       pNoiDung = new GDTinhLuongNV();
        reFresh();
    }//GEN-LAST:event_tinhLuongNVHCActionPerformed

    private void tinhLuongCongNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhLuongCongNhanActionPerformed
        pNoiDung = new GDTinhLuongCN();
        reFresh();
    }//GEN-LAST:event_tinhLuongCongNhanActionPerformed

    private void xemBangLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemBangLuongActionPerformed
        pNoiDung = new GDXemBangLuong();
        reFresh();
    }//GEN-LAST:event_xemBangLuongActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem chamCongCongNhan;
    private javax.swing.JMenuItem chamCongNVHC;
    private javax.swing.JMenuItem congNhan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel lblBaoCao;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblPhanCong;
    private javax.swing.JLabel lblQLChamCong;
    private javax.swing.JLabel lblQLCongDoan;
    private javax.swing.JLabel lblQLHopDong;
    private javax.swing.JLabel lblQLLuong;
    private javax.swing.JLabel lblQLNhanSu;
    private javax.swing.JLabel lblQLSanPham;
    private javax.swing.JLabel lblQLTaiKhoan;
    private javax.swing.JPopupMenu menuChamCong;
    private javax.swing.JPopupMenu menuLuong;
    private javax.swing.JPopupMenu menuNhanSu;
    private javax.swing.JMenuItem nhanVienHanhChinh;
    private javax.swing.JPanel pBackGroundMain;
    private javax.swing.JPanel pBaoCao;
    private javax.swing.JPanel pDangXuat;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pListMenu;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pNhanVien;
    private javax.swing.JPanel pNoiDung;
    private javax.swing.JPanel pPhanCong;
    private javax.swing.JPanel pQLChamCong;
    private javax.swing.JPanel pQLCongDoan;
    private javax.swing.JPanel pQLHopDong;
    private javax.swing.JPanel pQLLuong;
    private javax.swing.JPanel pQLNhanSu;
    private javax.swing.JPanel pQLSanPham;
    private javax.swing.JPanel pQLTaiKhoan;
    private javax.swing.JPanel pTittle;
    private javax.swing.JPanel pTongQuan;
    private javax.swing.JMenuItem tinhLuongCongNhan;
    private javax.swing.JMenuItem tinhLuongNVHC;
    private javax.swing.JMenuItem xemBangLuong;
    // End of variables declaration//GEN-END:variables

    private void reFresh() {
        pChinh.removeAll();
        pChinh.setLayout(new BorderLayout());
        pChinh.add(pNoiDung);
        pChinh.validate();
        pChinh.repaint();
    }
}

