/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author vuhai
 */
public class ChiTietBangChamCong {
    private int soLuong;
    private BangPhanCong bangPC;
    private BangChamCongCongNhan bangCC;

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BangPhanCong getBangPC() {
        return bangPC;
    }

    public void setBangPC(BangPhanCong bangPC) {
        this.bangPC = bangPC;
    }

    public BangChamCongCongNhan getBangCC() {
        return bangCC;
    }

    public void setBangCC(BangChamCongCongNhan bangCC) {
        this.bangCC = bangCC;
    }

    public ChiTietBangChamCong(int soLuong, BangPhanCong bangPC, BangChamCongCongNhan bangCC) {
        this.soLuong = soLuong;
        this.bangPC = bangPC;
        this.bangCC = bangCC;
    }

    @Override
    public String toString() {
        return "ChiTietBangChamCong{" + "soLuong=" + soLuong + ", bangPC=" + bangPC + ", bangCC=" + bangCC + '}';
    }
    
    
}
