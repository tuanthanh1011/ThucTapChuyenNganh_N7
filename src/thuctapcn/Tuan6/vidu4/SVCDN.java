/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan6.vidu4;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public class SVCDN extends Nguoi {

    private double tdkt;
    private int smkt;
    private double diemtb;

    public SVCDN() {
        
    }

    public SVCDN(double tdkt, int smkt, String hoten, String ngaysinh, String diachi, String loaisinhvien) {
        super(hoten, ngaysinh, diachi, loaisinhvien);
        this.tdkt = tdkt;
        this.smkt = smkt;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        super.nhapThongTin();

        System.out.print("Nhập tổng điểm các môn kiểm tra: ");
        tdkt = sc.nextDouble();
        System.out.print("Nhập số môn kiểm tra: ");
        smkt = sc.nextInt();
    }

    @Override
    public double tinhDiem() {
        diemtb = (double) tdkt / smkt;
        return diemtb;
    }
}

