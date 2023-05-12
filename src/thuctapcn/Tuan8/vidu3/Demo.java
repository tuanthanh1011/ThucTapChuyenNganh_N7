package thuctapcn.Tuan8.vidu3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<SinhVien> ls = new LinkedHashSet<SinhVien>();
        FakeData(ls);
        InLinkedHashSet(ls);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao so luong sinh vien muon them : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("\nNhap vao sinh vien ");
            SinhVien them = new SinhVien();
            them.Nhap();
            ls.add(them);
        }
        
        System.out.print("\n============== DANH SACH SAU KHI THEM ==============");
        InLinkedHashSet(ls);
        
        System.out.print("\n============== DANH SACH SV CO TUOI LON NHAT ==============");
        SinhVien SVMaxTuoi = Collections.max(ls);
        System.out.print(String.format("\n%20s %20s %10s %20s %20s", "Ten", "Tuoi", "Gioi tinh", "Lop", "Nganh"));
        Iterator<SinhVien> ir = ls.iterator();
        while(ir.hasNext()){
            SinhVien sv = ir.next();
            if(SVMaxTuoi.Tuoi == sv.Tuoi)
                System.out.print(sv.toString());
        }
        String Path = "SINHVIEN.TXT";
        System.out.print("\n============== GHI FILE ==============");
        try{
            File.GhiFile(Path, ls);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        System.out.print("\n============== DOC FILE ==============");
        try{
            LinkedHashSet<SinhVien> test = new LinkedHashSet<SinhVien>();
            test = File.DocFile(Path);
            InLinkedHashSet(test);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public static void FakeData(LinkedHashSet<SinhVien> ls){
        ls.add(new SinhVien("KTPM2", "CNTT", "Nguyen Nam", 20, 'm'));
        ls.add(new SinhVien("KTPM4", "CNTT", "Nguyen An", 22, 'w'));
        ls.add(new SinhVien("KTPM1", "CNTT", "Nguyen Hoang", 20, 'm'));
    }
    
    public static void InLinkedHashSet(LinkedHashSet<SinhVien> ls){
        System.out.print(String.format("\n%20s %20s %10s %20s %20s", "Ten", "Tuoi", "Gioi tinh", "Lop", "Nganh"));
        Iterator<SinhVien> ir = ls.iterator();
        while(ir.hasNext()){
            SinhVien sv = ir.next();
            System.out.print(sv.toString());
        }
    }
}
