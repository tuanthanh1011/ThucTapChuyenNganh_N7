/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan8.vidu1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author tuant
 */
public abstract class HV implements Serializable{

    private String hoten;
    private String diachi;
    private String loaichuongtrinh;
    private String loaiuutien;

    public HV() {
    }

    public HV(String hoten, String diachi, String loaichuongtrinh, String loaiuutien) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaichuongtrinh = loaichuongtrinh;
        this.loaiuutien = loaiuutien;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getLoaichuongtrinh() {
        return loaichuongtrinh;
    }

    public String getLoaiuutien() {
        return loaiuutien;
    }

    public abstract double hocPhi();

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho ten: ");
        hoten = sc.nextLine();
        if (hoten.equals("")) return;
        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.print("Nhap loai uu tien(Loai1, Loai2): ");
        do {
            loaiuutien = sc.nextLine();
            if (!loaiuutien.equalsIgnoreCase("Loai1") && !loaiuutien.equalsIgnoreCase("Loai2")) {
                System.out.print("Khong ton tai loai uu tien. Nhap lai: ");
            }

        } while (!loaiuutien.equalsIgnoreCase("Loai1") && !loaiuutien.equalsIgnoreCase("Loai2"));
        System.out.print("Nhap loai chuong trinh(Do hoa, Lap trinh): ");
        do {
            loaichuongtrinh = sc.nextLine();
            if (!loaichuongtrinh.equalsIgnoreCase("Do hoa") && !loaichuongtrinh.equalsIgnoreCase("Lap trinh")) {
                System.out.print("Khong ton tai loai chuong trinh. Nhap lai: ");
            }
        } while (!loaichuongtrinh.equalsIgnoreCase("Do hoa") && !loaichuongtrinh.equalsIgnoreCase("Lap trinh"));
    }

    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %15.2f%n", hoten, diachi, loaiuutien, loaichuongtrinh, hocPhi());
    }

    public void setLoaiuutien(String loaiuutien) {
        this.loaiuutien = loaiuutien;
    }
    
}
