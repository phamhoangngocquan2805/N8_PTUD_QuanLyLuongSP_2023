/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author vuhai
 */
public class BangChamCongNhanVien {
    private String maBangChamCong;
    private LocalTime gioVao;
    private LocalTime gioRa;
    private LocalDateTime ngayChamCong;
    private String caLamViec;
    private NhanVienHanhChinh nv;

    public String getMaBangChamCong() {
        return maBangChamCong;
    }

    public void setMaBangChamCong(String maBangChamCong) {
        this.maBangChamCong = maBangChamCong;
    }

    public LocalTime getGioVao() {
        return gioVao;
    }

    public void setGioVao(LocalTime gioVao) {
        this.gioVao = gioVao;
    }

    public LocalTime getGioRa() {
        return gioRa;
    }

    public void setGioRa(LocalTime gioRa) {
        this.gioRa = gioRa;
    }

    public LocalDateTime getNgayChamCong() {
        return ngayChamCong;
    }

    public void setNgayChamCong(LocalDateTime ngayChamCong) {
        this.ngayChamCong = ngayChamCong;
    }

    public String getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(String caLamViec) {
        this.caLamViec = caLamViec;
    }

    public NhanVienHanhChinh getNv() {
        return nv;
    }

    public void setNv(NhanVienHanhChinh nv) {
        this.nv = nv;
    }

    public BangChamCongNhanVien(String maBangChamCong, LocalTime gioVao, LocalTime gioRa, LocalDateTime ngayChamCong, String caLamViec, NhanVienHanhChinh nv) {
        this.maBangChamCong = maBangChamCong;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.ngayChamCong = ngayChamCong;
        this.caLamViec = caLamViec;
        this.nv = nv;
    }

    public BangChamCongNhanVien(String maBangChamCong) {
        this.maBangChamCong = maBangChamCong;
    }

    public BangChamCongNhanVien() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.maBangChamCong);
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
        final BangChamCongNhanVien other = (BangChamCongNhanVien) obj;
        return Objects.equals(this.maBangChamCong, other.maBangChamCong);
    }

    @Override
    public String toString() {
        return "BangChamCongNhanVien{" + "maBangChamCong=" + maBangChamCong + ", gioVao=" + gioVao + ", gioRa=" + gioRa + ", ngayChamCong=" + ngayChamCong + ", caLamViec=" + caLamViec + ", nv=" + nv + '}';
    }
}
