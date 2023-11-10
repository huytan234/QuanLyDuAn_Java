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
public class KiemThuVien extends NhanVien{
    private double soLoi;
    Scanner sc = new Scanner(System.in);
    
    public KiemThuVien() {
        super();
    }
    public KiemThuVien(String maNV, String ngaySinh, String hoTen, String email, String gioiTinh, double luongCB, double heSo,double soLoi) {
        super(maNV, ngaySinh, hoTen, email, gioiTinh, luongCB, heSo);
        this.soLoi = soLoi;
    }
    

    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Nhap so loi: ");
        soLoi = sc.nextDouble();
    }
    

    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("So loi: %.0f\n",this.soLoi);
        
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo + this.soLoi*200000; 
        return this.luong;
    }

    @Override
    public double tinhTuoi() {
        return super.tinhTuoi(); 
    }


    /**
     * @return the soLoi
     */
    public double getSoLoi() {
        return soLoi;
    }

    /**
     * @param soLoi the soLoi to set
     */
    public void setSoLoi(double soLoi) {
        this.soLoi = soLoi;
    }

}
