/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan6.vidu4;

/**
 *
 * @author An Viet Computer
 */
public class SinhVien extends Nguoi{
    private String lop;
    private String nganh;
    private Truong truong;
    public SinhVien(){
        super();
    }
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong){
        super(ten,tuoi,gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString() + "lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + '}';
    }
    
}
