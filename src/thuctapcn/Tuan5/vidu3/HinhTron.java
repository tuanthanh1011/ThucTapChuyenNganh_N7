/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu3;

/**
 *
 * @author thong
 */
public class HinhTron extends HinhPhang{
     
     double banKinh;
     public void nhap(){
         tenHinh = "Hinh tron";
         banKinh= 10;
     }
     @Override
     double tinhCV(){
         return 2*banKinh*3.14;
     }
     @Override
     double tinhDT(){
         return banKinh*banKinh*3.14;
     }
     
     public String toString(){
         return super.toString()+": ban kinh = "+banKinh+", chu vi = "+tinhCV()+", "
                 + "dien tich = "+ tinhDT();
     }
}
