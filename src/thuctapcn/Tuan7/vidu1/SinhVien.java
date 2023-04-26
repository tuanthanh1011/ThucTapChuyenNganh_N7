package thuctapcn.Tuan7.vidu1;

import java.util.Scanner;

public class SinhVien {
    private String HoTen;
    private String Lop;
    private double Diem;

    public SinhVien(String HoTen, String Lop, double Diem) {
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.Diem = Diem;
    }

    public SinhVien() {
        
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao ho ten : ");
        HoTen = sc.nextLine();
        System.out.print("\nNhap vao lop : ");
        Lop = sc.nextLine();
        System.out.print("\nNhap vao diem : ");
        Diem = sc.nextDouble();
    }
    
    public void Xuat(){
        System.out.println(String.format("%20s %20s %20.2f", HoTen, Lop, Diem));
    }
}
