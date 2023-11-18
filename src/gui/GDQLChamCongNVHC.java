/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.BangChamCongNhanVien_DAO;
import dao.NhanVienHanhChinh_DAO;
import entity.BangChamCongNhanVien;
import entity.NhanVienHanhChinh;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ngọc Quân
 */
public class GDQLChamCongNVHC extends javax.swing.JPanel {

    private NhanVienHanhChinh_DAO nvhc_DAO;
    private BangChamCongNhanVien_DAO bcc_DAO;
    private DefaultTableModel modelDSNhanVien;
    private DefaultTableModel modelDSChamCong;

    /**
     * Creates new form GDQLChamCongNVHC
     */
    public GDQLChamCongNVHC() {
        nvhc_DAO = new NhanVienHanhChinh_DAO();
        initComponents();
        

        String[] header_ChamCong = {"STT", "Mã nhân viên", "Tên nhân viên", "Ngày chấm", "Giờ vào", "Giờ ra", "Ca làm việc"};
        modelDSChamCong = new DefaultTableModel(header_ChamCong, 0);
        tableChamCong.setModel(modelDSChamCong);

        loadDSNhanVienLenUI();
        loadDSChamCongNVLenUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pQLChamCongNVHC = new javax.swing.JPanel();
        pTittle = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pTongQuan = new javax.swing.JPanel();
        pXuLy = new javax.swing.JPanel();
        btnBatDauCC = new javax.swing.JButton();
        btnKetThucCC = new javax.swing.JButton();
        btnChonTatCa = new javax.swing.JButton();
        dateNgayCC = new com.toedter.calendar.JDateChooser();
        pLoc = new javax.swing.JPanel();
        cbxLocTheoCV = new javax.swing.JComboBox<>();
        cbxLocTheoPB = new javax.swing.JComboBox<>();
        jscrDSNhanVien = new javax.swing.JScrollPane();
        tableDSNhanVien = new javax.swing.JTable();
        pTraCuu = new javax.swing.JPanel();
        btnXemCong = new javax.swing.JButton();
        dateTuNgay = new com.toedter.calendar.JDateChooser();
        dateDenNgay = new com.toedter.calendar.JDateChooser();
        pXoa = new javax.swing.JPanel();
        btnXoaCC = new javax.swing.JButton();
        jscrChamCong = new javax.swing.JScrollPane();
        tableChamCong = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(958, 735));

        pQLChamCongNVHC.setMaximumSize(new java.awt.Dimension(958, 735));
        pQLChamCongNVHC.setPreferredSize(new java.awt.Dimension(958, 735));

