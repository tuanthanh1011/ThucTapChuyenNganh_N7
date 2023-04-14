/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu7;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public class CNTCN extends CongNhan implements Comparable<CNTCN> {

    private double luongcoban;
    private double hesoluong;
    private double thuong;
    private int snc;
    private double luongthang;

    public CNTCN(double luongcoban, double hesoluong, int snc, String hoten, String diachi, String loaicongnhan) {
        super(hoten, diachi, loaicongnhan);
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.snc = snc;
    }

    public CNTCN() {

    }

    @Override
    public double tinhLuong() {
        if (snc < 20) {
            thuong = 0;
        } else {
            thuong = 1.2 * luongcoban;
        }

        luongthang = luongcoban * hesoluong + thuong;
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
        System.out.print("Nhập số ngày công: ");
        snc = sc.nextInt();
        if (snc == 0) {
            System.out.println("Nhập số ngày công = 0. Dừng chương trình!");
            System.exit(0);
        }
    }

    @Override
    public int compareTo(CNTCN o) {
        int result = this.getHoten().compareTo(o.getHoten());

        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            if (this.tinhLuong() > o.tinhLuong()) {
                return 1;
            } else if (this.tinhLuong() < o.tinhLuong()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public void inThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
