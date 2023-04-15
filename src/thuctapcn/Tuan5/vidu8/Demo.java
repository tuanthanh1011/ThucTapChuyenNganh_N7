/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu8;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Demo {
    private static ArrayList<NguoiLaoDong> FakeData(){
        ArrayList<NguoiLaoDong> dsNguoiLaoDong = new ArrayList();
        KySu KS1 = new KySu ("e","ha Noi "," ky su",10000,6,3);
        KySu KS2 = new KySu ("e","ha Noi "," ky su",10000,6,3);
        KySu KS3 = new KySu ("e","ha Noi "," ky su",10000,6,3);
        dsNguoiLaoDong.add(KS3);
        dsNguoiLaoDong.add(KS2);
        dsNguoiLaoDong.add(KS1);
        return dsNguoiLaoDong;
    }
    public static void nhap(ArrayList<NguoiLaoDong>dsNguoiLaoDong){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số luong ki su : ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin giảng viên thứ " + (i+1) + ":");
            KySu ks=new KySu();
            ks.nhap();
            dsNguoiLaoDong.add(ks);
        }
    }
    public static void xuat(ArrayList<NguoiLaoDong> dsNguoiLaoDong){
        System.out.println("Danh sách giảng viên cơ hữu là: ");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s","Họ tên","Địa chỉ","Loại giảng viên","Lương cơ bản","hệ số lương","thâm niên","phụ cấp","Lương tháng");
        for(NguoiLaoDong ks:dsNguoiLaoDong){
            System.out.println("\n");
            ks.xuat();
        }
    }
    public static void main(String[] args) {
       ArrayList<NguoiLaoDong> dsNguoiLaoDong= FakeData();
       nhap(dsNguoiLaoDong);
        xuat(dsNguoiLaoDong);
    }
}
