/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul13;

/**
 *
 * @author Richard
 */
public class HargaPerLiter {
    public static void main(String[] args) {
        System.out.println("--------Harga Per Liter 6500--------");
        System.out.println("Jumlah Liter               Harga(Rp)");
        System.out.println("====================================");
        
        int jumlahLiter = 1, harga = 0;
        while (jumlahLiter <= 20){
            harga = harga + 6500;
        System.out.println(jumlahLiter+"\t\t\t\t"+harga);
            jumlahLiter++;
        }
        System.out.println("====================================");
        
    }
}
