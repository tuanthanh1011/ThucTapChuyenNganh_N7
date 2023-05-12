package thuctapcn.Tuan8.vidu3;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class SinhVien extends Nguoi implements Comparable<SinhVien>, Serializable{
    String Lop;
    String Nganh;

    public SinhVien() {
    }

    public SinhVien(String Lop, String Nganh, String Ten, int Tuoi, char GioiTinh) {
        super(Ten, Tuoi, GioiTinh);
        this.Lop = Lop;
        this.Nganh = Nganh;
    }

    public String getLop() {
        return Lop;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %20s %20s", Lop, Nganh);
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao lop : ");
        setLop(sc.nextLine());
        System.out.print("\nNhap vao nganh : ");
        setNganh(sc.nextLine());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.Lop);
        hash = 23 * hash + Objects.hashCode(this.Nganh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.Lop, other.Lop)) {
            return false;
        }
        return Objects.equals(this.Nganh, other.Nganh);
    }

    @Override
    public int compareTo(SinhVien o) {
        return Integer.compare(this.Tuoi, o.Tuoi);
    }
}
