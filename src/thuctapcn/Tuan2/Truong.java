/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_gt_trang139;

/**
 *
 * @author tuant
 */
public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;

    public Truong() {
    }

    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
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

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    
    public String toString() {
        return "Tên: " + ten + ", Địa chỉ: " + diaChi + ", Hiệu trưởng: " + hieuTruong;
    }
}
