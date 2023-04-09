/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu2;


import java.util.Scanner;

/**
 *
 * @author tuant
 */
public class NgayThangNam {

    private int ngay, thang, nam;

    public NgayThangNam(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void hienThi() {
        System.out.printf(ngay + "/" + thang + "/" + nam);
    }
}