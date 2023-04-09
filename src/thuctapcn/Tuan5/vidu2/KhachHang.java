/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu2;


/**
 *
 * @author tuant
 */
public abstract class KhachHang {
    protected String maKH, hoTen;
    protected NgayThangNam ngayRaHD;

    public KhachHang(String maKH, String hoTen, NgayThangNam ngayRaHD) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayRaHD = ngayRaHD;
    }

    public abstract double tinhTien();
    
    public void hienThi() {
        System.out.printf("%-15s%-25s", maKH, hoTen);
        ngayRaHD.hienThi();
    }
}
