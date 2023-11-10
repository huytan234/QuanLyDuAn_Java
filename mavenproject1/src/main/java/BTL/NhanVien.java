/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class NhanVien {
    private String maNV;
    private String ngaySinh;
    private String hoTen;
    private String email;
    private String gioiTinh;
        protected double luongCB;
        protected double heSo;
        protected double luong;
    private double tuoi;
    private List<DuAn> duAn = new ArrayList<>();
    private List<ThanNhan> thanNhan = new ArrayList<>();
    public NhanVien(){
        super();
    }
    public void NhanVien(List<DuAn> duAn){
        this.duAn = duAn;
    }
    public NhanVien(String maNV, String ngaySinh, String hoTen, String email, String gioiTinh, double luongCB, double heSo) {
        this.maNV = maNV;
        this.ngaySinh = ngaySinh;
        this.hoTen = hoTen;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.luongCB = luongCB;
        this.heSo = heSo;
    }
    
    
    public void nhapNV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Luong CB: ");
        luongCB = sc.nextDouble();
        sc.nextLine();
        System.out.print("He so: ");
        heSo = sc.nextDouble();
    }
    public void xuatNV() {
        System.out.printf("Ma nv: %s\nNgay sinh: %s\nHo ten: %s\nEmail: %s\nGioi tinh: %s\nLuong CB: %.0f\nHe so: %.0f\nLuong: %.0f\nTuoi: %.0f\n",
                this.maNV, this.ngaySinh, this.hoTen, this.email, this.gioiTinh, this.luongCB, this.heSo, this.luong, this.getTuoi());
    }

    public double tinhLuong() {
        this.setLuong(this.getLuongCB() * this.getHeSo());
        return this.getLuong();
    }
    public double tinhTuoi() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            
            Date ngaysinh = f.parse(ngaySinh);
            Date hientai = new Date();
            long start = ngaysinh.getTime();
            long end = hientai.getTime();
            this.setTuoi(Math.abs(start - end) / 1000 / 60 / 60 / 24 / 30 / 12);
            
        } catch (ParseException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.getTuoi();
    }
    public void themDAChoNV(DuAn... s) {
        this.duAn.addAll(Arrays.asList(s));
    }
    public void xuatDsDaCuaNV() {
        System.out.println("---Danh sach du an---");
        this.duAn.forEach(s -> s.xuatDA());
    }
    
    public void themTNchoNV(ThanNhan... s) {
        this.getThanNhan().addAll(Arrays.asList(s));
    }
    public void xuatDsTNCuaNV() {
        System.out.println("---Danh sach than nhan---");
        this.getThanNhan().forEach(s -> s.xuatTN());
    }
    
    
    

    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    } 

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
  
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }*/

    /**
     * @return the luongCB
     */
    public double getLuongCB() {
        return luongCB;
    }

    /**
     * @param luongCB the luongCB to set
     */
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    /**
     * @return the heSo
     */
    public double getHeSo() {
        return heSo;
    }

    /**
     * @param heSo the heSo to set
     */
    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    /**
     * @return the luong
     */
    public double getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(double luong) {
        this.luong = luong;
    }

    /**
     * @return the tuoi
     */
    public double getTuoi() {
        return tuoi;
    }

    /**
     * @param tuoi the tuoi to set
     */
    public void setTuoi(double tuoi) {
        this.tuoi = tuoi;
    }

    /**
     * @return the thanNhan
     */
    public List<ThanNhan> getThanNhan() {
        return thanNhan;
    }

    /**
     * @param thanNhan the thanNhan to set
     */
    public void setThanNhan(List<ThanNhan> thanNhan) {
        this.thanNhan = thanNhan;
    }

   
    
}
