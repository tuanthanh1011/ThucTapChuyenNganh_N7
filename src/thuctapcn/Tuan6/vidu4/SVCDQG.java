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
public class SVCDQG extends Nguoi{
    private double tdkt;
    private int smkt;
    private double dtkthp;
    private double dtb;

    public SVCDQG() {
        
    }

    
    
    public SVCDQG(double tdkt, int smkt, double dtkthp, String hoten, String ngaysinh, String diachi, String loaisinhvien) {
        super(hoten, ngaysinh, diachi, loaisinhvien);
        this.tdkt = tdkt;
        this.smkt = smkt;
        this.dtkthp = dtkthp;
    }
    
    @Override
    public void nhapThongTin () {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin ();
        
        System.out.print("Nhập tổng điểm các môn kiểm tra: ");
        tdkt = sc.nextDouble();
        System.out.print("Nhập số môn kiểm tra: ");
        smkt = sc.nextInt();
        System.out.print("Nhập điểm thi kết thúc học phần: ");
        dtkthp = sc.nextDouble();
    }
    
    @Override
    public double tinhDiem () {
        dtb = ((double)tdkt/smkt + dtkthp)/3;
        return dtb;
    }
}
