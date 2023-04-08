/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan3.vidu2;
import java.util.Scanner;

/**
 *
 * @author An Viet Computer
 */
public class Hang implements Comparable<Hang>{
    private String tenHang;
    private int soLuong;
    private double donGia;
    
    public int compareTo (Hang orther) {
       int result = this.tenHang.compareTo(orther.getTenhang());
       if (result == 0) {
           if (this.tinhtongtien() > orther.tinhtongtien()) 
               result = 1;
           else if (this.tinhtongtien() < orther.tinhtongtien())
               result = -1;
           else 
               result = 0;
       }
       return result;
    }
    
    public double tinhtongtien () {
        return soLuong * donGia;
    }

    public Hang(String tenHang, float donGia, int soLuong) {
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public Hang() {
    }

    public String getTenhang() {
        return tenHang;
    }

    public double getDongia() {
        return donGia;
    }

    public int getSoluong() {
        return soLuong;
    }

    public void setTenhang(String tenhang) {
        this.tenHang = tenHang;
    }

    public void setDongia(float dongia) {
        this.donGia = donGia;
    }

    public void setSoluong(int soluong) {
        this.soLuong = soLuong;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }
    
    public void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %n", "Tên hàng", "Đơn giá", "Số lượng", "Thành tiền");
    }
    
    public void xuatDL() {
        System.out.printf("%15s %15s %15s %15s %n", tenHang, donGia, soLuong, tinhtongtien());
    }
    
}
