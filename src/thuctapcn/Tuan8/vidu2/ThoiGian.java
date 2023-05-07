/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan8.vidu2;

import java.util.Scanner;

/**
 *
 * @author tuant
 */
public class ThoiGian {
    Scanner sc = new Scanner(System.in);
    private int ngay, thang, nam;

//    public ThoiGian() {
//        
//    }

    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay <= 0 || thang <= 0 || nam <= 0) {
            throw new InvalidDateException("Ngay, thang, nam khong hop le!");
        }

        if (thang > 12) {
            throw new InvalidDateException("Thang khong hop le!");
        }

        if (ngay > 31) {
            throw new InvalidDateException("Ngay khong hop le!");
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
//    public void nhap() {
//        System.out.print("Nhập ngày: ");
//        ngay = sc.nextInt();
//        System.out.print("Nhập tháng: ");
//        thang = sc.nextInt();
//        System.out.print("Nhập năm: ");
//        nam = sc.nextInt();
//    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }
    

}
