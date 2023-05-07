/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuctapcn.Tuan8.vidu2;

/**
 *
 * @author tuant
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ThoiGian thoiGian = new ThoiGian(31, 12, 2022);
            System.out.println("Thoi gian: " + thoiGian.getNgay() + "/" + thoiGian.getThang() + "/" + thoiGian.getNam());
        } catch (InvalidDateException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
