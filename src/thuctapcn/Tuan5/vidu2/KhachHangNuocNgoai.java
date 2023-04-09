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
public class KhachHangNuocNgoai extends KhachHang {

    private String quocTich;
    private double donGia;
    private int soLuong;
    
    public KhachHangNuocNgoai(String maKH, String hoTen, NgayThangNam ngayRaHD, String quocTich, int soLuong, double donGia) {
        super(maKH, hoTen, ngayRaHD);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public double tinhTien() {
        return soLuong * donGia;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("%20s%15s%15.0f%15s%15.2f\n", quocTich, soLuong, donGia, "", tinhTien());
    }
}
