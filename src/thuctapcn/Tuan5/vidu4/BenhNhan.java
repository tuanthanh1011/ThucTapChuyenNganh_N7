/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu4;
import java.util.Scanner;
/**
 *
 * @author An Viet Computer
 */
public class BenhNhan extends Nguoi implements Comparable<BenhNhan>{
    private String tienSu;
    private String chanDoan;

    public BenhNhan() {
        super();
    }

    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
    }

    public String getTienSu() {
        return tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tiền sử: ");
        tienSu = sc.nextLine();
        System.out.print("Nhập chẩn đoán: ");
        chanDoan = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-25s %-30s", tienSu, chanDoan);
    }
    @Override
    public int compareTo(BenhNhan o){ //HAM SAP XEP GIAM DAN
        int result;
        if(this.getTuoi() < o.getTuoi())
            result = 1;
        else if(this.getTuoi() > o.getTuoi())
            result = -1;
        else
            result = this.chanDoan.compareTo(o.chanDoan);
        return result;
    }
    /*@Override
    public int compareTo(BenhNhan o) {
        return Integer.compare(this.getTuoi(), o.getTuoi());
    }*/
}
