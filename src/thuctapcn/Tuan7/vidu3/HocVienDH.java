package thuctapcn.Tuan7.vidu3;

import java.io.Serializable;
import java.util.Scanner;

public class HocVienDH extends HocVien implements Comparable<HocVienDH>, Serializable{
    private int SoBuoi;
    private double DonGiaDH;

    public HocVienDH() {
    }

    public HocVienDH(int SoBuoi, double DonGiaDH, String HoTen, String DiaChi, int LoaiCT, int LoaiUT) {
        super(HoTen, DiaChi, LoaiCT, LoaiUT);
        try{
            this.SoBuoi = SoBuoi;
            this.DonGiaDH = DonGiaDH;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

    public int getSoBuoi() {
        return SoBuoi;
    }

    public double getDonGiaDH() {
        return DonGiaDH;
    }

    public void setSoBuoi(int SoBuoi) throws Exception{
        this.SoBuoi = SoBuoi;
        if(this.SoBuoi <= 0)
            throw new Exception("So buoi can lon hon 0");
    }

    public void setDonGiaDH(double DonGiaDH) {
        this.DonGiaDH = DonGiaDH;
    }

    @Override
    public void Nhap() {
        try{
            super.Nhap();
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNhap vao so buoi : ");
            setSoBuoi(sc.nextInt());
            System.out.print("\nNhap vao don gia dh : ");
            setDonGiaDH(sc.nextDouble());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
 
    @Override
    public double hocPhi() {
        double HocPhi = SoBuoi * DonGiaDH;
        if(LoaiUT == 1)
            return HocPhi -= 1000000;
        return HocPhi -= 500000;
    }

    @Override
    public int compareTo(HocVienDH o) {
        return Integer.compare(this.SoBuoi, o.SoBuoi);
    }
}
