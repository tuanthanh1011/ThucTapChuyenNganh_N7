<<<<<<< Upstream, based on origin/master
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan6.vidu4;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public abstract class Nguoi implements Comparable<Nguoi> {

    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String loaisinhvien;

    public Nguoi() {
        this.hoten = "";
        this.ngaysinh = "";
        this.diachi = "";
        this.loaisinhvien = "";
    }

    public Nguoi(String hoten, String ngaysinh, String diachi, String loaisinhvien) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.loaisinhvien = loaisinhvien;
    }

    public void setLoaisinhvien(String loaisinhvien) {
        this.loaisinhvien = loaisinhvien;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoten = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        if (loaisinhvien == null) {
            System.out.print("Nhập loại sinh viên (SVCDN, SVCDCQ): ");
            loaisinhvien = sc.nextLine();
        }
    }

    public abstract double tinhDiem();

    public void inThongTin() {
        System.out.printf("%-20s %-15s %-25s %-15s %-15.2f%n", hoten, ngaysinh, diachi, loaisinhvien, tinhDiem());
    }

    public int compareTo(Nguoi o) {
        int result = this.hoten.compareTo(o.hoten);
        if (result == 0) {
            if (this.tinhDiem() > o.tinhDiem()) {
                result = 1;
            } else if (this.tinhDiem() < o.tinhDiem()) {
                result = -1;
            } else {
                result = 0;
            }
        }
        return result;
    }
}

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan6.vidu4;

/**
 *
 * @author An Viet Computer
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;
    public Nguoi(){
        
    }
    public Nguoi(String ten, int tuoi, char gioiTinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + " ";
    }
    
}
>>>>>>> 24b9b51 Dao Thi Thao Upload
