package demoClass;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class BT01 {
    public static void main(String[] args) {
        int n = (int) (Math.random()*100 + 1);
        Scanner sc = new Scanner(System.in);
        int x;
        do{
            System.out.println("Nhap so: ");
            x = sc.nextByte();
            if(x > n)
                System.out.println("So ban doan dang lon hon! ");
            else if(x < n)
                System.out.println("So ban doan dang nho hon! ");
            else
                System.out.println("Ban doan dung!!!");
        } while(x != n);
    }
}
