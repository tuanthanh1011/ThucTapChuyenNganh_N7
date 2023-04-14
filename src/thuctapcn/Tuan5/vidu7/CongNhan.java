/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu7;

/**
 *
 * @author lethi
 */
public abstract class CongNhan {

    private String hoten;
    private String diachi;
    private String loaicongnhan;

    public CongNhan(String hoten, String diachi, String loaicongnhan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.loaicongnhan = loaicongnhan;
    }

    public CongNhan() {
        
    }

    public String getHoten() {
        return hoten;
    }

    
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoten = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        System.out.print("Nhập loại công nhân(CNKSP, CNTCN): ");
        loaicongnhan = sc.nextLine();
    }
    
    public abstract double tinhLuong();
    
    public void inThongTin() {
        System.out.printf("%-20s %-30s %-20s %-15.2f%n", hoten, diachi, loaicongnhan, tinhLuong());
    }

    void nhapThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
