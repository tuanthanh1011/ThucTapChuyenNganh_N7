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
public class Bai5_UCLN {
    
    int data;
    Bai5_UCLN(int dataValue) {
        data = dataValue;
    }
    public static void swap(Bai5_UCLN a, Bai5_UCLN b) {
        int c;
        c = a.data;
        a.data = b.data;
        b.data = c;
    }
    
    public static int handle(int x, int y) {
        int r = x % y;
        if (r != 0) {
            return handle(y, r);
        }
        return y;
    }
    
    public static void main(String[] args) {
        Bai5_UCLN n1, n2;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = sn.nextInt();
        n1 = new Bai5_UCLN(a);
        System.out.print("Nhap vao so b: ");
        int b = sn.nextInt();
        n2 = new Bai5_UCLN(b);
        if(!(a >= b)) {
            swap(n1, n2);
        }
        System.out.println("UCLN cua 2 so la: " + handle(a, b));
    }
}
