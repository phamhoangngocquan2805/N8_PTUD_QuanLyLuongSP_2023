/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author vuhai
 */
public class NhanVienHanhChinh {
    private String maNV;
    private String hoTen;
    private boolean phai;
    private LocalDateTime ngaySinh;
    private String soDT;
    private String diaChi;
    private boolean tinhTrang;
    private LocalDateTime ngayVaoLam;
    private byte[] hinhAnh;
    private double heSoLuong;
    private double luongCoBan;
    private String tenTaiKhoan;
    private String matKhau;
    private String chucVu;
    private String email;
    private double tienPhuCapTheoNgay;
    private double tienChuyenCan;
    private PhongBan phongBan;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isPhai() {
        return phai;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public LocalDateTime getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDateTime ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTienPhuCapTheoNgay() {
        return tienPhuCapTheoNgay;
    }

    public void setTienPhuCapTheoNgay(double tienPhuCapTheoNgay) {
        this.tienPhuCapTheoNgay = tienPhuCapTheoNgay;
    }

    public double getTienChuyenCan() {
        return tienChuyenCan;
    }

    public void setTienChuyenCan(double tienChuyenCan) {
        this.tienChuyenCan = tienChuyenCan;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVienHanhChinh(String maNV, String hoTen, boolean phai, LocalDateTime ngaySinh, String soDT, String diaChi, boolean tinhTrang, LocalDateTime ngayVaoLam, byte[] hinhAnh, double heSoLuong, double luongCoBan, String tenTaiKhoan, String matKhau, String chucVu, String email, double tienPhuCapTheoNgay, double tienChuyenCan, PhongBan phongBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.tinhTrang = tinhTrang;
        this.ngayVaoLam = ngayVaoLam;
        this.hinhAnh = hinhAnh;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.chucVu = chucVu;
        this.email = email;
        this.tienPhuCapTheoNgay = tienPhuCapTheoNgay;
        this.tienChuyenCan = tienChuyenCan;
        this.phongBan = phongBan;
    }

    public NhanVienHanhChinh(String maNV) {
        this.maNV = maNV;
    }

    public NhanVienHanhChinh() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maNV);
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
        final NhanVienHanhChinh other = (NhanVienHanhChinh) obj;
        return Objects.equals(this.maNV, other.maNV);
    }

    @Override
    public String toString() {
        return "NhanVienHanhChinh{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", phai=" + phai + ", ngaySinh=" + ngaySinh + ", soDT=" + soDT + ", diaChi=" + diaChi + ", tinhTrang=" + tinhTrang + ", ngayVaoLam=" + ngayVaoLam + ", hinhAnh=" + hinhAnh + ", heSoLuong=" + heSoLuong + ", luongCoBan=" + luongCoBan + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", chucVu=" + chucVu + ", email=" + email + ", tienPhuCapTheoNgay=" + tienPhuCapTheoNgay + ", tienChuyenCan=" + tienChuyenCan + ", phongBan=" + phongBan + '}';
    }
    
     public String get10char(String s) {
        return s.substring(0, 10);
    }

    public String getNgaySinhString() {
        return get10char(this.ngaySinh.toString());
    }
    public String getNgayVaoLamString() {
        return get10char(this.ngayVaoLam.toString());
    }

}
