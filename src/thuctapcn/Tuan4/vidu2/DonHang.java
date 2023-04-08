/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author An Viet Computer
 */
public class DonHang {
        private String sohd, ngayhd;
    private KhachHang kh = new KhachHang();
    private ArrayList <Hang> dshang;
    private double tongTienHang = 0;
    private int sl;

    public DonHang(String sohd, String ngayhd, ArrayList<Hang> dshang) {
        this.sohd = sohd;
        this.ngayhd = ngayhd;
        this.dshang = dshang;
    }

    public DonHang() {
    }

    public String getSohd() {
        return sohd;
    }

    public String getNgayhd() {
        return ngayhd;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setSohd(String sohd) {
        this.sohd = sohd;
    }

    public void setNgayhd(String ngayhd) {
        this.ngayhd = ngayhd;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        kh.nhap();
        System.out.print("Nhập số hóa đơn: ");
        sohd = sc.nextLine();
        System.out.print("Nhập ngày hóa đơn: ");
        ngayhd = sc.nextLine();
        System.out.print("Nhập vào số lượng hàng hóa muốn nhập: ");
        sl = sc.nextInt();
        dshang = new ArrayList<>();
        for(int i = 0; i < sl; i++) {
            Hang h = new Hang();
            h.nhap();
            dshang.add(h);
        }
    }
    
    public void inHD() {
        kh.toString();
        System.out.println("Mã HĐ: " + sohd + ", Ngày in hóa đơn: " + ngayhd + " ," + kh.toString());
        Hang donhang = new Hang();
        donhang.inTieuDe();
        for (Hang h:dshang) {
            h.xuatDL();
            tongTienHang += h.tinhtongtien();
        }
        System.out.println("Tổng tiền hàng: " + tongTienHang);
    }
    
    public void inSort () {
        Collections.sort(dshang);
        inHD();
    }
}
