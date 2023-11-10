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
public class ThietKeVien extends NhanVien{
    private double bonus;
    Scanner sc = new Scanner(System.in);
    
    public ThietKeVien(){
        super();
    }
    
    public ThietKeVien(String maNV, String ngaySinh, String hoTen, String email, String gioiTinh, double luongCB, double heSo,double bonus) {
        super(maNV, ngaySinh, hoTen, email, gioiTinh, luongCB, heSo);
        this.bonus = bonus;
    }
   
    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Nhap tien thuong: ");
        bonus = sc.nextDouble();
    }

    
    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("Tien thuong: %.0f\n",this.bonus);
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo + this.bonus;
        return this.luong;
    }

    @Override
    public double tinhTuoi() {
        return super.tinhTuoi(); 
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
        
}
