/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;

/**
 *
 * @author vuhai
 */
public class BangLuongNhanVien {
    private String maBangLuong;
    private LocalDateTime ngayTinhLuong;
    private int soNgayLam;
    private int soNgayNghi;
    private double luongChinh; //Lấy lương cơ bản chia cho 26, nhân với số ngày đi làm
    private double luongTangCa;
    private double tienUng;
//    private 
    private double tienChuyenCanTheoThang;
    private double baoHiemXaHoi;
    private double thucLan;
    private NhanVienHanhChinh nv;

    public String getMaBangLuong() {
        return maBangLuong;
    }

    public LocalDateTime getNgayTinhLuong() {
        return ngayTinhLuong;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public double getLuongChinh() {
        return luongChinh;
    }

    public double getLuongTangCa() {
        return luongTangCa;
    }

    public double getTienUng() {
        return tienUng;
    }

    public double getTienPhuCapTheoThang() {
        return this.nv.getTienPhuCapTheoNgay() * this.soNgayLam;
    }

    public double getTienChuyenCanTheoThang() {
        return tienChuyenCanTheoThang;
    }

    public double getBaoHiemXaHoi() {
        return baoHiemXaHoi;
    }

    public double getThucLan() {
        return thucLan;
    }

    public NhanVienHanhChinh getNv() {
        return nv;
    }

    public void setMaBangLuong(String maBangLuong) {
        this.maBangLuong = maBangLuong;
    }

    public void setNgayTinhLuong(LocalDateTime ngayTinhLuong) {
        this.ngayTinhLuong = ngayTinhLuong;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    public void setLuongChinh(double luongChinh) {
        this.luongChinh = luongChinh;
    }

    public void setLuongTangCa(double luongTangCa) {
        this.luongTangCa = luongTangCa;
    }

    public void setTienUng(double tienUng) {
        this.tienUng = tienUng;
    }

    public void setTienPhuCapTheoThang() {
        
    }

    public void setTienChuyenCanTheoThang() {
        
    }

    public void setBaoHiemXaHoi(double baoHiemXaHoi) {
        this.baoHiemXaHoi = baoHiemXaHoi;
    }

    public void setThucLan(double thucLan) {
        this.thucLan = thucLan;
    }

    public void setNv(NhanVienHanhChinh nv) {
        this.nv = nv;
    }
    
    
}
