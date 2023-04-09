/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author tuant
 */
public class NhanVienDemo {

    static int soNV, loaiNV;
    static double tongLuong = 0f;
    static NhanVien[] myNV = new NhanVien[soNV];
    
    public static void main (String[] args) {
        System.out.print("Nhap so luong nhan vien: ");
        nhapDSNV();
        inDSNV();
    }
    
    public static void nhapDSNV() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soNV = s.nextInt();
        // Cấp phát n biến mảng theo lớp cha
        for (int i = 0; i < soNV; i++) {
            System.out.print("1.Nhập NVSX, 2. NVVP");
            loaiNV = s.nextInt();
            if (loaiNV == 1) {
                myNV[i] = new NhanVienSX();
            } else {
                myNV[i] = new NhanVienVP();
            }
            myNV[i].nhap();
            // Tính tổng lương
            tongLuong = tongLuong + myNV[i].tinhLuong() + myNV[i].tinhPhuCap();
        }
    }

    public static void inDSNV() {
        System.out.println("\nDanh sách nhân viên SX công ty là: ");
        NhanVienSX.inTieuDe();
        for (int i = 0; i < soNV; i++) 
            if (myNV[i] instanceof NhanVienSX) 
                myNV[i].xuatDL();
        System.out.println("\nDanh sách nhân viên VP công ty là: ");
        NhanVienVP.inTieuDe();
        for(int i = 0; i < soNV; i++) 
            if (myNV[i] instanceof NhanVienVP)
                myNV[i].xuatDL();
        DecimalFormat f = new DecimalFormat("###,###.0#");
        System.out.println("Tong luong nhan vien: " + f.format(tongLuong));
    }
}
