/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan4.vidu1;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public class xedemo {
   
//khai báo mảng đối tượng Xe
  static Xe dsXe[];
  static int n;//số lượng xe
//Xây dựng hàm nhập mảng
static void nhap(){
   System.out.print("nhập số lượng xe");
   Scanner s=new Scanner(System.in);
     n=s.nextInt();
     s.nextLine();
 //xin cấp phát mảng
   dsXe=new Xe[n];
   for (int i=0;i<n;i++){
 //xin cấp phát cho phần tử mảng thứi
   dsXe[i]=new Xe();
   dsXe[i].nhap();
 }
}
//Xây dựng hàm in danh sách xe
static void inDSXe(){
 //in danh sach
   Xe.xuatTieuDe();
 for (Xe x:dsXe)
   x.xuatDL();
 }
//Xây dựng hàm main
public static void main(String[] args) {
int chon;
Scanner s=new Scanner(System.in);
do {
System.out.println("1.Nhap thong tin xe");
System.out.println("2.Xuất bảng kê thuế trước bạn");
System.out.println("3.Thoát" );
System.out.println("Lựa chọn");
chon=s.nextInt();
   switch (chon){
   case 1:
     nhap();
      break;
   case 2:
     inDSXe();
      break;
   case 3:
 System.exit(0);
     }
   } while (chon !=3);
 }

    private static class Xe {

        private static void xuatTieuDe() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Xe() {
        }

        private void nhap() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void xuatDL() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}//kết thúc lớp XeDemo.
