/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu1;
import java.util.Scanner;
/**
 *
 * @author An Viet Computer
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;

    public Nguoi() {
        
    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
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

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10s %-15s", ten, tuoi, (gioiTinh == 'N') ?"Nam":"Nữ");
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        if(ten.equals("")){
            System.exit(0);
        }
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập giới tính(N là nam, F là nữ): ");
        
        do{
            gioiTinh = sc.next().charAt(0);
            sc.nextLine();
            
            if(!(gioiTinh == 'N') && !(gioiTinh == 'F')){
               System.out.print("Nhập lại giới tính: ");
            }
        }while(!(gioiTinh == 'N') && !(gioiTinh == 'F'));
    }
}
