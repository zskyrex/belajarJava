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
public class banyakData {
    public static void main(String[] args) {
        int n,  i=1;
        double jumlah = 0,data,rataRata;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak data yang akan diproses = ");
        n = input.nextInt();
        
        while (i <= n) {
            System.out.print("Data ke "+i+ " : ");
            data = input.nextDouble();
            jumlah = jumlah + data;
            i++;
        }
     rataRata = jumlah/n;
     System.out.println("Rata - rata data adalah : "+rataRata);
    }
}
