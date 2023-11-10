/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LapTrinhVien extends NhanVien{
    private double luongOT;
    Scanner sc = new Scanner(System.in);
    public LapTrinhVien() {
       super();
    }
    public LapTrinhVien(double luongOT) {
        super();
        this.luongOT = luongOT;
    }
    public LapTrinhVien(String maNV, String ngaySinh, String hoTen, String email, String gioiTinh, double luongCB, double heSo, double luongOT) {
        super(maNV, ngaySinh, hoTen, email, gioiTinh, luongCB, heSo);
        this.luongOT = luongOT;
    }
    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Nhap luong OT: ");
        luongOT = sc.nextDouble();
    }

    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("Luong OT: %.0f\n", this.luongOT);
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo + this.getLuongOT(); 
        return this.luong;
    }
    @Override
    public double tinhTuoi() {
        return super.tinhTuoi(); 
    }
    
    
    
    
    /**
     * @return the luongOT
     */
    public double getLuongOT() {
        return luongOT;
    }

    /**
     * @param luongOT the luongOT to set
     */
    public void setLuongOT(double luongOT) {
        this.luongOT = luongOT;
    }
    
}
