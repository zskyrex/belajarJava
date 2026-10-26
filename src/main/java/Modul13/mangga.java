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
public class mangga {
    public static void main(String[] args) {
        int i=1, n;
        int berat;
        int kecil = 0 , sedang = 0, besar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak mangga yang diproses : ");
        n = input.nextInt();
        
        while (i <= n){
            System.out.print("Berat mangga "+i+" : ");
            berat = input.nextInt();
            if (berat < 200){
                kecil++;
            }else if (200 <= berat && berat < 600){
                sedang++;
            }else if (berat >= 600){
                besar++;
            }
              i++;
        }
                 
            System.out.println("Kecil   : "+kecil);
            System.out.println("Sedang  : "+sedang);
            System.out.println("Besar   : "+besar);
    }
}
