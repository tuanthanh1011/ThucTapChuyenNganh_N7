/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuctapcn.Tuan8.vidu1;

import java.util.*;
import java.io.*;

/**
 *
 * @author tuant
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    static TreeSet<HVienDH> ts;
    static boolean check = true;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ts = new TreeSet<>();
        fakeData();
        inTieuDe();
        inDL(ts);

        System.out.println("-------------SX Giam Dan-------------------");
        inTieuDe();
        sxGiamDan();

        System.out.println("-------------Them hoc vien-------------------");
        System.out.println("Them sinh vien. Bo trong 'Ho ten' de dung nhap!");
        while (check) {
            themHV();
        }

        System.out.println("-------------Danh sach hoc vien sau khi them-------------------");
        inTieuDe();
        inDL(ts);

        System.out.println("-------------Hoc vien co hoc phi cao nhat------------------");
        maxHP();

        GhiFile();

        DocFile();
    }

    public static void fakeData() {
//        int sobuoi, double dongia, String hoten, String diachi, String loaichuongtrinh, String loaiuutien
        HVienDH hv1 = new HVienDH(20, 350000, "Luu Tuan Thanh1", "Thanh Hoa", "Do hoa", "Loai1");
        ts.add(hv1);
        HVienDH hv2 = new HVienDH(15, 300000, "Luu Tuan Thanh2", "Thanh Hoa", "Do hoa", "Loai2");
        ts.add(hv2);
        HVienDH hv3 = new HVienDH(25, 450000, "Luu Tuan Thanh3", "Thanh Hoa", "Do hoa", "Loai1");
        ts.add(hv3);
    }

    public static void inTieuDe() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-15s%n", "Ho ten", "Dia chi", "Loai uu tien", "Loai chuong trinh", "So buoi", "Don gia", "Hoc phi");
    }

    public static void inDL(TreeSet x) {
        Iterator ir = x.iterator();
        while (ir.hasNext()) {
            HVienDH hv = (HVienDH) ir.next();
            System.out.print(hv);
        }
    }

    public static void sxGiamDan() {
        TreeSet<HVienDH> ts1 = new TreeSet<>(Comparator.reverseOrder());
        ts1.addAll(ts);
        inDL(ts1);
    }

    public static void themHV() {
        HVienDH hv = new HVienDH();
        hv.nhapThongTin();
        if (hv.getHoten().equals("")) {
            check = false;
        } else {
            ts.add(hv);
        }
    }

    public static void maxHP() {
        HVienDH hv = (HVienDH) Collections.max(ts);
        inTieuDe();
        System.out.print(hv);
    }

    public static void GhiFile() {
        try {
            FileOutputStream file = new FileOutputStream("D:\\De1.txt");
            ObjectOutputStream ob = new ObjectOutputStream(file);
            ArrayList<HVienDH> hv = new ArrayList<>(ts);
            ob.writeObject(hv);
            ob.close();
            file.close();
            System.out.println("\nXuat file thanh cong!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void DocFile() {
        try {
            FileInputStream file = new FileInputStream("D:\\De1.txt");
            ObjectInputStream ob = new ObjectInputStream(file);
            ArrayList<HVienDH> hv = (ArrayList<HVienDH>) ob.readObject();
            TreeSet<HVienDH> ts1 = new TreeSet<>();
            ts1.addAll(hv);
            ob.close();
            file.close();
            System.out.println("\nDoc file thanh cong!");
            inDL(ts1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
