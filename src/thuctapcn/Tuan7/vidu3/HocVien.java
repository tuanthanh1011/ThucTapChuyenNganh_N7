package thuctapcn.Tuan7.vidu3;


import java.io.Serializable;
import java.util.Scanner;

public abstract class HocVien implements Serializable{
    protected String HoTen;
    protected String DiaChi;
    protected int LoaiCT;
    protected int LoaiUT;

    public HocVien() {
    }

    public HocVien(String HoTen, String DiaChi, int LoaiCT, int LoaiUT) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.LoaiCT = LoaiCT;
        this.LoaiUT = LoaiUT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public int getLoaiCT() {
        return LoaiCT;
    }

    public int getLoaiUT() {
        return LoaiUT;
    }

    public void setHoTen(String HoTen){
        this.HoTen = HoTen;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setLoaiCT(int LoaiCT) {
        this.LoaiCT = LoaiCT;
    }

    public void setLoaiUT(int LoaiUT) {
        this.LoaiUT = LoaiUT;
    }
    
    public void Nhap(){
            Scanner sc = new Scanner(System.in);
            do{
                System.out.print("\nNhap vao ho ten : ");
                setHoTen(sc.nextLine());
            }while(HoTen.isEmpty());
            System.out.print("\nNhap vao dia chi : ");
            setDiaChi(sc.nextLine());
            System.out.print("\nNhap vao loai chuong trinh (1: Do hoa; 2. Lap trinh): ");
            setLoaiCT(sc.nextInt());
            System.out.print("\nNhap vao loai uu tien : ");
            setLoaiUT((sc.nextInt()));
    }
    
    public void InThongTin(){
        System.out.print(String.format("\n%20s %20s %20s %20s %20.2f", HoTen, DiaChi,LoaiCT == 1 ? "Do hoa" : "Lap trinh", LoaiUT == 1 ? "Loai 1" : "Loai 2", hocPhi()));
    }
    
    public abstract double hocPhi();
}
