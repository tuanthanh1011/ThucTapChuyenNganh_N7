/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan8.vidu1;

import java.util.Scanner;
import java.io.*;
import java.util.Objects;

/**
 *
 * @author tuant
 */
public class HVienDH extends HV implements Comparable<HVienDH>, Serializable {

    private int sobuoi;
    private double dongia;
    public double uutien;

    public HVienDH() {
    }

    public HVienDH(String hoten, String diachi, String loaichuongtrinh, String loaiuutien) {
        super(hoten, diachi, loaichuongtrinh, loaiuutien);
    }

    public HVienDH(int sobuoi, double dongia, String hoten, String diachi, String loaichuongtrinh, String loaiuutien) {
        super(hoten, diachi, loaichuongtrinh, loaiuutien);
        this.sobuoi = sobuoi;
        this.dongia = dongia;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        if (getHoten().equals("")) {
            return;
        }
        System.out.print("Số buổi: ");
        do {
            sobuoi = sc.nextInt();
            try {
                if (sobuoi <= 0) {
                    throw new Exception("Du lieu khong hop le!. Nhap lai: ");
                } else {
                    System.out.println("Du lieu hop le!");
                    break;
                }
            } catch (Exception e) {
                System.out.print("Loi: " + e.getMessage());
            }
        } while (true);
        System.out.print("Don gia: ");
        dongia = sc.nextDouble();
    }

    @Override
    public double hocPhi() {

        if (getLoaiuutien().equals("Loai1")) {
            uutien = 1000000;
        } else {
            uutien = 500000;
        }

        return (double) sobuoi * dongia - uutien;
    }

    @Override
    public int compareTo(HVienDH o) {
        if (this.sobuoi > o.sobuoi) {
            return 1;
        } else if (this.sobuoi < o.sobuoi) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-15.2f %-15.2f%n", getHoten(), getDiachi(), getLoaiuutien(), getLoaichuongtrinh(), sobuoi, dongia, hocPhi());
    }
}
