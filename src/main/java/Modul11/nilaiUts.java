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
public class nilaiUts {
    public static void main(String[] args) {
        int uts1, uts2, uas;
        double nilai;
        
        Scanner nilaiTotal = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS pertama : ");
        uts1 = nilaiTotal.nextInt();
        System.out.print("Masukkan nilai UTS kedua : ");
        uts2 = nilaiTotal.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        uas = nilaiTotal.nextInt();
        
        nilai = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
        
        System.out.println("");
        if (nilai >= 80){
            System.out.println("Nilai finalmu adalah A" );
        } else if (65 <= nilai && nilai < 80){
            System.out.println("Nilai finalmu adalah B");
        } else if (55 <= nilai && nilai <=65){
            System.out.println("Nilai finalmu adalah C");
        } else if (50 <= nilai && nilai <=55){
            System.out.println("Nilai finalmu adalah D");
        } else {
            System.out.println("Nilai finalmu adalah E");
        }
    }
}
