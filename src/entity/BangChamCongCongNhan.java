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
public class BangChamCongCongNhan {
    private String maBangChamCong;
    private LocalTime gioVao;
    private LocalTime gioRa;
    private LocalDateTime ngayChamCong;
    private String caLamViec;
    private CongNhan cn;

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

    public CongNhan getCn() {
        return cn;
    }

    public void setCn(CongNhan cn) {
        this.cn = cn;
    }

    public BangChamCongCongNhan(String maBangChamCong, LocalTime gioVao, LocalTime gioRa, LocalDateTime ngayChamCong, String caLamViec, CongNhan cn) {
        this.maBangChamCong = maBangChamCong;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.ngayChamCong = ngayChamCong;
        this.caLamViec = caLamViec;
        this.cn = cn;
    }

    public BangChamCongCongNhan() {
    }

    public BangChamCongCongNhan(String maBangChamCong) {
        this.maBangChamCong = maBangChamCong;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.maBangChamCong);
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
        final BangChamCongCongNhan other = (BangChamCongCongNhan) obj;
        return Objects.equals(this.maBangChamCong, other.maBangChamCong);
    }

    @Override
    public String toString() {
        return "BangChamCongCongNhan{" + "maBangChamCong=" + maBangChamCong + ", gioVao=" + gioVao + ", gioRa=" + gioRa + ", ngayChamCong=" + ngayChamCong + ", caLamViec=" + caLamViec + ", cn=" + cn + '}';
    }
    public String get10char(String s) {
        return s.substring(0, 10);
    }
     public String getNgayChamCongString() {
        return get10char(this.ngayChamCong.toString());
    }
    public String getGioVaoString() {
        return get10char(this.gioVao.toString());
    }
    public String getGioRaString() {
        return get10char(this.gioRa.toString());
    }
}
