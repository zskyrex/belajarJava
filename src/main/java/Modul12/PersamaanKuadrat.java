/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;
import java.util.Scanner;
/**
 *
 * @author Richard
 */
public class PersamaanKuadrat {
    public static void main(String[] args) {
        double a, b, c, D, x1,x2;
        Scanner dataKuadrat = new Scanner(System.in);
        System.out.print("Koefisien x2 (a) = ");
        a = dataKuadrat.nextDouble();
        System.out.print("Koefisien x (b) = ");
        b = dataKuadrat.nextDouble();
        System.out.print("Koefisien (c) = ");
        c = dataKuadrat.nextDouble();
        
        D = b * b - (4*a*c);
        
        if (D < 0 || a == 0){
            System.out.println("Tidak memiliki akar nyata/real");
        }else if (D == 0){
            x1 = -b/(2*a);
            System.out.println("Akarnya tunggal yakni "+x1);
        }else {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Akar pertama = "+x1);
            System.out.println("Akar kedua = "+x2);
        }
    }
}
