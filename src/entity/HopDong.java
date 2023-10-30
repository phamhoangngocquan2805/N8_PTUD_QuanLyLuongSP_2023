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
public class HopDong {
    private String maHD;
    private String tenHD;
    private LocalDateTime ngayKiHD;
    private LocalDateTime ngayBanGiao;
    private String ghiChu;
    private int trangThai;
    private NhanVienHanhChinh nv;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public LocalDateTime getNgayKiHD() {
        return ngayKiHD;
    }

    public void setNgayKiHD(LocalDateTime ngayKiHD) {
        this.ngayKiHD = ngayKiHD;
    }

    public LocalDateTime getNgayBanGiao() {
        return ngayBanGiao;
    }

    public void setNgayBanGiao(LocalDateTime ngayBanGiao) {
        this.ngayBanGiao = ngayBanGiao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public NhanVienHanhChinh getNv() {
        return nv;
    }

    public void setNv(NhanVienHanhChinh nv) {
        this.nv = nv;
    }

    public HopDong(String maHD, String tenHD, LocalDateTime ngayKiHD, LocalDateTime ngayBanGiao, String ghiChu, int trangThai, NhanVienHanhChinh nv) {
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.ngayKiHD = ngayKiHD;
        this.ngayBanGiao = ngayBanGiao;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.nv = nv;
    }

    public HopDong(String maHD) {
        this.maHD = maHD;
    }

    public HopDong() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.maHD);
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
        final HopDong other = (HopDong) obj;
        return Objects.equals(this.maHD, other.maHD);
    }

    @Override
    public String toString() {
        return "HopDong{" + "maHD=" + maHD + ", tenHD=" + tenHD + ", ngayKiHD=" + ngayKiHD + ", ngayBanGiao=" + ngayBanGiao + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + ", nv=" + nv + '}';
    }
}
