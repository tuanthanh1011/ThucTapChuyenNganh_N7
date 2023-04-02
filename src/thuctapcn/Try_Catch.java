/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_javatongquan;
import java.util.Scanner;
/**
 *
 * @author tuant
 */
public class Bai2_GiaiPTBac2 {
   public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    float a, b, c;
    double x1, x2;
    System.out.print("Nhap he so a: ");
    a = sn.nextFloat();
    System.out.print("Nhap he so b: ");
    b = sn.nextFloat();
    System.out.print("Nhap he so c: ");
    c = sn.nextFloat();
    if(a == 0) {
        x1 = -b/c;
    }
    else {
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            x2 = (-b - Math.sqrt(delta)) / 2*a;
            System.out.println("Phuong trinh co 2 nghiem phan biet");
        }
        else if (delta < 0) {
            x1 = x2 = -b/2*a;
            System.out.println("Phuong trinh vo nghiem");
        }else {
            System.out.println("Phuong trinh co nghiem kep");
        }
    }
   }
    
}
