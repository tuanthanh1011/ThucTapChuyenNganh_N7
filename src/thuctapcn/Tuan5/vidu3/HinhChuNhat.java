/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu3;

/**
 *
 * @author thong
 */
public class HinhChuNhat extends HinhPhang{
     
     double chieuDai, chieuRong;
     public void nhap(){
         tenHinh = "HCN";
         chieuDai = 50;
         chieuRong=20;
     }
     @Override
     double tinhCV(){
         return (chieuDai+chieuRong)*2;
     }
     @Override
     double tinhDT(){
         return chieuDai*chieuRong;
     }
     public String toString(){
         return super.toString()+": chieu dai = "+chieuDai+", "
                 + "chieu rong = "+chieuRong+", chu vi = "+tinhCV()+", "
                 + "dien tich = "+ tinhDT();
     }
}

