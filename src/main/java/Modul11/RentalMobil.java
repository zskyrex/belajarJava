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
public class RentalMobil {
    public static void main(String[] args) {
        System.out.println("Rental Mobil");
        System.out.println("INDOCAR RENTAL");
        System.out.println("");
        
        int jam_sewa, tarif_sewa,total_sewa;
        tarif_sewa = 125000;
        
        Scanner renMob = new Scanner(System.in);
        System.out.print("Mobil disewa berapa jam : ");
        jam_sewa = renMob.nextInt();
        System.out.println("");
        
        total_sewa = tarif_sewa * jam_sewa;
        
        System.out.println("Jumlah jam sewa      : "+jam_sewa);
        System.out.println("Biaya sewa per jam   : "+tarif_sewa);
        System.out.println("________________________________");
        System.out.println("Total biaya sewa     : "+ total_sewa);
    }
}
