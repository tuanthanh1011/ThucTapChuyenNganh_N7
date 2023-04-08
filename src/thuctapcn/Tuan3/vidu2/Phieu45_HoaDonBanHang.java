/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan3.vidu2;
import java.util.Scanner;
/**
 *
 * @author An Viet Computer
 */
public class Phieu45_HoaDonBanHang {
    public static DonHang[] dsdh;
    public static int n;
    /**
     * @param args the command line arguments
     */
    public static void nhapDSDH() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng đơn hàng: ");
        n = sc.nextInt();
        dsdh = new DonHang[n];
        for (int i = 0; i < n; i++) {
            dsdh[i] = new DonHang();
            dsdh[i].nhap();
        }
    }
    
    public static void xuatDL() {
        for(int i = 0; i < n; i++) {
            dsdh[i].inSort();
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nhapDSDH();
        xuatDL();
    }
    
}
