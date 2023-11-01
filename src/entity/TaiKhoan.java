/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

public class TaiKhoan
{
    private String maTK;
    private String tenTK;
    private String matKhau;
    private String quyenHan;
    private NhanVienHanhChinh nv;
    
    public String getMaTK() {
        return this.maTK;
    }
    
    public void setMaTK(final String maTK) {
        this.maTK = maTK;
    }
    
    public String getTenTK() {
        return this.tenTK;
    }
    
    public void setTenTK(final String tenTK) {
        this.tenTK = tenTK;
    }
    
    public String getMatKhau() {
        return this.matKhau;
    }
    
    public void setMatKhau(final String matKhau) {
        this.matKhau = matKhau;
    }
    
    public String getQuyenHan() {
        return this.quyenHan;
    }
    
    public void setQuyenHan(final String quyenHan) {
        this.quyenHan = quyenHan;
    }
    
    public NhanVienHanhChinh getNv() {
        return this.nv;
    }
    
    public void setNv(final NhanVienHanhChinh nv) {
        this.nv = nv;
    }
    
    public TaiKhoan(final String maTK, final String tenTK, final String matKhau, final String quyenHan, final NhanVienHanhChinh nv) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.quyenHan = quyenHan;
        this.nv = nv;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.maTK);
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
        final TaiKhoan other = (TaiKhoan)obj;
        return Objects.equals(this.maTK, other.maTK);
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTK=" + maTK + ", tenTK=" + tenTK + ", matKhau=" + matKhau + ", quyenHan=" + quyenHan + ", nv=" + nv + '}';
    }
    
    
}