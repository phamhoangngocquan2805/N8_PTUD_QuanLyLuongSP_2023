/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author vuhai
 */
public class BangLuongCongNhan {
    private String maBangLuong;
    private LocalDateTime ngayTinhLuong;
    private int soNgayLam;
    private int soNgayNghi;
    private double luongSanPham; //Lấy lương cơ bản chia cho 26, nhân với số ngày đi làm
    private double luongTangCa;
    private double tienUng;
    private double tienPhuCap;
    private double tienChuyenCan;
    private double baoHiemXaHoi;
    private double thucLanh;
    private CongNhan congNhan;
    
    public String getMaBangLuong() {
        return maBangLuong;
    }

    public void setMaBangLuong(String maBangLuong) {
        this.maBangLuong = maBangLuong;
    }

    public LocalDateTime getNgayTinhLuong() {
        return ngayTinhLuong;
    }

    public void setNgayTinhLuong(LocalDateTime ngayTinhLuong) {
        this.ngayTinhLuong = ngayTinhLuong;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    public double getLuongSanPham() {
        return luongSanPham;
    }

    public void setLuongSanPham(ArrayList<BangPhanCong> dsbangPhanCong, ArrayList<ChiTietBangChamCong> dsChiTietBangChamCong) {
        this.luongSanPham = 0;
        for(ChiTietBangChamCong chiTiet: dsChiTietBangChamCong)
        {
            for(BangPhanCong bangPhanCong: dsbangPhanCong)
            {
                if(chiTiet.getBangPC().getMaBangPC().equalsIgnoreCase(bangPhanCong.getMaBangPC()))
                    this.luongSanPham+= chiTiet.getSoLuong() * bangPhanCong.getCongDoan().getDonGia();
            }
        }
        setBaoHiemXaHoi();
    }

    public double getLuongTangCa() {
        return luongTangCa;
    }

    public void setLuongTangCa(ArrayList<BangPhanCong> dsbangPhanCong, ArrayList<ChiTietBangChamCong> dsChiTietBangChamCong) {
        this.luongTangCa = 0;
        for(ChiTietBangChamCong chiTiet: dsChiTietBangChamCong)
        {
            for(BangPhanCong bangPhanCong: dsbangPhanCong)
            {
                if(chiTiet.getBangPC().getMaBangPC().equalsIgnoreCase(bangPhanCong.getMaBangPC()))
                    this.luongTangCa+= chiTiet.getSoLuong() * bangPhanCong.getCongDoan().getDonGia();
            }
        }
        setThucLanh();
    }

    public double getTienUng() {
        return tienUng;
    }

    public void setTienUng(double tienUng) {
        this.tienUng = tienUng;
    }

    public double getTienPhuCap() {
        return tienPhuCap;
    }

    public void setTienPhuCap() {
        this.tienPhuCap = getCongNhan().getTienPhuCapTheoNgay() * soNgayLam;
    }

    public double getTienChuyenCan() {
        return tienChuyenCan;
    }

    public void setTienChuyenCan() {
        if(soNgayLam >= 26)
            this.tienChuyenCan = getCongNhan().getTienChuyenCan();
        else
            this.tienChuyenCan = 0;
    }

    public double getBaoHiemXaHoi() {
        return baoHiemXaHoi;
    }

    public double getThucLanh() {
        return thucLanh;
    }

    public void setThucLanh() {
        this.thucLanh = getLuongSanPham()+ getLuongTangCa() + getTienPhuCap() + getTienChuyenCan() - getTienUng() -getBaoHiemXaHoi();
    }

    public void setBaoHiemXaHoi() {
        this.baoHiemXaHoi = getLuongSanPham()* 0.105;
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public void setCongNhan(CongNhan congNhan) {
        this.congNhan = congNhan;
    }

    public BangLuongCongNhan(String maBangLuong, LocalDateTime ngayTinhLuong, int soNgayLam, int soNgayNghi, double tienUng, CongNhan congNhan) {
        this.maBangLuong = maBangLuong;
        this.ngayTinhLuong = ngayTinhLuong;
        this.soNgayLam = soNgayLam;
        this.soNgayNghi = soNgayNghi;
        this.tienUng = tienUng;
        this.congNhan = congNhan;
        this.luongTangCa = 0;
        setTienPhuCap();
        setTienChuyenCan();
    }

    public BangLuongCongNhan() {
    
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.maBangLuong);
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
        final BangLuongCongNhan other = (BangLuongCongNhan) obj;
        return Objects.equals(this.maBangLuong, other.maBangLuong);
    }

    @Override
    public String toString() {
        return "BangLuongCongNhan{" + "maBangLuong=" + maBangLuong + ", ngayTinhLuong=" + ngayTinhLuong + ", soNgayLam=" + soNgayLam + ", soNgayNghi=" + soNgayNghi + ", luongSanPham=" + luongSanPham + ", luongTangCa=" + luongTangCa + ", tienUng=" + tienUng + ", tienPhuCap=" + tienPhuCap + ", tienChuyenCan=" + tienChuyenCan + ", baoHiemXaHoi=" + baoHiemXaHoi + ", thucLanh=" + thucLanh + ", congNhan=" + congNhan + '}';
    }
    
    public String get10char(final String s) {
        return s.substring(0, 10);
    }
    
    public String getNgayTinhLuongString() {
        return this.get10char(this.ngayTinhLuong.toString());
    }
    
    public void setLuongFromDB(double luongSanPham, double luongTangCa, double tienChuyenCan, double tienPhuCap)
    {
        this.luongSanPham = luongSanPham;
        this.luongTangCa = luongTangCa;
        setBaoHiemXaHoi();
        this.tienChuyenCan = tienChuyenCan;
        this.tienPhuCap = tienPhuCap;
        setThucLanh();
    }
}
