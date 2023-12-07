/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

public class TaiKhoan {
    
    private NhanVienHanhChinh nv;
    private String tenTK;
    private String matKhau;
    

    public String getTenTK() {
        return this.tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }


    public NhanVienHanhChinh getNv() {
        return this.nv;
    }

    public void setNv( NhanVienHanhChinh nv) {
        this.nv = nv;
    }

    public TaiKhoan( NhanVienHanhChinh nv, String tenTK, String matKhau ) {
        this.nv = nv;
        this.tenTK = tenTK;
        this.matKhau = matKhau;     
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nv);
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
        final TaiKhoan other = (TaiKhoan) obj;
        return Objects.equals(this.nv, other.nv);
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + " tenTK=" + tenTK + ", matKhau=" + matKhau + ",  nv=" + nv + '}';
    }

}
