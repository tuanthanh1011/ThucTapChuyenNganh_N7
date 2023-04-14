/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu5;

/**
 *
 * @author IT Supporter
 */
public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;
    Truong(){
        
    }
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    
    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }
    
    @Override
    public String toString() {
        return "Truong{" + "ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + '}';
    }
    
}
