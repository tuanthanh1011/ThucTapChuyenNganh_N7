/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class NguoiLaoDong {
    private String hoTen;
    private String diaChi;
    private String loaiLaoDong;
    
    public abstract double tinhLuong();
    
    public NguoiLaoDong(){
        
    }

    public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
    }

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

    public String getLoaiLaoDong() {
        return loaiLaoDong;
    }

    public void setLoaiLaoDong(String loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap họ tên : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap Dia Chi : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap loai lao động : ");
        hoTen = sc.nextLine();
        
    }
    
    public void xuat(){
        System.out.printf("%20s %20s %20s", hoTen,diaChi,loaiLaoDong);
    }
}
