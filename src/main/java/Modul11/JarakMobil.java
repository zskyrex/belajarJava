/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

import java.util.Scanner;

/**
 *
 * @author Richard Fernando 265314027
 */
public class JarakMobil {
    public static void main(String[] args) {
        System.out.println("Menghitung Kecepatan dan percepatan mobil");
        System.out.println("");
        double St,v, a, t ; //Jarak tempuh = St,Kecepatan = v0, perceptan = a, waktu = t
        Scanner kecPer = new Scanner(System.in);
        System.out.print("Masukkan kecepatan    : ");
        v = kecPer.nextDouble();
        System.out.print("Masukkan percepatan   : ");
        a = kecPer.nextDouble();
        System.out.print("Masukkan waktu        : ");
        t = kecPer.nextDouble();
        
        St = (v * t)+(0.5 * a * (t*t));
        System.out.println("");
        
        System.out.println("Kecepatan           = "+v+" m/s");
        System.out.println("Percepatan          = "+a+" m/s²");
        System.out.println("Waktu               = "+t+" sekon");
        System.out.println("Jarak yang ditempuh = "+St+" Meter");
    } 
}
