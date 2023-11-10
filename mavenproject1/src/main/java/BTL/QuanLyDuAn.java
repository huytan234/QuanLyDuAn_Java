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
 * @author ACER
 */
public class QuanLyDuAn{
    private List<NhanVien> dsnv = new ArrayList<>();
    private List<DuAn> dsda = new ArrayList<>();

	public void themDA(DuAn... s) {
            this.dsda.addAll(Arrays.asList(s));
	}

        public void xoaDA(String ten) {
            DuAn xoaDA = null;
            for(DuAn da : getDsda()) {
                if(ten.equalsIgnoreCase(da.getTenDA())) {
                    xoaDA = da;
                    break;
                }     
            }
            if(xoaDA != null) {
                getDsda().remove(xoaDA);
                System.out.println("-> Da xoa");
                
            }else
                System.out.println("-> Khong Tim Thay");
            
	}

	public void suaDA(int n, DuAn s) {
            
            this.dsda.set(n,s);
	}
        
	public void xuatDsDuAn() {
            System.out.println("<======= Danh sach hien tai la =========>");
            this.dsda.forEach(s -> s.xuatDA());
            
	}

	public List<DuAn> TimKiemDATheoTen(String ten) {
            return this.dsda.stream().filter(s -> s.getTenDA().contains(ten)).collect(Collectors.toList());
	}

	public List<DuAn> TimKiemDATheoTGBatDau(String batDau) {
            return this.dsda.stream().filter(s -> s.getThoiDiemBatDau().contains(batDau)).collect(Collectors.toList());
	}

        public void sapXepDuAnGiamDan() {
            this.dsda.sort((d1,d2) -> {
            double g1 = d1.getTongKinhPhi();
            double g2 = d2.getTongKinhPhi();
            return +(g1 < g2 ? 1 : (g1 > g2 ? -1 : 0));
        });
        }
        
        public void sapXepDuAnTangDan() {
            this.dsda.sort((d1,d2) -> {
            double g1 = d1.getTongKinhPhi();
            double g2 = d2.getTongKinhPhi();
            return +(g1 > g2 ? 1 : (g1 < g2 ? -1 : 0));
        });
        }

   

    /**
     * @return the dsnv
     */
    public List<NhanVien> getDsnv() {
        return dsnv;
    }

    /**
     * @param dsnv the dsnv to set
     */
    public void setDsnv(List<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    /**
     * @return the dsda
     */
    public List<DuAn> getDsda() {
        return dsda;
    }

    /**
     * @param dsda the dsda to set
     */
    public void setDsda(List<DuAn> dsda) {
        this.dsda = dsda;
    }
}