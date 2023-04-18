/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan6.vidu2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * 
 */
public class Demo {

    static GVCoHuu[] dsgv;
    static GVCoHuu[] ndsgv;
    static int n;
    static int slbandau = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dsgv = new GVCoHuu[slbandau];
        Scanner sc = new Scanner(System.in);

        fakeData();
        System.out.println("\n-----------Thong tin vua nhap---------------");
        inTieuDe();
        inThongTin(dsgv);
        minLuong(dsgv);

        System.out.print("Nhập 0 để bổ sung giảng viên: ");
        int check = sc.nextInt();

        if (check == 0) {
            nhapSLGV();
            ndsgv = new GVCoHuu[slbandau + n];
            nhapBoSung();
            System.out.println("\n-----------Thong tin sau cap nhat----------------");
            inTieuDe();
            inThongTin(ndsgv);
            minLuong(ndsgv);
        }
    }

    public static void fakeData() {
        GVCoHuu gv1 = new GVCoHuu(5000000, 2.3, 6, "Buu Tuan Thanh1", "Nguyen Xa, Bac Tu Liem, HN", "Giang vien co huu");
        dsgv[0] = (gv1);
        GVCoHuu gv2 = new GVCoHuu(4500000, 2.4, 2, "Huu Tuan Thanh2", "Nguyen Xa, Bac Tu Liem, HN", "Giang vien co huu");
        dsgv[1] = (gv2);
        GVCoHuu gv3 = new GVCoHuu(6000000, 2, 15, "Auu Tuan Thanh3", "Nguyen Xa, Bac Tu Liem, HN", "Giang vien co huu");
        dsgv[2] = (gv3);
    }

    public static void inThongTin(GVCoHuu[] arr) {
        for (GVCoHuu gv : arr) {
            gv.inThongTin();
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-20s %-35s %-25s %-15s%n", "Họ tên", "Địa chỉ", "Loại giảng viên", "Lương tháng");
    }

    public static void nhapSLGV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giảng viên muốn bổ sung: ");
        do {
            n = sc.nextInt();
            if (n < 1) {
                System.out.print("Nhập lại n (n>=1): ");
            }
        } while (n < 1);
    }

    public static void nhapBoSung() {
        for (int i = 0; i < slbandau; i++) {
            ndsgv[i] = dsgv[i];
        }
        for (int i = slbandau; i < slbandau + n; i++) {
            System.out.println("Nhập giảng viên " + (i + 1));
            GVCoHuu gv = new GVCoHuu();
            gv.nhapThongTin();
            ndsgv[i] = gv;
        }
    }

    public static void minLuong(GVCoHuu[] arr) {
        GVCoHuu mingv = Collections.min(Arrays.asList(arr), Comparator.comparing(GVCoHuu::tinhLuong));
        System.out.println("Giao vien co luong thap nhat la: " + mingv.getHoten() + ", Lương tháng: " + String.format("%10.2f", mingv.tinhLuong()));
    }

}
