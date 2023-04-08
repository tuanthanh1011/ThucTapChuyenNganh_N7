/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu3;

import java.util.Scanner;

/**
 *
 * @author tuant
 */
public class NhanVienSX extends NhanVien {

    private int soSanPham;

    public NhanVienSX(String maNv) {
        super(maNv);
        soSanPham = 0;
    }

    public NhanVienSX() {
        super();
        soSanPham = 0;
    }

    public double tinhLuong() {
        return soSanPham * 10000;
    }

    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        soSanPham = s.nextInt();
    }

    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s%n", "So sp", "Phu cap", "Luong");
    }

    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%10s %15.2f %15.2f", soSanPham, tinhPhuCap(), tinhLuong());
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }
}
