/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author vuhai
 */
public class SanPham {
    private String maSP;
    private String tenSP;
     private int soLuong;
      private double donGia;
    private String thongTin;
    private int soCongDoan;
    private String chatLieu;
    private String doViTinh;
    private HopDong hopDong;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public int getSoCongDoan() {
        return soCongDoan;
    }

    public void setSoCongDoan(int soCongDoan) {
        this.soCongDoan = soCongDoan;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getDoViTinh() {
        return doViTinh;
    }

    public void setDoViTinh(String doViTinh) {
        this.doViTinh = doViTinh;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

    public SanPham(String maSP, String tenSP, int soLuong, double donGia, String thongTin, int soCongDoan, String chatLieu, String doViTinh, HopDong hopDong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thongTin = thongTin;
        this.soCongDoan = soCongDoan;
        this.chatLieu = chatLieu;
        this.doViTinh = doViTinh;
        this.hopDong = hopDong;
    }

    public SanPham(String maSP) {
        this.maSP = maSP;
    }

    public SanPham() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maSP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SanPham other = (SanPham) obj;
        return Objects.equals(this.maSP, other.maSP);
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", thongTin=" + thongTin + ", soCongDoan=" + soCongDoan + ", chatLieu=" + chatLieu + ", doViTinh=" + doViTinh + ", hopDong=" + hopDong + '}';
    }
   
    
}
