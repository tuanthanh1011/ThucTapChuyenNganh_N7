/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tuant
 */
public abstract class NhanVien {
    protected String maNv;
    protected String hoTen;
    protected int namVaoLam;
    static double tongluong; // Là một biến thuộc về lớp chứ ko thuộc về đối tượng của lớp đó. Là tất cả các đối tượng của lớp đó đều chia sẻ cùng 1 bản sao của biến static thay vì 
    // có một bản sao riêng cho mỗi đối tượng
    final double PHUCAP_BANDAU = 100000; // Không thể gán lại giá trị
    
    abstract public double tinhLuong ();
    
    public String getMaNV () {
        return maNv;
    }
    
    protected double tinhPhuCap () {
        Date now = new Date();
        int d = LocalDate.now().getYear();
        return PHUCAP_BANDAU + (d - namVaoLam)*20000;
    }
    
    public NhanVien (String maNv) {
        this.maNv = maNv;
        this.hoTen = "";
        this.namVaoLam = 2012;
    }
    
    public NhanVien () {
        this.maNv = "nv0";
        this.hoTen = "";
        this.namVaoLam = 2000;
    }
    
    public void nhap () {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma nv: ");
        maNv = s.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap nam vao lam: ");
        namVaoLam = s.nextInt();
    }
    
    public static void inTieuDe () {
        System.out.printf("%-10s %-15s %6s ", "Ma nv", "ho ten", "Năm vào làm");
    }
    
    public void xuatDL () {
        System.out.printf("%-10s %-15s %6d", maNv, hoTen, namVaoLam);
    }
}
