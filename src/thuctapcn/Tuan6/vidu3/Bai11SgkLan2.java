/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuctapcn.Tuan6.vidu3;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai11SgkLan2 {
    private static ArrayList <GiaoVien> Fakedata(){
        ArrayList <GiaoVien> dsGiaoVien = new ArrayList();
        GVThingGiang GV1 = new GVThingGiang("E", "Hà nam", "Giảng viên thing giang ", 10, 3, 2);
        GVThingGiang GV2 = new GVThingGiang("A", "Hà nam", "Giảng viên thing giang ", 3, 3, 2);
        GVThingGiang GV3 = new GVThingGiang("O", "Hà nam", "Giảng viên thing giang ", 20, 4, 3);
        dsGiaoVien.add(GV3);
        dsGiaoVien.add(GV2);
        dsGiaoVien.add(GV1);
          return dsGiaoVien;
    }

    private static void nhap(ArrayList <GiaoVien> dsGiaoVien){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong giao vien ");
        int n = sc.nextInt();
        sc.nextLine();
      for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin giảng viên thứ " + (i+1) + ":");
            GVThingGiang gv=new GVThingGiang();
            gv.nhap();
            dsGiaoVien.add(gv);
        }
    }
    
    private static void xuat(ArrayList <GiaoVien> dsGiaoVien){
        
        System.out.println("Danh sach giao vien thing giang la : ");
        System.out.printf("%20s %20s %20s %20s %20s %20s ", "hoTen","diaChi","loaiGv","soTietDay","donGia","tinhLuong");
        for(GiaoVien gv:dsGiaoVien){
            System.out.println("\n");
            gv.xuat();
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList <GiaoVien> dsGiaoVien =Fakedata();
        nhap(dsGiaoVien);
       xuat(dsGiaoVien);
        
    }
    
}
