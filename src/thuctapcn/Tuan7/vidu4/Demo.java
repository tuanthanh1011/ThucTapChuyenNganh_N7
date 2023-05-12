package thuctapcn.Tuan7.vidu4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<HocVienLT> hs = new HashSet<HocVienLT>();
        FakeData(hs);
        InHashSet(hs);
        
        int n;
        System.out.print("\nNhap vao so luong hoc vien muon them : ");
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("\n======= Nhap vao hoc vien lt ==========");
            HocVienLT them = new HocVienLT();
            them.NhapThongTin();
            hs.add(them);
        }
        
        System.out.println("\n============ DS SAU KHI THEM ==============");
        InHashSet(hs);
        
        System.out.println("\n============ Ghi FILE ==============");
        try{
            GhiFile(hs);
            System.out.print("\nGhi file thanh cong");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        System.out.println("\n============ Doc FILE ==============");
        try{
            HashSet<HocVienLT> hsThem;
            hsThem = DocFile();
            InHashSet(hsThem);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public static void FakeData(HashSet<HocVienLT> hs){
        hs.add(new HocVienLT(21, 5000000, "Nguyen An", "Ha Noi", 1, "Lap trinh"));
        hs.add(new HocVienLT(22, 4500000, "Nguyen Nam", "Ha Noi", 2, "Lap trinh"));
        hs.add(new HocVienLT(26, 300000, "Nguyen Hoang", "Ha Noi", 1, "Lap trinh"));
    }
    
    public static void InHashSet(HashSet<HocVienLT> hs){
        System.out.print(String.format("\n%20s %20s %20s %20s %20s", "Ho Ten", "Dia Chi", "Loai UT", "Loai CT", "Hoc phi"));
        for(HocVienLT i : hs)
            i.InThongTin();
    }
    
    public static void GhiFile(HashSet<HocVienLT> hs) throws Exception{
        FileOutputStream fo = new FileOutputStream("HocVienLT.TXT");
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(hs);
        out.close();
    }
    
    public static HashSet<HocVienLT> DocFile() throws Exception{
        HashSet<HocVienLT> hs;
        FileInputStream fi = new FileInputStream("HocVienLT.TXT");
        ObjectInputStream in = new ObjectInputStream(fi);
        hs = (HashSet<HocVienLT>)in.readObject();
        in.close();
        return hs;
    }
}
