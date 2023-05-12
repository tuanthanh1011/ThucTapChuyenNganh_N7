package thuctapcn.Tuan8.vidu3;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Nguoi implements Serializable{
    protected String Ten;
    protected int Tuoi;
    protected char GioiTinh;

    public Nguoi() {
    }
    
    public Nguoi(String Ten, int Tuoi, char GioiTinh) {
        try{
            if(Tuoi < 0)
                throw new Exception("Tuoi can > 0");
            this.Ten = Ten;
            this.Tuoi = Tuoi;
            this.GioiTinh = GioiTinh;
        }
        catch(Exception ex){
            System.out.print(ex.toString());
        }
    }

    public String getTen() {
        return Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public char getGioiTinh() {
        return GioiTinh;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setTuoi(int Tuoi) throws Exception{
        if(Tuoi < 0)
            throw new Exception("Tuoi can > 0");
        this.Tuoi = Tuoi;
    }

    public void setGioiTinh(char GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    public void Nhap(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNhap vao ten : ");
            setTen(sc.nextLine());
            if(getTen().isEmpty())
                throw new Exception("Ten khong duoc de trong");
            System.out.print("\nNhap vao tuoi : ");
            setTuoi(sc.nextInt());
            sc.nextLine();
            System.out.print("\nNhap vao gioi tinh (w : woman ; m : man) : ");
            setGioiTinh(sc.nextLine().charAt(0));
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    @Override
    public String toString() {
        return String.format("\n%20s %20d %10s", Ten, Tuoi, GioiTinh == 'w' ? "Nu" : "Nam");
    }
}
