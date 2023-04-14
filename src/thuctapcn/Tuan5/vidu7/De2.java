/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu7;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public class De2 {

    /**
     * @param args the command line arguments
     */
    static CNTCN[] dscn;
    static CNTCN[] newdscn;
    static int n;
    static int currQtt = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO code application logic here
        dscn = new CNTCN[currQtt];
        fakeData();
        System.out.println("\n-----------Thong tin vua nhap----------------");
        inTieuDe();
        sortCN(dscn);

        System.out.print("Nhấn 0 để bổ sung công nhân: ");
        int check = sc.nextInt();
        
        if (check == 0) {
            nhapSLCN();
            newdscn = new CNTCN[currQtt + n];
            nhapBoSung();
            System.out.println("\n-----------Thong tin sau cap nhat----------------");
            inTieuDe();
            sortCN(newdscn);
        }
        else 
            System.out.println("Dừng chương trình!");
    }

    public static void fakeData() {
        CNTCN cn1 = new CNTCN(5000000, 2.3, 25, "Do Duc Toan1", "Nguyen xa, Ha Noi", "CNTCN");
        dscn[0] = (cn1);
        CNTCN cn2 = new CNTCN(4000000, 2.1, 15, "Ao Duc Toan2", "Nguyen xa, Ha Noi", "CNTCN");
        dscn[1] = (cn2);
        CNTCN cn3 = new CNTCN(6000000, 2.5, 22, "Co Duc Toan1", "Nguyen xa, Ha Noi", "CNTCN");
        dscn[2] = (cn3);
    }

    public static void inTieuDe() {
        System.out.printf("%-20s %-30s %-20s %-15s%n", "Họ tên", "Địa chỉ", "Loại công nhân", "Tính lương");
    }

    public static void inDL(CNTCN[] arr) {
        for (CNTCN cn : arr) {
            cn.inThongTin();
        }
    }

    public static void nhapSLCN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng công nhân: ");
        do {
            n = sc.nextInt();
            if (n < 1) {
                System.out.print("Nhập lại n (n>=1): ");
            }
        } while (n < 1);
    }

    private static void sortCN(CNTCN[] newdscn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void nhapBoSung() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
