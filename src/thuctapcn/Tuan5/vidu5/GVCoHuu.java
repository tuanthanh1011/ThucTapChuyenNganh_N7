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
public class GVCoHuu extends GiangVien implements Comparable<GVCoHuu>{
    private double luongCoBan;
    private double heSoLuong;
    private double phuCap;
    private double luongThang;
    private int namCongTac;

    public GVCoHuu() {
        super();
    }
    
    public GVCoHuu(double luongCoBan, double heSoLuong, int namCongTac, String hoTen, String diaChi, String loaiGiangVien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.namCongTac = namCongTac;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
        System.out.print("Nhập số năm công tác: ");
        namCongTac = sc.nextInt();
        if (namCongTac < 0) {
            System.exit(0);
        }
    }
    @Override
    public double tinhLuong(){
        if(namCongTac<5){
            phuCap = 0;
        }
        else{
            phuCap = luongCoBan * namCongTac/100;
        }
        luongThang = luongCoBan*heSoLuong + phuCap;
        return luongThang;
    }
    //SẮP XẾP
    @Override
    public int compareTo(GVCoHuu o) {
        int result = this.getHoTen().compareTo(o.getHoTen());

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
}
