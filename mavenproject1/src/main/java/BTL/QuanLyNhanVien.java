/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Acer
 */
public class QuanLyNhanVien {
    private List<NhanVien> ds = new ArrayList<>();
    
  

    public void themNV(NhanVien... s) {
        this.ds.addAll(Arrays.asList(s));
    }

    public void xoaNV(String ten) {
        NhanVien xoaNV = null;
        for (NhanVien nv : ds) {
            if (ten.equalsIgnoreCase(nv.getHoTen())) {
                xoaNV = nv;
                break;
            }
        }
        if (xoaNV != null) {
            ds.remove(xoaNV);
            System.out.println("DA XOA");
        } else {
            System.out.println("KHONG TIM THAY");
        }
    }

    public void xuatDsNV() {
        System.out.println("DANH SACH NHAN VIEN");
        this.ds.forEach(s -> s.xuatNV());
    }

    public List<NhanVien> TimKiemTheoTen(String ten) {
        return this.ds.stream().filter(s -> s.getHoTen().contains(ten)).collect(Collectors.toList());
    }

    public List<NhanVien> TimKiemTheoMa(String ma) {
        return this.ds.stream().filter(s -> s.getMaNV().contains(ma)).collect(Collectors.toList());
    }

    public List<NhanVien> TimKiemTheoNgaySinh(String ngaysinh) {
        return this.ds.stream().filter(s -> s.getNgaySinh().contains(ngaysinh)).collect(Collectors.toList());
    }

    public List<NhanVien> TimKiemTheoTuoi(double tuTuoi, double denTuoi) {
        return this.ds.stream().filter(s -> s.getTuoi() >= tuTuoi && s.getTuoi() <= denTuoi).collect(Collectors.toList());
    }

    public void xuatDsTNTheoMaNV(String ma) {
        this.ds.stream().filter(s -> s.getMaNV().contains(ma)).collect(Collectors.toList());
    }
        
        
        
	

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }

  
}