/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan6.vidu4;

import java.util.Scanner;

/**
 *
 * @author lethi
 */
public class Bai11_GT {

    static Nguoi[] dssv;
    static Nguoi[] ndssv;
    static int crrQtt = 6;
    static int n;
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dssv = new Nguoi[crrQtt];
        fakeData();
        System.out.println("\n-----------------------Thong tin vua nhap-----------------------");
        inDL(dssv);

        System.out.println("\n-----------------------Danh sach sap xep tang dan-----------------------");
        sxTangDan(dssv);

        System.out.print("Nhập 1 để thêm sinh viên: ");
        int check = sc.nextInt();
        if (check == 1) {
            nhapSLBS();
            ndssv = new Nguoi[crrQtt + n];
            themSV();
            System.out.println("\n-----------------------Danh sach sau khi them va sap xep tang dan-----------------------");
            sxTangDan(ndssv);
        }

    }

    public static void fakeData() {
        SVCDN sv1 = new SVCDN(25.6, 3, "Aưu Tuấn Thành1", "12/2/2002", "Nga Sơn, Thanh Hóa", "SVCDN");
        dssv[0] = sv1;
        SVCDN sv2 = new SVCDN(26.4, 3, "Aưu Tuấn Thành1", "12/2/2002", "Nga Sơn, Thanh Hóa", "SVCDN");
        dssv[1] = sv2;
        SVCDN sv3 = new SVCDN(24.8, 3, "Aưu Tuấn Thành1", "12/2/2002", "Nga Sơn, Thanh Hóa", "SVCDN");
        dssv[2] = sv3;

        SVCDQG sv4 = new SVCDQG(23.1, 3, 7.8, "Aưu Tuấn Thành1", "12/2/2002", "Bắc Từ Liêm, Hà Nội", "SVCDQG");
        dssv[3] = sv4;
        SVCDQG sv5 = new SVCDQG(23.8, 3, 7, "Aưu Tuấn Thành1", "12/2/2002", "Bắc Từ Liêm, Hà Nội", "SVCDQG");
        dssv[4] = sv5;
        SVCDQG sv6 = new SVCDQG(24.2, 3, 8.3, "Iưu Tuấn Thành6", "12/2/2002", "Bắc Từ Liêm, Hà Nội", "SVCDQG");
        dssv[5] = sv6;
    }

    public static void inDL(Nguoi[] arr) {
        inTieuDe();
        for (Nguoi sv : arr) {
            sv.inThongTin();
        }
    }

    public static void inTieuDe() {
        System.out.printf("%-20s %-15s %-25s %-15s %-15s%n", "Họ tên", "Ngày sinh", "Địa chỉ", "Loại sinh viên", "Điểm trung bình");
    }

    public static void nhapSLBS() {
        System.out.print("Nhập số lượng muốn thêm: ");
        do {
            n = sc.nextInt();
            if (n < 1) {
                System.out.print("Nhập lại n (n>=1): ");
            }
        } while (n < 1);
    }

    private static void sxTangDan(Nguoi[] dssv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void themSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
