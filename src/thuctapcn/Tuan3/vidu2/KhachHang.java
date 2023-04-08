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
public class KhachHang {
    private String hoTen;
    private String diaChi;
    public KhachHang(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }

    public String getHoten() {
        return hoTen;
    }

    public String getDiachi() {
        return diaChi;
    }

    public void setHoten(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiachi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhap () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }
    
    public String toString () {
        return "Họ tên : " + hoTen + ", Địa chỉ: " + diaChi;
    }
}
