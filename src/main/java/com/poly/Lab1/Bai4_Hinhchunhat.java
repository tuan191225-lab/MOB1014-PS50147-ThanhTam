/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.Lab1;

import java.util.Scanner;

/**
 *
 * @author NGUYEN THANH TAM
 */
public class Bai4_Hinhchunhat {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d,r,s,cv;
        System.out.print("Nhap chieu dai: ");
        d = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        r = sc.nextDouble();
        cv = 2*(d+r);
        s = d*r;
        System.out.printf("Dien tich hinh chu nhat: %2f\nChieu dai: %2f\nChieu rong: %2f\nChu vi: %2f\n",s, d, r, cv);
   }
}
