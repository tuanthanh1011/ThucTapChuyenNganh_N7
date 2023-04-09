/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuctapcn.Tuan5.vidu3;

/**
 *
 * @author thong
 */
public abstract class HinhPhang {
    protected String tenHinh;
    abstract double tinhCV();
    abstract double tinhDT();
    public String toString(){
        return tenHinh;
    }
}


