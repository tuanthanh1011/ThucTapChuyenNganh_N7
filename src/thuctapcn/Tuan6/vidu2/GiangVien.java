/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan6.vidu2;

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

/**
 *
 * @author tuant
 */
public abstract class GiangVien {

    private String hoten;
    private String diachi;
    private String loaigiangvien;

    public GiangVien(String hoten, String diachi, String loaigiangvien) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaigiangvien = loaigiangvien;
    }

    public GiangVien() {
        
    }

    public String getHoten() {
        return hoten;
    }
    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        do {
            hoten = sc.nextLine();
            if ("".equals(hoten)) {
                System.out.println("Họ tên không được bỏ trống. Nhập lại: ");
            }
        }while("".equals(hoten));
        
        System.out.print("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        System.out.print("Nhập loại giảng viên(Giảng viên cơ hữu và Giảng viên thỉnh giảng): ");
        loaigiangvien = sc.nextLine();
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.printf("%-20s %-35s %-25s %-15.2f%n", hoten, diachi, loaigiangvien, tinhLuong());
    }
   
}
