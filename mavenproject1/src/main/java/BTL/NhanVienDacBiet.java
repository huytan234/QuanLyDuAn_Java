/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

/**
 *
 * @author ACER
 */
public class NhanVienDacBiet extends NhanVien{
    private String ngayNhamChuc;

    public NhanVienDacBiet(String ngayNhamChuc, String maNV, String ngaySinh, String hoTen, String email, String gioiTinh, double luongCB, double heSo) {
        super(maNV, ngaySinh, hoTen, email, gioiTinh, luongCB, heSo);
        this.ngayNhamChuc = ngayNhamChuc;
    }


    
    
    
    

    /**
     * @return the ngayNhamChuc
     */
    public String getNgayNhamChuc() {
        return ngayNhamChuc;
    }

    /**
     * @param ngayNhamChuc the ngayNhamChuc to set
     */
    public void setNgayNhamChuc(String ngayNhamChuc) {
        this.ngayNhamChuc = ngayNhamChuc;
    }
}
