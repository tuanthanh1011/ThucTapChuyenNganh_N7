/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KySu extends NguoiLaoDong {
    private double luongCB;
    private int heSoLuong;
    private float ngayCong;
    
    public KySu(){
        super();
    }

    public KySu(double luongCB, int heSoLuong, float ngayCong) {
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.ngayCong = ngayCong;
    }

    

    public KySu(       String hoTen, String diaChi, String loaiLaoDong,double luongCB, int heSoLuong, float ngayCong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.ngayCong = ngayCong;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong co ban : ");
        luongCB =sc.nextFloat();
        System.out.println("Nhap he so luong : ");
        heSoLuong = sc.nextInt();
        System.out.println("Nhap ngay cong  : ");
        ngayCong =sc.nextFloat();
        
        
    }
    public double thuong(){
        
            if(ngayCong<=15){
            return 500000;
        }else if(ngayCong<25 &&ngayCong>15 ){
            return 1000000;
        }else{
            return 2000000;
        }
    }
    
    @Override
    public double tinhLuong(){
        return luongCB * heSoLuong + thuong();
    
    }

    
    public void xuat(){
    super.xuat();
        System.out.printf("%20s %20s %20s %20s %20s ",luongCB , heSoLuong,ngayCong,thuong(),tinhLuong() );
    }
    
}
