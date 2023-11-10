/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import demoClass.KyHan;
import demoClass.TaiKhoanKyHan;
import demoClass.TaiKhoan;

/**
 *
 * @author ACER
 */
public class demo {
    public static void main(String[] args){
        TaiKhoan t1 = new TaiKhoan("Nguyen Huy Tan", 10000);
        TaiKhoan t2 = new TaiKhoanKyHan("Tran Huu Dat", 100000, KyHan.MOT_TUAN);
    
        t1.hienThi();
        t2.hienThi();
        
    }
    
}
