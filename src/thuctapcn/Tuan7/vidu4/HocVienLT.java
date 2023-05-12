package thuctapcn.Tuan7.vidu4;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class HocVienLT extends HocVien implements Serializable{
    int SoBuoi;
    double DonGiaLT;

    public HocVienLT() {
    }

    public HocVienLT(int SoBuoi, double DonGiaLT, String HoTen, String DiaChi, int LoaiUT, String LoaiCT) {
        super(HoTen, DiaChi, LoaiUT, LoaiCT);
        this.SoBuoi = SoBuoi;
        this.DonGiaLT = DonGiaLT;
    }

    public int getSoBuoi() {
        return SoBuoi;
    }

    public double getDonGiaLT() {
        return DonGiaLT;
    }

    public void setSoBuoi(int SoBuoi) {
        this.SoBuoi = SoBuoi;
    }

    public void setDonGiaLT(double DonGiaLT) throws Exception{
        this.DonGiaLT = DonGiaLT;
    }

    @Override
    public void NhapThongTin() {
        try{
            super.NhapThongTin();
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNhap vao so buoi : ");
            SoBuoi= sc.nextInt();
            System.out.print("\nNhap vao don gia lt : ");
            do{
                DonGiaLT = sc.nextDouble();
                if(DonGiaLT <= 10000)
                    throw new Exception("Don gia can > 10000");
            }while(DonGiaLT <= 0);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    public double hocPhi() {
        double HocPhi = SoBuoi * DonGiaLT;
        if(LoaiUT == 1)
            return HocPhi - 1000000;
        return HocPhi - 800000;
    }

    @Override
    public boolean equals(Object obj) {
        HocVienLT hvlt = (HocVienLT)obj;
        return this.HoTen.equals(hvlt.HoTen) 
                && this.DiaChi.equals(hvlt.DiaChi) 
                && this.LoaiUT == hvlt.LoaiUT 
                && this.LoaiCT.equals(hvlt.LoaiCT)
                && this.SoBuoi == hvlt.SoBuoi
                && this.DonGiaLT == hvlt.DonGiaLT;
    }

    @Override
    public int hashCode() {
        return HoTen.hashCode() + DiaChi.hashCode() + LoaiUT + LoaiCT.hashCode() + SoBuoi + Double.hashCode(DonGiaLT);
    }
}
