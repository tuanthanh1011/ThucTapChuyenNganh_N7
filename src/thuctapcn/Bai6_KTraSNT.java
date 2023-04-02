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
public class Bai6_KTraSNT {
     public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num;
        int count = 0;
        System.out.print("Nhap vao mot so: ");
        num = sn.nextInt();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong phai la so nguyen to");
        }
     }
}
