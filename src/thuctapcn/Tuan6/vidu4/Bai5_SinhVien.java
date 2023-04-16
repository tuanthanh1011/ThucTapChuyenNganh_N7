/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Nhập một danh sách sinh viên, sử dụng hàm fakedata, sắp xếp theo thứ tự tăng dần của tuổi
package thuctapcn.Tuan6.vidu4;

/**
 *
 * @author An Viet Computer
 */
public class Bai5_SinhVien {

    /**
     * @param args the command line arguments
     */
    static SinhVien[] dssv;
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3;
        dssv = new SinhVien[n];
        fakeData();
        
        inDSSV();
    }
    public static void fakeData(){
        Truong tr = new Truong("DHCN", "Hà Nội", "Trần Đức Qúy");
        SinhVien sv = new SinhVien("Đào Thị Thảo",21,'R', "HTTT01", "HTTT", tr);
        dssv[0] = sv;
        SinhVien sv1 = new SinhVien("Lưu Tuấn Thành",20,'M',"HTTT01", "HTTT", tr);
        dssv[1] = sv1;
        SinhVien sv2 = new SinhVien("Mai Công Sao",19,'M',"CNTT01","CNTT", tr);
        dssv[2] = sv2;
        
    }
    
    public static void inDSSV(){
        
        for(SinhVien sv:dssv)
            System.out.println(sv);
    }
}
