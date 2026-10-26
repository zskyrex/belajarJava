/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul13;

/**
 *
 * @author Richard
 */
public class Looping3 {
    public static void main(String[] args) {
        int jumlah = 0 , bilangan = 0;
        while (bilangan <= 100){
            jumlah = jumlah + bilangan;
            bilangan = bilangan + 5;
        }
        System.out.println("Penjumlahan 5+10+...+100 adalah "+jumlah);
    }
}
