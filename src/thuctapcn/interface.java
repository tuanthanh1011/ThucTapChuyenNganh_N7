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
public class Bai3_TinhGiaiThua {
    public static void main(String[] args) {
        int n;
        Scanner sn = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Nhap vao mot so tu nhien n: ");
        n = sn.nextInt();
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Giai thua cua " + n + " la: " + factorial);
    }
}
