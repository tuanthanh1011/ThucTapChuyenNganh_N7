/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author An Viet Computer
 */
public class De1_GiangVien {

    /**
     * @param args the command line arguments
     */
    static GVCoHuu[] dsgv;
    static GVCoHuu[] newdsgv;
    static int n;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        dsgv = new GVCoHuu[3];
        fakeData();
        System.out.println("Danh sách vừa nhập: ");
        inTieuDe();
        inDL(dsgv);

        System.out.print("Nhập 1 để bổ sung công nhân. Nhấn 0 để thoát chương trình: ");
        int check = sc.nextInt();

        if (check == 0) {
            System.exit(0);
        }

        if (check == 1) {
            nhapSL();
            newdsgv = new GVCoHuu[3 + n];
            nhapDL();
            System.out.println("Danh sách vừa nhập: ");
            inTieuDe();
            inDL(newdsgv);
            System.out.println("Danh sách sau khi sắp xếp: ");
            sortGV(newdsgv);
            inTieuDe();
            inDL(newdsgv);
        }

    }

    public static void fakeData() {
        GVCoHuu gv1 = new GVCoHuu(500_000, 2.5, 7, "Aao Thi Thao", "Ha Noi", "GV co huu");
        dsgv[0] = gv1;
        GVCoHuu gv2 = new GVCoHuu(500_000, 2, 7, "Dao Thao", "Ha Noi", "GV co huu");
        dsgv[1] = gv2;
        GVCoHuu gv3 = new GVCoHuu(500_000, 3.5, 7, "Co Thu Thao", "Ha Noi", "GV co huu");
        dsgv[2] = gv3;
    }

    public static void nhapSL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giảng viên: ");

        do {
            n = sc.nextInt();
            if (n < 1) {
                System.out.print("Nhập lại n (n>=1): ");
            }
        } while (n < 1);
    }

    public static void nhapDL() {
        for (int i = 0; i < 3; i++) {
            newdsgv[i] = dsgv[i];
        }

        for (int i = 3; i < 3 + n; i++) {
            System.out.println("Nhập giảng viên " + (i + 1));
            GVCoHuu gv = new GVCoHuu();
            gv.nhapThongTin();
            newdsgv[i] = gv;
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-25s %-15s %-20s %-10s %n", "Họ tên", "Địa chỉ", "Loại giảng viên", "Lương Tháng");
    }

    public static void inDL(GVCoHuu[] arr) {
        for (GVCoHuu gv : arr) {
            gv.inThongTin();
        }
    }

    //SẮP XẾP, TÌM MIN,.....
    public static void sortGV(GVCoHuu[] arr) {
        Collections.sort(Arrays.asList(arr));
    }
}
