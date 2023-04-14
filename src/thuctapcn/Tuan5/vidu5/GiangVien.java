/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu5;
import java.util.Scanner;
/**
 *
 * @author An Viet Computer
 */
public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private String loaiGiangVien;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("NHập vào địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập vào loại giảng viên: ");
        loaiGiangVien = sc.nextLine();
    }
    public GiangVien(){
        
    }

    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiGiangVien() {
        return loaiGiangVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiGiangVien(String loaiGiangVien) {
        this.loaiGiangVien = loaiGiangVien;
    }
    
    public abstract double tinhLuong();
    public void inThongTin(){
        System.out.printf("%-25s %-15s %-20s %-10s %n", hoTen, diaChi, loaiGiangVien, tinhLuong());
    }
}
