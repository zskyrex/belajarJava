/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul13;
import java.util.Scanner;
/**
 *
 * @author Richard
 */
public class Looping4 {
    public static void main(String[] args) {
        int ulang = 1;
        double jumlah = 0;
        double  bilangan;
        Scanner tombol = new Scanner(System.in);
        while (ulang <= 5){
            System.out.print("Masukkan data ke "+ulang+" : ");
            bilangan = tombol.nextDouble();
            jumlah = jumlah + bilangan;
            ulang++;
        }
        System.out.println("jumlah 5 bilangan tersebut adalah "+jumlah);
    }
}
