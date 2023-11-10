/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class PhongBan {
    private String tenPhongBan;
    private List<NhanVien> ds = new ArrayList<>();

    /**
     * @return the tenPhongBan
     */
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    /**
     * @param tenPhongBan the tenPhongBan to set
     */
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
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
