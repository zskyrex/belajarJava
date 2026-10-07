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
public class diskonSwalayan {
    public static void main(String[] args) {
        int toBel;
        double harTo;
        
        Scanner totalHarga = new Scanner(System.in);
        System.out.print("Masukkan harga total belanja : ");
        toBel = totalHarga.nextInt();
        
        System.out.println("");
        
        if ((200000 >= toBel) && (toBel >= 100000)){
            harTo = 0.9 * toBel;
            System.out.println("Selamat karena total belanjamu "+toBel
                    + " maka anda mendapatkan diskon 10% dan "
                     +"total harga setelah diskon adalah "+harTo);
        } else if ((300000 >= toBel) && (toBel >= 200000)){
            harTo = 0.85 * toBel;
           System.out.println("Selamat karena total belanjamu "+toBel
                    + " maka anda mendapatkan diskon 15% dan "
                     +"total harga setelah diskon adalah "+harTo);
        } else {
            harTo = 0.8 * toBel;
            System.out.println("Selamat karena total belanjamu "+toBel
                    + " maka anda mendapatkan diskon 20% dan "
                     +"total harga setelah diskon adalah "+harTo);
        }
    }
}
