/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu3;

import java.util.Scanner;

/**
 *
 * @author tuant
 */
public class NhanVienVP extends NhanVien{
    private int soNgayNghi;
    private float mucLuong;
    
    @Override 
    public double tinhLuong () {
        return mucLuong = soNgayNghi * 10000;
    }
    
    @Override 
    public void nhap () {
        super.nhap();
        Scanner s = new Scanner (System.in);
        System.out.print("Nhap so ngay nghi: ");
        soNgayNghi = s.nextInt();
        System.out.print("Muc luong: ");
        mucLuong = s.nextInt();
    }
    
    public static void inTieuDe () {
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s %15s%n", "So ngay nghi", "Muc luong", "Phu cap", "Luong");
    }
    
    public final void xuatDL () {
        super.xuatDL();
        System.out.printf("%10d %15f %15.2f %15.2f%n", soNgayNghi, mucLuong, tinhPhuCap(), tinhLuong());
    }
}
