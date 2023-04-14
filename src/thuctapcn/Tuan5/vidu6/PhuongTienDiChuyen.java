/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu6;

/**
 *
 * @author Admin
 */
public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void Batdau(){
        System.out.println("Start .....");
    }
    
    public void tangtoc(){
        System.out.println("go go .....");
    }
    
    public void dunglai(){
        System.out.println("dunglai .....");
    }
    
    public abstract double layVanToc();
}
