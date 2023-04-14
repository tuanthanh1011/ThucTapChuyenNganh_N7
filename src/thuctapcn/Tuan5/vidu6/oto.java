/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu6;

/**
 *
 * @author Admin
 */
public class oto extends PhuongTienDiChuyen{
  
    private String loaiNhienLieu;

    public oto(String loaiNhienLieu, String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        super(tenLoaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {

return 60;    }
    
    
}
