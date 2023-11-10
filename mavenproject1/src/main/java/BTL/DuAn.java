/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class DuAn {
    private String maDA;

    private String tenDA;

    private String thoiDiemBatDau;

    private String thoiDiemKetThuc;

    private double tongKinhPhi;

    private String nguoiChuNhiem;
    private List<NhanVien> nhanVien = new ArrayList<>();

    
    public DuAn() {
        super();
    }    
    public DuAn(String maDA, String tenDA, String thoiDiemBatDau, String thoiDiemKetThuc, double tongKinhPhi, String nguoiChuNhiem) {
        this.maDA = maDA;
        this.tenDA = tenDA;
        this.thoiDiemBatDau = thoiDiemBatDau;
        this.thoiDiemKetThuc = thoiDiemKetThuc;
        this.tongKinhPhi = tongKinhPhi;
        this.nguoiChuNhiem = nguoiChuNhiem;
    }
    public void nhapDA() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ma du an: ");
        maDA= sc.nextLine();
        System.out.print("Ten du an: ");
        tenDA = sc.nextLine();
        System.out.print("Thoi diem bat dau: ");
        thoiDiemBatDau = sc.nextLine();
        System.out.print("Thoi diem ket thuc: ");
        thoiDiemKetThuc = sc.nextLine();
        System.out.print("Kinh phi: ");
        tongKinhPhi = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nguoi chu nhiem: ");
        nguoiChuNhiem = sc.nextLine();  
       }
     
    public void xuatDA() {
        System.out.printf("Ma du an: %s\nTen du an: %s\nBat dau: %s\nKet thuc: %s\nKinh phi: %.0f\nChu nhiem: %s\n",
                    this.maDA,this.tenDA,this.thoiDiemBatDau,this.thoiDiemKetThuc,this.tongKinhPhi,this.nguoiChuNhiem);
        System.out.println("-------------------");
    }
   
    public void themNVChoDA(NhanVien... s) {
        this.nhanVien.addAll(Arrays.asList(s));
    }

    public void xuatDsNVCuaDA() {
        System.out.println("======= Danh sach hien tai la =========");
        this.nhanVien.forEach(s -> s.xuatNV());
    }
        
     
    /**
     * @return the maDA
     */
    public String getMaDA() {
        return maDA;
    }

    /**
     * @param maDA the maDA to set
     */
    public void setMaDA(String maDA) {
        this.maDA = maDA;
    }

    /**
     * @return the tenDA
     */
    public String getTenDA() {
        return tenDA;
    }

    /**
     * @param tenDA the tenDA to set
     */
    public void setTenDA(String tenDA) {
        this.tenDA = tenDA;
    }

    /**
     * @return the thoiDiemBatDau
     */
    public String getThoiDiemBatDau() {
        return thoiDiemBatDau;
    }

    /**
     * @param thoiDiemBatDau the thoiDiemBatDau to set
     */
    public void setThoiDiemBatDau(String thoiDiemBatDau) {
        this.thoiDiemBatDau = thoiDiemBatDau;
    }

    /**
     * @return the thoiDiemKetThuc
     */
    public String getThoiDiemKetThuc() {
        return thoiDiemKetThuc;
    }

    /**
     * @param thoiDiemKetThuc the thoiDiemKetThuc to set
     */
    public void setThoiDiemKetThuc(String thoiDiemKetThuc) {
        this.thoiDiemKetThuc = thoiDiemKetThuc;
    }

    /**
     * @return the tongKinhPhi
     */
    public double getTongKinhPhi() {
        return tongKinhPhi;
    }

    /**
     * @param tongKinhPhi the tongKinhPhi to set
     */
    public void setTongKinhPhi(double tongKinhPhi) {
        this.tongKinhPhi = tongKinhPhi;
    }

    /**
     * @return the nguoiChuNhiem
     */
    public String getNguoiChuNhiem() {
        return nguoiChuNhiem;
    }

    /**
     * @param nguoiChuNhiem the nguoiChuNhiem to set
     */
    public void setNguoiChuNhiem(String nguoiChuNhiem) {
        this.nguoiChuNhiem = nguoiChuNhiem;
    }

    /**
     * @return the nhanVien
     */
    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }

    /**
     * @param nhanVien the nhanVien to set
     */
    public void setNhanVien(List<NhanVien> nhanVien) {
        this.nhanVien = nhanVien;
    }
}
