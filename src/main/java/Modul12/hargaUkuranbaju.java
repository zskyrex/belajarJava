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
public class hargaUkuranbaju {
    public static void main(String[] args) {
           String ukuran;
           int jumlahBeli,totalBayar;
           
           Scanner ukuranJumlah = new Scanner (System.in);
           System.out.print("Masukkan ukuran kaos yang ingin dibeli S-XXL = ");
           ukuran = ukuranJumlah.next().toUpperCase();
           
           System.out.print("Jumlah kaos yang dibeli = ");
           jumlahBeli = ukuranJumlah.nextInt();
           
           switch (ukuran){
               case "S" : System.out.println("Harga per buah 30000");
                          totalBayar = jumlahBeli * 30000;
                          System.out.println("Total yang harus di bayar "+totalBayar);
                          break;
               case "M" : System.out.println("Harga per buah 38000");
                          totalBayar = jumlahBeli * 38000;
                          System.out.println("Total yang harus di bayar "+totalBayar);
                          break;
               case "L" : System.out.println("Harga per buah 45000");
                          totalBayar = jumlahBeli * 45000;
                          System.out.println("Total yang harus di bayar "+totalBayar);
                          break;
               case "XL" : System.out.println("Harga per buah 50000");
                          totalBayar = jumlahBeli * 50000;
                          System.out.println("Total yang harus di bayar "+totalBayar);
                          break;
               case "XXL" : System.out.println("Harga per buah 60000");
                          totalBayar = jumlahBeli * 60000;
                          System.out.println("Total yang harus di bayar "+totalBayar);
                          break;      
               default : System.out.println("Invalid Ukuran");
                         break;
           }        
    }
}
