/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5;

/**
 *
 * @author Admin
 */
public class maybay extends PhuongTienDiChuyen{
    
    private String loainhienlieu;

    public maybay(String loainhienlieu, String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        super(tenLoaiPhuongTien, hangSanXuat);
        this.loainhienlieu = loainhienlieu;
    }

    

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    @Override
    public double layVanToc() {
         return 300;  
    }
    
    public void hacanh(){
        System.out.println("Cat canh ...");
    }
    public void catcanh(){
        System.out.println("hacanh....");
    }

    
    
    
}
