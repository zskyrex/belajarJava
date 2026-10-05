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
public class tuaMuda {
    public static void main(String[] args) {
        int umur1, umur2;
        String nama1, nama2;
        
        Scanner umurNama = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        nama1 = umurNama.next();
        
        System.out.print("Masukkan nama : ");
        nama2 = umurNama.next();
        
        System.out.println("");
        
        System.out.print("Masukkan umur : ");
        umur1 = umurNama.nextInt();
        
        System.out.print("Masukkan umur : ");
        umur2 = umurNama.nextInt();
        
        if (umur1 >= umur2) {
            System.out.println(nama1+" lebih tua dari "+nama2);
        } else{
            System.out.println(nama1+" lebih muda dari "+nama2);
        }
    }
}
