/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuctapcn.Tuan5.vidu4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author An Viet Computer
 */
public class De3_BenhNhan {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int n;
    static BenhNhan[] dsbn;
    static BenhNhan[] newdsbn;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        dsbn = new BenhNhan[3];
        fakeData();
        System.out.println("Danh sách vừa nhập: ");
        inTieuDe();
        inDL(dsbn);
        nhapSL();
        newdsbn = new BenhNhan[3+n];
        themBN();
        System.out.println("Danh sach sau khi bo sung: ");
        inTieuDe();
        inDL(newdsbn);
        //System.out.println("Danh sach sau khi sap xep tang dan: ");
        
        //inTieuDe();
        //sapXeptangdan(newdsbn);
        System.out.println("Danh sach sau khi sap xep giam dan: ");
        inTieuDe();
        sapXepgiamdan(newdsbn);
        //System.out.println("Benh nhan co tuoi nho nhat: ");
        //timMin(newdsbn);
    }
    public static void fakeData(){
        BenhNhan bn1 = new BenhNhan("Dao Thi Thao", 21, 'F', "Khong co", "Sot");
        dsbn[0] = bn1;
        BenhNhan bn2 = new BenhNhan("An Thi Ngoc Mai", 20, 'F', "Khong co", "Nhuc dau");
        dsbn[1] = bn2;
        BenhNhan bn3 = new BenhNhan("Do Ngoc Mai", 20, 'F', "Khong co", "Nhuc dau");
        dsbn[2] = bn3;
    }
    public static void inTieuDe(){
        System.out.printf("%-20s %-10s %-15s %-25s %-30s %n", "Ho ten", "Tuoi", "Gioi tinh", "Tien su", "Chan doan");
    }
    public static void inDL(BenhNhan[] arr){
        for(BenhNhan bn : arr){
            System.out.println(bn);
        }
    }
    public static void nhapSL(){
        System.out.print("Nhap so luong benh nhan muon them: ");
        do{
            n = sc.nextInt();
            if(n<1){
                System.out.print("Nhap lai so luong lon hơn bang 1: ");
            }
        }while(n<1);
    }
    public static void themBN(){
        for(int i=0; i<3; i++){
            newdsbn[i] = dsbn[i];
        }
        for(int i=3; i<3+n; i++){
            BenhNhan bn = new BenhNhan();
            bn.nhapThongTin();
            newdsbn[i] = bn;
        }
    }
    /*public static void sapXeptangdan(BenhNhan[] arr){
        Collections.sort(Arrays.asList(arr));
        inDL(arr);
    }*/
    public static void sapXepgiamdan(BenhNhan[] arr){
        Comparator<BenhNhan> reverseOrder = Collections.reverseOrder();
        Collections.sort(Arrays.asList(arr));
        inDL(arr);
    }
    /*public static void timMin(BenhNhan[] arr){
        
       BenhNhan minAge = Collections.min(Arrays.asList(arr));
       System.out.printf("%-20s %-10s %-15s %-25s %-30s %n", 
               minAge.getTen(), minAge.getTuoi(), (minAge.getGioiTinh() == 'N') ?"Nam":"Nữ", minAge.getTienSu(), minAge.getChanDoan());
    }*/
}
