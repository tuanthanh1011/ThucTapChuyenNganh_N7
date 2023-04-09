/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu3;

/**
 *
 * @author thong
 */
public class HinhVuong extends HinhPhang{
     
     double canh;
     public void nhap(){
         tenHinh = "Hinh vuong";
         canh = 30;
     }
     @Override
     double tinhCV(){
         return canh*4;
     }
     @Override
     double tinhDT(){
         return canh*canh;
     }
     public String toString(){
         return super.toString()+": canh = "+canh+", chu vi = "+tinhCV()+", "
                 + "dien tich = "+ tinhDT();
     }
     
}
