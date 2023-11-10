package demoClass;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

      /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class TaiKhoan {
    protected static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem = 0;
    private String soTK;
    private String tenTK;
    private double soTien;
    private Calendar ngayTao;
    
    
    {
        ngayTao = new GregorianCalendar();
        soTK = String.format("%06d", ++dem);
    }
    
    public TaiKhoan(String tenTK, double soTien){
        this.tenTK = tenTK;
        this.soTien = soTien;
    }
    
    public void hienThi(){
        System.out.printf("So tai khoan: %s\nTen tai khoan: %s\nSo tien: %.1f VND\nNgay tao: %s\n",
                this.soTK, this.tenTK,this.soTien, f.format(this.ngayTao.getTime()));
    }
    
    
    
    /**
     * @return the soTK
     */
    public String getSoTK() {
        return soTK;
    }

    /**
     * @param soTK the soTK to set
     */
    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }

    /**
     * @param tenTK the tenTK to set
     */
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTao
     */
    public Calendar getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Calendar ngayTao) {
        this.ngayTao = ngayTao;
    }
}
