/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;
import java.time.LocalDateTime;

public class NhanVienHanhChinh
{
    private String maNV;
    private String hoTen;
    private boolean phai;
    private LocalDateTime ngaySinh;
    private String soDT;
    private String diaChi;
    private boolean tinhTrang;
    private LocalDateTime ngayVaoLam;
    private String hinhAnh;
    private double heSoLuong;
    private double luongCoBan;
    private String chucVu;
    private String email;
    private double tienPhuCapTheoNgay;
    private double tienChuyenCan;
    private String ghiChu;
    private PhongBan phongBan;
    
    public String getMaNV() {
        return this.maNV;
    }
    
    public void setMaNV(final String maNV) {
        this.maNV = maNV;
    }
    
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(final String hoTen) {
        this.hoTen = hoTen;
    }
    
    public boolean isPhai() {
        return this.phai;
    }
    
    public void setPhai(final boolean phai) {
        this.phai = phai;
    }
    
    public LocalDateTime getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(final LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public String getSoDT() {
        return this.soDT;
    }
    
    public void setSoDT(final String soDT) {
        this.soDT = soDT;
    }
    
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(final String diaChi) {
        this.diaChi = diaChi;
    }
    
    public boolean isTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(final boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public LocalDateTime getNgayVaoLam() {
        return this.ngayVaoLam;
    }
    
    public void setNgayVaoLam(final LocalDateTime ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
    public String getHinhAnh() {
        return this.hinhAnh;
    }
    
    public void setHinhAnh(final String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    
    public double getHeSoLuong() {
        return this.heSoLuong;
    }
    
    public void setHeSoLuong(final double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public double getLuongCoBan() {
        return this.luongCoBan;
    }
    
    public void setLuongCoBan(final double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public String getChucVu() {
        return this.chucVu;
    }
    
    public void setChucVu(final String chucVu) {
        this.chucVu = chucVu;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public double getTienPhuCapTheoNgay() {
        return this.tienPhuCapTheoNgay;
    }
    
    public void setTienPhuCapTheoNgay(final double tienPhuCapTheoNgay) {
        this.tienPhuCapTheoNgay = tienPhuCapTheoNgay;
    }
    
    public double getTienChuyenCan() {
        return this.tienChuyenCan;
    }
    
    public void setTienChuyenCan(final double tienChuyenCan) {
        this.tienChuyenCan = tienChuyenCan;
    }
    
    public String getGhiChu() {
        return this.ghiChu;
    }
    
    public void setGhiChu(final String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public PhongBan getPhongBan() {
        return this.phongBan;
    }
    
    public void setPhongBan(final PhongBan phongBan) {
        this.phongBan = phongBan;
    }
    
    public NhanVienHanhChinh(final String maNV, final String hoTen, final boolean phai, final LocalDateTime ngaySinh, final String soDT, final String diaChi, final boolean tinhTrang, final LocalDateTime ngayVaoLam, final String hinhAnh, final double heSoLuong, final double luongCoBan, final String chucVu, final String email, final double tienPhuCapTheoNgay, final double tienChuyenCan, final String ghiChu, final PhongBan phongBan) {
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
        this.chucVu = chucVu;
        this.email = email;
        this.tienPhuCapTheoNgay = tienPhuCapTheoNgay;
        this.tienChuyenCan = tienChuyenCan;
        this.ghiChu = ghiChu;
        this.phongBan = phongBan;
    }
    
    public NhanVienHanhChinh(final String maNV) {
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
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final NhanVienHanhChinh other = (NhanVienHanhChinh)obj;
        return Objects.equals(this.maNV, other.maNV);
    }

    @Override
    public String toString() {
        return "NhanVienHanhChinh{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", phai=" + phai + ", ngaySinh=" + ngaySinh + ", soDT=" + soDT + ", diaChi=" + diaChi + ", tinhTrang=" + tinhTrang + ", ngayVaoLam=" + ngayVaoLam + ", hinhAnh=" + hinhAnh + ", heSoLuong=" + heSoLuong + ", luongCoBan=" + luongCoBan + ", chucVu=" + chucVu + ", email=" + email + ", tienPhuCapTheoNgay=" + tienPhuCapTheoNgay + ", tienChuyenCan=" + tienChuyenCan + ", ghiChu=" + ghiChu + ", phongBan=" + phongBan + '}';
    }
    
    
    
    public String get10char(final String s) {
        return s.substring(0, 10);
    }
    
    public String getNgaySinhString() {
        return this.get10char(this.ngaySinh.toString());
    }
    
    public String getNgayVaoLamString() {
        return this.get10char(this.ngayVaoLam.toString());
    }
}