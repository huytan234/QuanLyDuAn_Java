/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTL;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainDemo {
    
    public static QuanLyDuAn q1 = new QuanLyDuAn();
    public static QuanLyNhanVien q2 = new QuanLyNhanVien();
    
    public static void main(String[] args) throws ParseException {
        menu();
    }    
    
    public static void menu() throws ParseException{
        int choose;
        do{
            System.out.println("<----------------------------------->");
            System.out.println("<--------------MENU----------------->");
            System.out.println("<----------------------------------->");
            System.out.println("1.Quan ly du an");
            System.out.println("2.Quan ly nhan vien");
            System.out.println("3.THOAT!!!!!!");
            System.out.print("Moi ban dua ra su lua chon: ");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();
            switch(choose){
                case 1:{
                    QuanLyDuAn();
                    break;
                }
                case 2:{
                    QuanLyNhanVien();
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
            
        }while(choose < 3);
        
    }
    public static void QuanLyDuAn(){
        int choose;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("<-----QUAN LY DU AN----->");
            System.out.println("1. Them du an");
            System.out.println("2. Xoa du an");
            System.out.println("3. Sua du an");
            System.out.println("4. Tim kiem theo ten");
            System.out.println("5. Tim kiem theo thoi gian bat dau");
            System.out.println("6. Sap xep theo kinh phi");
            System.out.println("7. Xuat ds nhan vien cua du an");
            System.out.println("8. THOAT!!!!!!!!!!!!!!");
            System.out.print("Moi ban dua ra lua chon: ");
            choose = sc.nextInt();
            switch(choose){
                case 1:{
                    System.out.print("Nhap so du an: ");
                    int n = sc.nextInt();
                    DuAn[] DA = new DuAn[n];
                    for(int i = 0; i < n; i++){
                        System.out.println("NHAP THONG TIN DU AN" + (i + 1));
                        DA[i] = new DuAn();
                        DA[i].nhapDA();
                        q1.themDA(DA[i]);
                    }
                    System.out.println("<---THEM DU AN THANH CONG!--->");
                    q1.xuatDsDuAn();
                    break;
                }
                case 2:{
                    System.out.println("<----XOA DU AN---->");
                    System.out.print("Nhap ten cua du an: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    q1.xoaDA(ten);
                    q1.xuatDsDuAn();
                    break;
                }
                case 3:{
                    System.out.print("Nhap ma du an: ");
                    int n = sc.nextInt();
                    System.out.println("<---NHAP DU AN MOI--->");
                    DuAn d1 = new DuAn();
                    d1.nhapDA();
                    q1.suaDA(n, d1);
                    System.out.println("!!! SUA DU AN THANH CONG !!!");
                    q1.xuatDsDuAn();
                    break;
                }
                case 4:{
                    System.out.print("Nhap ten du an: ");
                    sc.nextLine();
                    String a = sc.nextLine();
                    System.out.println("<-----Ket Qua Tim Kiem----->");
                    q1.TimKiemDATheoTen(a).forEach(s -> s.xuatDA());
                    break;
                }
                case 5:{
                    System.out.print("Nhap thoi diem bat dau: ");
                    sc.nextLine();
                    String a = sc.nextLine();
                    System.out.println("<-----Ket Qua Tim Kiem----->");
                    q1.TimKiemDATheoTGBatDau(a).forEach(s -> s.xuatDA());
                    break;
                }
                case 6:{
                    System.out.println("<=====CHOOSE=====>");
                    System.out.println("- Tang Dan");
                    System.out.println("- Giam Dan");
                    System.out.print("Chon: ");
                    int n = sc.nextInt();
                    if (n == 1) {
                        q1.sapXepDuAnTangDan();
                    }
                    if (n == 2) {
                        q1.sapXepDuAnGiamDan();
                    }
                    q1.xuatDsDuAn();
                    break;
                }
                case 7:{
                    System.out.print("Nhap ten du an: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    q1.TimKiemDATheoTen(ten).forEach(s -> s.xuatDsNVCuaDA());
                    System.out.println("Chuong Trinh Ket Thuc");
                    break;
                }
                default:{
                    System.exit(0);
                    break;
                }
            }
            
            
        }while(choose < 8);
    }
    public static void QuanLyNhanVien() throws ParseException{
        int choose;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("<----------QUAN LY NHAN VIEN------------>");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Tim kiem theo ngay sinh");
            System.out.println("4. Tim kiem theo phong ban");
            System.out.println("5. Tim kiem theo do tuoi");
            System.out.println("6. Xuat ds than nhan");
            System.out.println("7. Xuat ds du an");
            System.out.println("8. Thoat");
            System.out.print("Moi ban dua ra su lua chon: ");
            choose = sc.nextInt();
            switch(choose){
                case 1:{
                    themNV();
                    q2.xuatDsNV();
                    break;
                }
                case 2:{
                    System.out.println("Nhap ten nhan vien: ");
                    sc.nextLine();
                    String a = sc.nextLine();
                    System.out.println("=====Ket Qua Tim Kiem=====");
                    q2.TimKiemTheoTen(a).forEach(s -> s.xuatNV());
                    break;
                }
                case 3:{
                    System.out.println("Nhap ngay sinh: ");
                    sc.nextLine();
                    String a = sc.nextLine();
                    System.out.println("=====Ket Qua Tim Kiem=====");
                    q2.TimKiemTheoNgaySinh(a).forEach(s -> s.xuatNV());
                    break;  
                }
                case 4:{
                    break;
                }
                case 5:{
                    System.out.println("Nhap khoang gia tri do tuoi: ");
                    Double a = sc.nextDouble();
                    Double b = sc.nextDouble();
                    System.out.println("=====Ket Qua Tim Kiem=====");
                    q2.TimKiemTheoTuoi(a, b).forEach(s -> s.xuatNV());
                    break;
                }
                case 6:{
                    System.out.print("Nhap ma NV: ");
                    sc.nextLine();
                    String ma = sc.nextLine();
                    q2.TimKiemTheoMa(ma).forEach(s -> s.xuatDsTNCuaNV());
                    break;
                }
                case 7: {
                    System.out.print("Nhap ten nhan vien: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    q2.TimKiemTheoTen(ten).forEach(s -> s.xuatDsDaCuaNV());
                    break;
                }
                default:{
                    System.exit(0);
                    break;
                }
            }
            
            
        }while(choose < 7);
    }
    
    
    
    public static void themNV() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        int n = sc.nextInt();
        NhanVien[] NV = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin NV: ");
            System.out.println("<---BANG NHAN VIEN--->");
            System.out.println("1. Nhan Vien");
            System.out.println("2. Lap Trinh Vien");
            System.out.println("3. Thiet Ke Vien");
            System.out.println("4. Kiem Thu Vien");
            System.out.println("Chon loai NV: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    NV[i] = new NhanVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    NV[i].tinhTuoi();
                    q2.themNV(NV[i]);
                    break;
                }
                case 2: {
                    NV[i] = new LapTrinhVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    NV[i].tinhTuoi();
                    q2.themNV(NV[i]);
                    break;
                }
                case 3: {
                    NV[i] = new KiemThuVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    NV[i].tinhTuoi();
                    q2.themNV(NV[i]);
                    break;
                }
                case 4: {
                    NV[i] = new ThietKeVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    NV[i].tinhTuoi();
                    q2.themNV(NV[i]);
                    break;
                }
            }
        }
        System.out.println("Them nhan vien thanh cong !!!!");
    }
    
}
