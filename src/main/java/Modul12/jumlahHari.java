/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class jumlahHari {
    public static void main(String[] args) {
        String jumlahHari;
        
        Scanner masukBulan = new Scanner(System.in);
        System.out.print("Masukkan bulan : ");
        jumlahHari = masukBulan.next().toLowerCase();
        
        switch (jumlahHari){
            case "january" : System.out.println("Jumlah hari 31 hari");
                           break;
            case "february" : System.out.println("Jumlah hari 28 hari");
                           break;               
            case "march" : System.out.println("Jumlah hari 31 hari");
                           break;
            case "april" : System.out.println("Jumlah hari 30 hari");
                           break;
            case "may" : System.out.println("Jumlah hari 31 hari");
                           break;
            case "june" : System.out.println("Jumlah hari 30 hari");
                           break;
            case "july" : System.out.println("Jumlah hari 31 hari");
                           break;
            case "august" : System.out.println("Jumlah hari 31 hari");
                           break;
            case "september" : System.out.println("Jumlah hari 31 hari");
                           break;              
            case "october" : System.out.println("Jumlah hari 31 hari");
                           break;               
            case "november" : System.out.println("Jumlah hari 31 hari");
                           break;
            case "december" : System.out.println("Jumlah hari 31 hari");
                           break;         
            default : System.out.println("Invalid Month");
        }
    }
}
