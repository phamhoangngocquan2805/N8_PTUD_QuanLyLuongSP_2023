/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import com.itextpdf.text.Document;
//import com.itextpdf.text.FontFactory;

import com.itextpdf.text.PageSize;
//import com.itextpdf.text.pdf.BaseFont;
//import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;

import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfTemplate;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author vuhai
 */
public class PrintReviewNV extends javax.swing.JPanel {

    /**
     * Creates new form PrintReview
     */
    public PrintReviewNV() {
        Font customFont = null;
        try {
            try {
                customFont = Font.createFont(Font.TRUETYPE_FONT, new File("libs/vuArial.ttf")).deriveFont(12f);
            } catch (FontFormatException ex) {
                Logger.getLogger(PrintReviewNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintReviewNV.class.getName()).log(Level.SEVERE, null, ex);
        }
//        java.awt.Font font = new java.awt.Font("Arial", java.awt.Font.PLAIN, 12);
        this.setFont(customFont);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTenNV = new javax.swing.JLabel();
        jLabelTieuDe = new javax.swing.JLabel();
        jLabelPhietTT = new javax.swing.JLabel();
        jLabelNgay = new javax.swing.JLabel();
        jLabelSoNgayLam = new javax.swing.JLabel();
        jLabelSoNgayNghi = new javax.swing.JLabel();
        jLabelLuongChinh = new javax.swing.JLabel();
        jLabelLuongTangCa = new javax.swing.JLabel();
        jLabelTienPhuCap = new javax.swing.JLabel();
        jLabelTienChuyenCan = new javax.swing.JLabel();
        jLabelTienUng = new javax.swing.JLabel();
        jLabelBHXH = new javax.swing.JLabel();
        jLabelThucLanh = new javax.swing.JLabel();
        jTextFieldSNL = new javax.swing.JTextField();
        jTextFieldTen = new javax.swing.JTextField();
        jTextFieldSNN = new javax.swing.JTextField();
        jTextFieldLC = new javax.swing.JTextField();
        jTextFieldLTC = new javax.swing.JTextField();
        jTextFieldTPC = new javax.swing.JTextField();
        jTextFieldTCC = new javax.swing.JTextField();
        jTextFieldTU = new javax.swing.JTextField();
        jTextFieldBHXH = new javax.swing.JTextField();
        jTextFieldTL = new javax.swing.JTextField();
        jButtonPDF = new javax.swing.JButton();
        jTextFieldThang = new javax.swing.JTextField();
        jTextFieldNgay = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabelTenNV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTenNV.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTenNV.setText("Tên nhân viên:");

        jLabelTieuDe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTieuDe.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTieuDe.setText("Công ty TNHH May mặc Thịnh Vượng");

        jLabelPhietTT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPhietTT.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPhietTT.setText("Phiếu thanh toán lương tháng");

        jLabelNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNgay.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNgay.setText("Ngày: ");

        jLabelSoNgayLam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelSoNgayLam.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSoNgayLam.setText("Số ngày làm:");

        jLabelSoNgayNghi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelSoNgayNghi.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSoNgayNghi.setText("Số ngày nghỉ:");

        jLabelLuongChinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelLuongChinh.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLuongChinh.setText("Lương chính:");

        jLabelLuongTangCa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelLuongTangCa.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLuongTangCa.setText("Lương tăng ca:");

        jLabelTienPhuCap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTienPhuCap.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTienPhuCap.setText("Tiền phụ cấp:");

        jLabelTienChuyenCan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTienChuyenCan.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTienChuyenCan.setText("Tiền chuyên cần:");

        jLabelTienUng.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTienUng.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTienUng.setText("Tiền ứng:");

        jLabelBHXH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelBHXH.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBHXH.setText("Bảo hiểm xã hội:");

        jLabelThucLanh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelThucLanh.setForeground(new java.awt.Color(0, 0, 0));
        jLabelThucLanh.setText("Thực lãnh:");

        jTextFieldSNL.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSNL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldSNL.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldSNL.setBorder(null);
        jTextFieldSNL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSNLActionPerformed(evt);
            }
        });

        jTextFieldTen.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTen.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTen.setBorder(null);
        jTextFieldTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTenActionPerformed(evt);
            }
        });

        jTextFieldSNN.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSNN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldSNN.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldSNN.setBorder(null);
        jTextFieldSNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSNNActionPerformed(evt);
            }
        });

        jTextFieldLC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldLC.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLC.setBorder(null);
        jTextFieldLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLCActionPerformed(evt);
            }
        });

        jTextFieldLTC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLTC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldLTC.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLTC.setBorder(null);
        jTextFieldLTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLTCActionPerformed(evt);
            }
        });

        jTextFieldTPC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTPC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTPC.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTPC.setBorder(null);
        jTextFieldTPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTPCActionPerformed(evt);
            }
        });

        jTextFieldTCC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTCC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTCC.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTCC.setBorder(null);
        jTextFieldTCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTCCActionPerformed(evt);
            }
        });

        jTextFieldTU.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTU.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTU.setBorder(null);
        jTextFieldTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTUActionPerformed(evt);
            }
        });

        jTextFieldBHXH.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldBHXH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldBHXH.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldBHXH.setBorder(null);
        jTextFieldBHXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBHXHActionPerformed(evt);
            }
        });

        jTextFieldTL.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTL.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTL.setBorder(null);
        jTextFieldTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTLActionPerformed(evt);
            }
        });

        jButtonPDF.setBackground(new java.awt.Color(191, 95, 95));
        jButtonPDF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonPDF.setText("In PDF");
        jButtonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFActionPerformed(evt);
            }
        });

        jTextFieldThang.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldThang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldThang.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldThang.setBorder(null);
        jTextFieldThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldThangActionPerformed(evt);
            }
        });

        jTextFieldNgay.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNgay.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNgay.setBorder(null);
        jTextFieldNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNgayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSoNgayNghi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSNN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLuongChinh)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelLuongTangCa)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLTC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTenNV)
                            .addComponent(jLabelSoNgayLam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSNL, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTen, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTienChuyenCan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTienUng, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBHXH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelThucLanh, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTL)
                            .addComponent(jTextFieldTCC)
                            .addComponent(jTextFieldBHXH)
                            .addComponent(jTextFieldTU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTPC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelTienPhuCap))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabelPhietTT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldThang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTieuDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhietTT)
                    .addComponent(jTextFieldThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNgay)
                    .addComponent(jTextFieldNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTenNV)
                            .addComponent(jTextFieldTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSoNgayLam)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSoNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLuongChinh)
                            .addComponent(jTextFieldLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLuongTangCa)
                            .addComponent(jTextFieldLTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldSNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTienPhuCap)
                            .addComponent(jTextFieldTCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTienChuyenCan)
                            .addComponent(jTextFieldTPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTienUng, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBHXH)
                            .addComponent(jTextFieldBHXH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelThucLanh)
                            .addComponent(jTextFieldTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSNLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSNLActionPerformed

    private void jTextFieldTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTenActionPerformed

    private void jTextFieldSNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSNNActionPerformed

    private void jTextFieldLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLCActionPerformed

    private void jTextFieldLTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLTCActionPerformed

    private void jTextFieldTPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTPCActionPerformed

    private void jTextFieldTCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTCCActionPerformed

    private void jTextFieldTUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTUActionPerformed

    private void jTextFieldBHXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBHXHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBHXHActionPerformed

    private void jTextFieldTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTLActionPerformed

    private void jButtonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFActionPerformed
        // TODO add your handling code here:
        jButtonPDF.setVisible(false);
//        // Create a new PDF document
//        Document document = new Document();
//        try {
//            String fileName = "Bảng lương tháng " + obj[1].toString().substring(5, 7) + "-" + obj[0].toString();
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\" + fileName + ".pdf"));
//            document.open();
//            document.setPageSize(PageSize.A4);
//
//            // Create a template and a Graphics2D object
//            PdfContentByte contentByte = writer.getDirectContent();
//            PdfTemplate template = contentByte.createTemplate(500, 500);
//            Graphics2D g2 = template.createGraphics(800, 500);
//            jLabelTieuDe.setText("Cong ty TNHH May mac Thinh Vuong");
//            jLabelPhietTT.setText("Phieu thanh toan luong thang");
//            jLabelBHXH.setText("Bao hiem xa hoi:");
//            jLabelLuongChinh.setText("Luong chinh");
//            
//            // Print the JPanel and its contents to the PDF
//            PrintReviewNV.this.print(g2);
//
//            // Cleanup
//            g2.dispose();
//            contentByte.addTemplate(template, 30, 300);
//            document.close();
//        } catch (Exception e) {
//        }
//        // Show the button again
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable(){
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if(pageIndex >0 )
                {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D graphics2D = (Graphics2D)graphics;
                graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                graphics2D.scale(0.8, 0.8);
                PrintReviewNV.this.print(graphics2D);
                return Printable.PAGE_EXISTS;
            }
            
        });
        boolean check = job.printDialog();
        if(check)
        {
            try {
                job.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
            }
        }
        jButtonPDF.setVisible(true);
        
    }//GEN-LAST:event_jButtonPDFActionPerformed

    private void jTextFieldThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldThangActionPerformed

    private void jTextFieldNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNgayActionPerformed

    public void setGiaTri(Object[] obj) {
        this.obj = obj;
        jTextFieldThang.setEditable(false);
        jTextFieldNgay.setEditable(false);
        jTextFieldTen.setEditable(false);
        jTextFieldSNN.setEditable(false);
        jTextFieldSNL.setEditable(false);
        jTextFieldLC.setEditable(false);
        jTextFieldLTC.setEditable(false);
        jTextFieldTPC.setEditable(false);
        jTextFieldTCC.setEditable(false);
        jTextFieldTU.setEditable(false);
        jTextFieldBHXH.setEditable(false);
        jTextFieldTL.setEditable(false);
//        jTextField.setEditable(false);

        jTextFieldThang.setText(obj[0].toString().substring(2, 4));
        jTextFieldNgay.setText(obj[2].toString());
        jTextFieldTen.setText(obj[1].toString());
        jTextFieldSNL.setText(obj[3].toString());
        jTextFieldSNN.setText(obj[4].toString());
        jTextFieldLC.setText(obj[5].toString());
        jTextFieldLTC.setText(obj[6].toString());
        jTextFieldTPC.setText(obj[7].toString());
        jTextFieldTCC.setText(obj[8].toString());
        jTextFieldTU.setText(obj[9].toString());
        jTextFieldBHXH.setText(obj[10].toString());
        jTextFieldTL.setText(obj[11].toString());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPDF;
    private javax.swing.JLabel jLabelBHXH;
    private javax.swing.JLabel jLabelLuongChinh;
    private javax.swing.JLabel jLabelLuongTangCa;
    private javax.swing.JLabel jLabelNgay;
    private javax.swing.JLabel jLabelPhietTT;
    private javax.swing.JLabel jLabelSoNgayLam;
    private javax.swing.JLabel jLabelSoNgayNghi;
    private javax.swing.JLabel jLabelTenNV;
    private javax.swing.JLabel jLabelThucLanh;
    private javax.swing.JLabel jLabelTienChuyenCan;
    private javax.swing.JLabel jLabelTienPhuCap;
    private javax.swing.JLabel jLabelTienUng;
    private javax.swing.JLabel jLabelTieuDe;
    private javax.swing.JTextField jTextFieldBHXH;
    private javax.swing.JTextField jTextFieldLC;
    private javax.swing.JTextField jTextFieldLTC;
    private javax.swing.JTextField jTextFieldNgay;
    private javax.swing.JTextField jTextFieldSNL;
    private javax.swing.JTextField jTextFieldSNN;
    private javax.swing.JTextField jTextFieldTCC;
    private javax.swing.JTextField jTextFieldTL;
    private javax.swing.JTextField jTextFieldTPC;
    private javax.swing.JTextField jTextFieldTU;
    private javax.swing.JTextField jTextFieldTen;
    private javax.swing.JTextField jTextFieldThang;
    // End of variables declaration//GEN-END:variables
    private Object[] obj;
}
