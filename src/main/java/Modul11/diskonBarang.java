/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;
/**
 *
 * @author Richard
 */
public class diskonBarang {
    public static void main(String[] args) {
        int jumBar, hargaPerbarang, jumPem;
        double diskon;
        
        Scanner diskonBar = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumBar = diskonBar.nextInt();
        
        hargaPerbarang = 100000;
        jumPem = jumBar * hargaPerbarang;
        
        if (jumPem >=1000000){
            diskon = jumPem * 0.9;
            System.out.println("Karena pembelian di atas "+jumPem);
            System.out.println("Maka anda diberikan diskon sebesa 10% "
                    + "dan total belanja setelah diskon adalah " +diskon);
        } else {
            System.out.println("anda tidak mendapatkan diskon, total belanja anda " + jumPem);
        }
        
    }
}
