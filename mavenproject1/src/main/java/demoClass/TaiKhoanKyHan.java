package demoClass;


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
public class TaiKhoanKyHan extends TaiKhoan {
    private KyHan kyHan;
    private Calendar ngayDaoHan;
    
    public TaiKhoanKyHan(String tenTK, double soTien, KyHan kyHan){
        super(tenTK, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = new GregorianCalendar();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han: %s\nNgay dao han: %s\n",
                this.kyHan, f.format(this.ngayDaoHan.getTime()));
    }
    
    
    
    
    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
