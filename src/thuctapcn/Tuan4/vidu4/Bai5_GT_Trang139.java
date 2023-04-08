/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan4.vidu4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author tuant
 */
public class Bai5_GT_Trang139 {

    /**
     * @param args the command line arguments
     */
    static ArrayList <SinhVien> dssv;
    public static void main(String[] args) {
        // TODO code application logic here
        dssv = new ArrayList<>();
        
        fakeData();
        inDL();
        sortSV();
    }
    
    public static void fakeData() {
        Truong tr = new Truong("DHCN", "Nguyên Xá", "Khong biet");
        
        
        SinhVien sv1 = new SinhVien("HTTT1", "HTTT", tr, "Thành", 18, 'M');
        dssv.add(sv1);
        
        SinhVien sv2 = new SinhVien("HTTT2", "HTTT", tr, "Trung", 20, 'M');
        dssv.add(sv2);
        
        SinhVien sv3 = new SinhVien("HTTT3", "HTTT", tr, "Long", 19, 'F');
        dssv.add(sv3);
        
    }
    
    public static void inDL() {
        for (SinhVien sv:dssv) {
            System.out.println(sv);
        }
    }
    
    public static void sortSV () {
        Collections.sort(dssv);
        System.out.println("---------------Danh sách sinh viên sau khi sắp xếp--------------------");
        inDL();
    }
}
