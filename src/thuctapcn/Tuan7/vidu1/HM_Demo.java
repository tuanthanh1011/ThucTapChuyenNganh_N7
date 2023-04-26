package thuctapcn.Tuan7.vidu1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HM_Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, SinhVien> hm = new HashMap();
        FakeData(hm);
        while(true){
            System.out.println("\nSO LUONG SINH VIEN : " + hm.size());
            System.out.print("\n============== MENU ==============");
            System.out.print("\n1. Hien thi danh sach sinh vien");
            System.out.print("\n2. Them sinh vien");
            System.out.print("\n3. Tim kiem sinh vien");
            System.out.print("\n4. Sua thong tin sinh vien");
            System.out.print("\n5. Xoa sinh vien");
            System.out.print("\n6. Thoat");
            
            int choose;
            do{
                System.out.print("\nNhap vao su lua chon cua ban (1, 2, 3, 4 or 5) : ");
                choose = sc.nextInt();
                sc.nextLine();
                if(choose <= 0 || choose > 6)
                    System.out.print("\nLua chon khong chinh xac. Vui long nhap lai !");
            }while(choose <= 0 || choose > 6);
            switch (choose) {
                case 1:
                    sortAndDisplay(hm);
                    break;
                case 2:
                    ThemSinhVien(hm);
                    break;
                case 3:
                    TimKiemSinhVien(hm);
                    break;
                case 4:
                    SuaThongTinSV(hm);
                    break;
                case 5:
                    XoaSinhVien(hm);
                    break;
                case 6 :
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    public static void sortAndDisplay(HashMap<String, SinhVien> hm){
        TreeMap<String, SinhVien> sortedMap = new TreeMap<>(hm);
        System.out.println("\n===================== DANH SACH SINH VIEN =====================");
        System.out.println(String.format("%20s %20s %20s %20s","Ma SV", "Ho Ten", "Lop", "Diem"));
        for (Map.Entry<String, SinhVien> entry : sortedMap.entrySet()) {
            SinhVien sv = entry.getValue();
            System.out.print(String.format("\n%20s", entry.getKey()));
            sv.Xuat();
        }
    }
    
    public static void FakeData(HashMap<String, SinhVien> hm){
        hm.put("SV01", new SinhVien("Nguyen Xuan Ngoc", "KTPM2", 8.5));
        hm.put("SV02", new SinhVien("Hoang Ngoc Son", "KHMT1", 9));
        hm.put("SV03", new SinhVien("Dang Hoang Anh", "CNTT3", 6.5));
        hm.put("SV04", new SinhVien("Hoang Quoc Anh", "HTTT1", 7.5));
        hm.put("SV05", new SinhVien("Ha Anh Tuan", "KHMT2", 8));
        sortAndDisplay(hm);
    }
    
    public static void ThemSinhVien(HashMap<String, SinhVien> hm){
        String masv;
        do{
            System.out.print("\nNhap vao ma sinh vien : ");
            masv = sc.nextLine();
            masv = masv.toUpperCase();
            if(hm.containsKey(masv))
                System.out.print("\nMa sv vua nhap vao da ton tai ! Vui long nhap lai");
        }while(hm.containsKey(masv));
        SinhVien sv = new SinhVien();
        sv.Nhap();
        hm.put(masv.toUpperCase(), sv);
    }
    
    public static void TimKiemSinhVien(HashMap<String, SinhVien> hm){
        System.out.print("\nNhap vao ma sinh vien cua sinh vien muon tim : ");
        String masv = sc.nextLine();
        masv = masv.toUpperCase();
        if(!hm.containsKey(masv))
            System.out.println("\n\nKhong tim thay sinh vien co ma nhu tren");
        else{
            SinhVien sv = hm.get(masv);
            System.out.println("\n===================== KET QUA TIM KIEM =====================");
            System.out.print(String.format("\n%20s %20s %20s %20s","Ma SV", "Ho Ten", "Lop", "Diem"));
            System.out.print(String.format("\n%20s", masv));
            sv.Xuat();
        }
    }
    
    public static void SuaThongTinSV(HashMap<String, SinhVien> hm){
        System.out.print("\nNhap vao ma sinh vien cua sinh vien muon sua thong tin : ");
        String masv = sc.nextLine();
        masv = masv.toUpperCase();
        if(!hm.containsKey(masv))
            System.out.println("\n\nKhong tim thay sinh vien co ma nhu tren");
        else{
            SinhVien sv = new SinhVien();
            sv.Nhap();
            hm.replace(masv, sv);
            System.out.print("\nSua thanh cong thong tin sinh vien co ma " + masv);
        }
    }
    
    public static void XoaSinhVien(HashMap<String, SinhVien> hm){
        System.out.print("\nNhap vao ma sinh vien cua sinh vien muon xoa : ");
        String masv = sc.nextLine();
        masv = masv.toUpperCase();
        if(!hm.containsKey(masv))
            System.out.println("\n\nKhong tim thay sinh vien co ma nhu tren");
        else{
            hm.remove(masv);
            System.out.print("\nXoa thanh cong sinh vien co ma " + masv);
        }
    }
}
