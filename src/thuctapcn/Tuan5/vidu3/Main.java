/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu3;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.nhap();
        System.out.println(hv);
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        System.out.println(hcn);
        HinhTron ht = new HinhTron();
        ht.nhap();
        System.out.println(ht);
    }
}
