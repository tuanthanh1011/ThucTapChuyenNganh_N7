/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan6.vidu2;

import java.util.Scanner;

/**
 *
 * @author tuant
 */
public class GVCoHuu extends GiangVien implements Comparable<GVCoHuu>{

    private double luongcoban;
    private double hesoluong;
    private double phucap;
    private int sonamcongtac;
    private double luongthang;

    public GVCoHuu(double luongcoban, double hesoluong, int sonamcongtac, String hoten, String diachi, String loaigiangvien) {
        super(hoten, diachi, loaigiangvien);
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.sonamcongtac = sonamcongtac;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public double getPhucap() {
        return phucap;
    }

    public int getSonamcongtac() {
        return sonamcongtac;
    }

    public double getLuongthang() {
        return luongthang;
    }

    public GVCoHuu() {

    }

    @Override
    public double tinhLuong() {
        if (sonamcongtac < 5) {
            phucap = 0;
        } else {
            phucap = ((double) sonamcongtac / 100) * luongcoban;
        }
        luongthang = luongcoban * hesoluong + phucap;
        return luongthang;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cơ bản: ");
        luongcoban = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        hesoluong = sc.nextDouble();
        System.out.print("Nhập số năm công tác: ");
        sonamcongtac = sc.nextInt();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
    }
    
    @Override
    public int compareTo(GVCoHuu o) {
//        int result = this.getHoten().compareTo(o.getHoten());
        if (this.tinhLuong() > o.tinhLuong()) {
            return 1;
        } else if (this.tinhLuong() < o.tinhLuong()) {
            return -1;
        } else {
            return 0;
        }
    }

}
