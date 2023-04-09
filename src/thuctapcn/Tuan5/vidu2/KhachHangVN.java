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
public class KhachHangVN extends KhachHang {
    private String doiTuongKH;
    private double donGia, dinhMuc;
    private int soLuong;

    public KhachHangVN(String maKH, String hoTen, NgayThangNam ngayRaHD, String doiTuongKH, int soLuong, double donGia, double dinhMuc) {
        super(maKH, hoTen, ngayRaHD);
        this.doiTuongKH = doiTuongKH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }
    
    @Override
    public double tinhTien() {
        double thanhTien;
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = dinhMuc * donGia + (soLuong - dinhMuc) * donGia * 2.5;
        }
        return thanhTien;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("%20s%15s%15.0f%15.0f%15.2f\n", doiTuongKH, soLuong, donGia, dinhMuc, tinhTien());
    }
    
}