/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan3.vidu1;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public class xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

//Xây dựng các phương thức get/set cần thiết
public int getDungTich() {
   return dungTich;
 }
public void setDungTich(int dungTich) {
   this.dungTich = dungTich;
 }
//Xây dựng phương thức nhập dữ liệu
public void nhap(){
   Scanner s=new Scanner(System.in);
   System.out.print("nhap ten chur xe, loaixe:");
      tenChuXe=s.nextLine();
      loaiXe=s.nextLine();
   System.out.println("nhap dung tich,gia=");
      dungTich=s.nextInt();
      triGia=s.nextDouble();
 }
//Xây dựng phương thức tính thuế
public double tinhThue(){
   double thue=0;
  if (dungTich<100)thue=triGia/100;
  else if (dungTich<200)
    thue=triGia*3/100;
  else thue=triGia*5/100;
     return thue;
 }
//Xây dựng phương thức in tiêu đề
public static void xuatTieuDe(){
// in xong tieu de xuong dong
System.out.printf("%-15s %-15s %15s %15s%15s %n","Ten chu xe","loai Xe","Dung tic","trigia","Thue phai nop");
 }
//Xây dựng phương thức in dữ liệu
public void xuatDL(){
 System.out.printf("%-15s %-15s %15d %15.1f%15.1f %n",tenChuXe, loaiXe,dungTich,triGia, tinhThue());
 }
}