        pTittle.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(191, 95, 95));
        jLabel15.setText("QUẢN LÝ CHẤM CÔNG NHÂN VIÊN HÀNH CHÍNH");

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

        pTongQuan.setBackground(new java.awt.Color(217, 217, 217));

        pXuLy.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(204, 204, 255)), "Xử lý"));

        btnBatDauCC.setBackground(new java.awt.Color(255, 102, 102));
        btnBatDauCC.setForeground(new java.awt.Color(255, 255, 255));
        btnBatDauCC.setText("<html><center>Bắt đầu<br>chấm công</center></html>");
        btnBatDauCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatDauCCActionPerformed(evt);
            }
        });

        btnKetThucCC.setBackground(new java.awt.Color(255, 102, 102));
        btnKetThucCC.setForeground(new java.awt.Color(255, 255, 255));
        btnKetThucCC.setText("<html><center>Kết thúc<br>chấm công</center></html>");
        btnKetThucCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucCCActionPerformed(evt);
            }
        });

        btnChonTatCa.setBackground(new java.awt.Color(255, 102, 102));
        btnChonTatCa.setForeground(new java.awt.Color(255, 255, 255));
        btnChonTatCa.setText("<html><center>Chọn<br>Tất cả</center></html>");
        btnChonTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonTatCaActionPerformed(evt);
            }
        });

        dateNgayCC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null), "Ngày chấm công", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        javax.swing.GroupLayout pXuLyLayout = new javax.swing.GroupLayout(pXuLy);
        pXuLy.setLayout(pXuLyLayout);
        pXuLyLayout.setHorizontalGroup(
            pXuLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pXuLyLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnChonTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateNgayCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBatDauCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKetThucCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pXuLyLayout.setVerticalGroup(
            pXuLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pXuLyLayout.createSequentialGroup()
                .addGroup(pXuLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pXuLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBatDauCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKetThucCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnChonTatCa)
                    .addComponent(dateNgayCC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pLoc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 255, 255), null, new java.awt.Color(204, 204, 255)), "Lọc theo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        cbxLocTheoCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản đốc", "Trưởng phòng kế toán", "Trưởng phòng nhân sự", "Nhân viên" }));
        cbxLocTheoCV.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức vụ"));
        cbxLocTheoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocTheoCVActionPerformed(evt);
            }
        });

        cbxLocTheoPB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng kế toán", "Phòng nhân sự", "Phòng điều hành phân xưởng" }));
        cbxLocTheoPB.setBorder(javax.swing.BorderFactory.createTitledBorder("Phòng ban"));
        cbxLocTheoPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocTheoPBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLocLayout = new javax.swing.GroupLayout(pLoc);
        pLoc.setLayout(pLocLayout);
        pLocLayout.setHorizontalGroup(
            pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxLocTheoPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxLocTheoCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pLocLayout.setVerticalGroup(
            pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbxLocTheoPB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbxLocTheoCV))
        );

        jscrDSNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, new java.awt.Color(204, 0, 0)), "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tableDSNhanVien.setAutoCreateRowSorter(true);
        tableDSNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        tableDSNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,  new Boolean(false), null, null, null, null},
                {null,  new Boolean(false), null, null, null, null},
                {null,  new Boolean(false), null, null, null, null},
                {null,  new Boolean(false), null, null, null, null},
                {null,  new Boolean(false), null, null, null, null},
                {null,  new Boolean(false), null, null, null, null},
                {null, null, null, null, null, null},
                {null,  new Boolean(false), null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Chọn", "Mã nhân viên", "Tên nhân viên", "Phòng ban", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDSNhanVien.setGridColor(new java.awt.Color(153, 153, 153));
        jscrDSNhanVien.setViewportView(tableDSNhanVien);
        if (tableDSNhanVien.getColumnModel().getColumnCount() > 0) {
            tableDSNhanVien.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableDSNhanVien.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        pTraCuu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(204, 204, 255)), "Tra cứu chấm công"));
        pTraCuu.setPreferredSize(new java.awt.Dimension(419, 65));

        btnXemCong.setBackground(new java.awt.Color(255, 102, 102));
        btnXemCong.setForeground(new java.awt.Color(255, 255, 255));
        btnXemCong.setText("Xem công");
        btnXemCong.setActionCommand("");
        btnXemCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCongActionPerformed(evt);
            }
        });

        dateTuNgay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null), "Từ ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        dateDenNgay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null), "Đến ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        javax.swing.GroupLayout pTraCuuLayout = new javax.swing.GroupLayout(pTraCuu);
        pTraCuu.setLayout(pTraCuuLayout);
        pTraCuuLayout.setHorizontalGroup(
            pTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTraCuuLayout.createSequentialGroup()
                .addComponent(dateTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemCong)
                .addContainerGap())
        );
        pTraCuuLayout.setVerticalGroup(
            pTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnXemCong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pTraCuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(dateTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dateDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pXoa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(204, 204, 255)), "Chỉnh sửa chấm công"));

        btnXoaCC.setBackground(new java.awt.Color(255, 102, 102));
        btnXoaCC.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaCC.setText("Xóa");
        btnXoaCC.setActionCommand("");
        btnXoaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pXoaLayout = new javax.swing.GroupLayout(pXoa);
        pXoa.setLayout(pXoaLayout);
        pXoaLayout.setHorizontalGroup(
            pXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXoaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pXoaLayout.setVerticalGroup(
            pXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pXoaLayout.createSequentialGroup()
                .addComponent(btnXoaCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jscrChamCong.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, new java.awt.Color(204, 0, 0)), "Danh sách chấm công", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tableChamCong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        tableChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã nhân viên", "Tên nhân viên", "Ngày chấm", "Giờ vào", "Giờ ra", "Ca làm việc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChamCong.setGridColor(new java.awt.Color(153, 153, 153));
        jscrChamCong.setViewportView(tableChamCong);

        javax.swing.GroupLayout pTongQuanLayout = new javax.swing.GroupLayout(pTongQuan);
        pTongQuan.setLayout(pTongQuanLayout);
        pTongQuanLayout.setHorizontalGroup(
            pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscrDSNhanVien)
            .addGroup(pTongQuanLayout.createSequentialGroup()
                .addGroup(pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTongQuanLayout.createSequentialGroup()
                        .addComponent(pXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pTongQuanLayout.createSequentialGroup()
                        .addComponent(pTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jscrChamCong)
        );
        pTongQuanLayout.setVerticalGroup(
            pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTongQuanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrDSNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTongQuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(pXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pQLChamCongNVHCLayout = new javax.swing.GroupLayout(pQLChamCongNVHC);
        pQLChamCongNVHC.setLayout(pQLChamCongNVHCLayout);
        pQLChamCongNVHCLayout.setHorizontalGroup(
            pQLChamCongNVHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pQLChamCongNVHCLayout.setVerticalGroup(
            pQLChamCongNVHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQLChamCongNVHCLayout.createSequentialGroup()
                .addComponent(pTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTongQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pQLChamCongNVHC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pQLChamCongNVHC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatDauCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatDauCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatDauCCActionPerformed

    private void btnKetThucCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucCCActionPerformed
        // TODO add your handling code here:
//        comfirmCC.setVisible(true);
    }//GEN-LAST:event_btnKetThucCCActionPerformed

    private void btnChonTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonTatCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChonTatCaActionPerformed

    private void cbxLocTheoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocTheoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLocTheoCVActionPerformed

    private void cbxLocTheoPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocTheoPBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLocTheoPBActionPerformed

    private void btnXemCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemCongActionPerformed

    private void btnXoaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaCCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatDauCC;
    private javax.swing.JButton btnChonTatCa;
    private javax.swing.JButton btnKetThucCC;
    private javax.swing.JButton btnXemCong;
    private javax.swing.JButton btnXoaCC;
    private javax.swing.JComboBox<String> cbxLocTheoCV;
    private javax.swing.JComboBox<String> cbxLocTheoPB;
    private com.toedter.calendar.JDateChooser dateDenNgay;
    private com.toedter.calendar.JDateChooser dateNgayCC;
    private com.toedter.calendar.JDateChooser dateTuNgay;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jscrChamCong;
    private javax.swing.JScrollPane jscrDSNhanVien;
    private javax.swing.JPanel pLoc;
    private javax.swing.JPanel pQLChamCongNVHC;
    private javax.swing.JPanel pTittle;
    private javax.swing.JPanel pTongQuan;
    private javax.swing.JPanel pTraCuu;
    private javax.swing.JPanel pXoa;
    private javax.swing.JPanel pXuLy;
    private javax.swing.JTable tableChamCong;
    private javax.swing.JTable tableDSNhanVien;
    // End of variables declaration//GEN-END:variables

    private void clearTableNhanVien() {
        while (tableDSNhanVien.getRowCount() > 0) {
            modelDSNhanVien.removeRow(0);
        }
    }

    private void clearTableCC() {
        while (tableChamCong.getRowCount() > 0) {
            modelDSChamCong.removeRow(0);
        }
    }

//    load danh sách nhân viên còn làm lên UI
    private void loadDSNhanVienLenUI() {
//        clearTableNhanVien();
        int stt = 1;
        modelDSNhanVien = new DefaultTableModel() {
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return Boolean.class;
                    case 2:
                        return String.class;
                    case 3:
                        return String.class;
                    case 4:
                        return String.class;
                    case 5:
                        return String.class;
                    case 6:
                        return String.class;
                    default:
                        throw new AssertionError();
                }
            }
        };
        modelDSNhanVien.addColumn("STT");
        modelDSNhanVien.addColumn("Chọn");
        modelDSNhanVien.addColumn("Mã nhân viên");
        modelDSNhanVien.addColumn("Tên nhân viên");
        modelDSNhanVien.addColumn("Phòng ban");
        modelDSNhanVien.addColumn("Chức vụ");
        tableDSNhanVien.setModel(modelDSNhanVien);
        
        for (NhanVienHanhChinh nv : nvhc_DAO.getNhanVienByTinhTrang(true)) {
            modelDSNhanVien.addRow(new Object[]{
                stt, false, nv.getMaNV(), nv.getHoTen(), nv.getPhongBan().getTenPB(), nv.getChucVu()
            });
            stt++;
        }

    }

//    load danh sách chấm công lên UI
    private void loadDSChamCongNVLenUI() {
        clearTableCC();
        int stt = 1;
        bcc_DAO = new BangChamCongNhanVien_DAO();
        for (BangChamCongNhanVien bcc : bcc_DAO.getAllBangChamCongNhanVien()) {
            modelDSChamCong.addRow(new Object[]{
                stt, bcc.getNv().getMaNV(), bcc.getNv().getHoTen(), bcc.getNgayChamCong(), bcc.getGioVao(), bcc.getGioRa(), bcc.getCaLamViec()
            });
            stt++;
        }

    }
}
