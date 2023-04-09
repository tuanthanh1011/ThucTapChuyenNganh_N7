/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu2;

import java.util.Scanner;
/**
 *
 * @author tuant
 */
public class KhachHangDemo {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong khach hang: ");
        int n = Integer.parseInt(sc.nextLine());

        KhachHang[] dsKH = new KhachHang[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap loai khach hang (1: Khach hang VN, 2: Khach hang nuoc ngoai): ");
            int loaiKH = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap ma khach hang: ");
            String maKH = sc.nextLine();

            System.out.print("Nhap ho ten khach hang: ");
            String hoTen = sc.nextLine();

            System.out.print("Nhap ngay ra hoa don (ngay thang nam cach nhau boi dau cach): ");
            String[] arr = sc.nextLine().split(" ");
            NgayThangNam ngayRaHD = new NgayThangNam(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));

            if (loaiKH == 1) {
                System.out.print("Nhap doi tuong khach hang (sinh hoat, kinh doanh, san xuat): ");
                String doiTuongKH = sc.nextLine();

                System.out.print("Nhap so luong KW tieu thu: ");
                double soLuong = Integer.parseInt(sc.nextLine());

                System.out.print("Nhap don gia: ");
                double donGia = Double.parseDouble(sc.nextLine());

                System.out.print("Nhap dinh muc: ");
                double dinhMuc = Double.parseDouble(sc.nextLine());

                dsKH[i] = new KhachHangVN(maKH, hoTen, ngayRaHD, doiTuongKH, (int) soLuong, donGia, dinhMuc);
            } else if (loaiKH == 2) {
                System.out.print("Nhap quoc tich: ");
                String quocTich = sc.nextLine();

                System.out.print("Nhap so luong: ");
                double soLuong = Integer.parseInt(sc.nextLine());

                System.out.print("Nhap don gia: ");
                double donGia = Double.parseDouble(sc.nextLine());

                dsKH[i] = new KhachHangNuocNgoai(maKH, hoTen, ngayRaHD, quocTich, (int) soLuong, donGia);
            } else {
                System.out.println("Loai khach hang khong hop le.");
                i--;
            }
        }
        
        System.out.printf("%-15s%-25s%-20s%-15s%-15s%-15s%-15s%-20s\n", "Ma KH", "Ho ten", "Ngay ra HD", "Doi tuong KH", "So luong", "Don gia", "Dinh muc", "Tinh tien");
        for (KhachHang kh : dsKH) {
            kh.hienThi();
        }
    }
}