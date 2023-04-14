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
public class Test {
    static SinhVien[] dssv;
    public static void main(String[] args){
        
         //khoi tao doi tuong tu lop truong
         int n=3; 
        //System.out.println("Nhap so sinh vien: ");
        dssv = new SinhVien[n];
        fakeData();
        inDSSV();
    }
    
    
    public static void fakeData(){
        Truong tr = new Truong("DHCN","Ha Noi","Tran Duc Quy");
        SinhVien sv = new SinhVien("HTTT1","HTTT",tr,"Dao Thi Thao",20,'N');
        dssv[0] = sv;
        SinhVien sv1 = new SinhVien("KHMT1","KHMT",tr,"Nguyen Minh Nhat",21,'n');
        dssv[1] = sv1;
        SinhVien sv2 = new SinhVien("CNTT2","CNTT",tr,"Nguyen Minh Hoang",20,'n');
        dssv[2] = sv2;
    }
    public static void inDSSV(){
        for(SinhVien sv:dssv)
            System.out.println(sv);
    }
}
