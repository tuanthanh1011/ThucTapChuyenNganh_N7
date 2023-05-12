package thuctapcn.Tuan7.vidu4;

import java.io.Serializable;
import java.util.Scanner;

public abstract class HocVien implements Serializable{
    protected String HoTen;
    protected String DiaChi;
    protected int LoaiUT;
    protected String LoaiCT;

    public HocVien() {
    }

    public HocVien(String HoTen, String DiaChi, int LoaiUT, String LoaiCT) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.LoaiUT = LoaiUT;
        this.LoaiCT = LoaiCT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public int getLoaiUT() {
        return LoaiUT;
    }

    public String getLoaiCT() {
        return LoaiCT;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setLoaiUT(int LoaiUT) {
        this.LoaiUT = LoaiUT;
    }

    public void setLoaiCT(String LoaiCT) {
        this.LoaiCT = LoaiCT;
    }
    
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao ho ten : ");
        HoTen = sc.nextLine();
        System.out.print("\nNhap vao dia chi : ");
        DiaChi = sc.nextLine();
        System.out.print("\nNhap vao loai uu tien : ");
        LoaiUT = sc.nextInt();
        sc.nextLine();
        System.out.print("\nNhap vao loai chuong trinh : ");
        LoaiCT = sc.nextLine();
    }
    
    public void InThongTin(){
        System.out.print(String.format("\n%20s %20s %20d %20s %20.2f", HoTen, DiaChi, LoaiUT, LoaiCT, hocPhi()));
    }
    
    public abstract double hocPhi();
}
