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
public class GVThingGiang extends GiaoVien{
    private int soTietDay;
    private float donGia;
    private double thuNhap;
    
    public GVThingGiang(){
        super();
    }

    public GVThingGiang(int soTietDay, float donGia, double thuNhap) {
        this.soTietDay = soTietDay;
        this.donGia = donGia;
        this.thuNhap = thuNhap;
    }
     public GVThingGiang(String hoTen,String diaChi,String loaiGv ,int soTietDay, float donGia, double thuNhap) {
        this.soTietDay = soTietDay;
        this.donGia = donGia;
        this.thuNhap = thuNhap;
    }
     public void nhap(){
         super.nhap();
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so tiet day : ");
         soTietDay = sc.nextInt();
         System.out.println("Nhap don gia  : ");
         donGia = sc.nextInt();
         System.out.println("% Nhap thu nhap  : ");
         thuNhap = sc.nextInt();         
         
     }
    
     public double thuNhap(){
         
        return 0.15 *(soTietDay * donGia);
         
     }
     

    @Override
    public double tinhLuong() {
        return soTietDay * donGia - thuNhap();
    }
    
    public void xuat(){
        
        super.xuat();
        System.out.printf("%20s %20s %20s  ",soTietDay,donGia, tinhLuong() );
    }
}
