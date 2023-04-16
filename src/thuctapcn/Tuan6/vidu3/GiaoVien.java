/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan6.vidu3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class GiaoVien {
    private String hoTen;
    private String diaChi;
    private String loaiGv;

    public GiaoVien(String hoTen, String diaChi, String loaiGv) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGv = loaiGv;
    }
    public GiaoVien(){
    
    }
    
    public abstract double tinhLuong();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiGv() {
        return loaiGv;
    }

    public void setLoaiGv(String loaiGv) {
        this.loaiGv = loaiGv;
    }
    
    public void nhap(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi = sc.nextLine();
        System.out.println("Nhap Loai Giang Vien  : ");
        loaiGv = sc.nextLine();
        
    }
    public void xuat(){
        
        System.out.printf("%20s %20s %20s", hoTen , diaChi,loaiGv);
    }
    
}
