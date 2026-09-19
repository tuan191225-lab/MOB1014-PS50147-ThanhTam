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
public class Bai3_Hinhtron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        double r,cv,dt;
        System.out.print("Ban kinh hinh tron: ");
        r = sc.nextDouble();
        cv = r*2*PI;
        dt = r*r*PI;
        System.out.printf("Duong tron co ban kinh: %2f\nChu vi: %2f\nDien tich: %2f\n",r, cv, dt);
        
    }
    
}
