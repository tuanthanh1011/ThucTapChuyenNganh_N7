/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu5;

/**
 *
 * @author IT Supporter
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;
    Nguoi(){
        
    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }
    
            
}
