/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner; 
//Berfungsi untuk membaca input dari pengguna

/**
 *
 * @author Richard
 */
public class ganjilGenap {
    public static void main(String[] args) {
        int angka;
        //dekalarasi bilangan bulat yang akan dimasuukan ke variabel angka
        
        Scanner ganGen = new Scanner(System.in);
        //untuk menyimpan input dari pengguna
        System.out.print("Masukkan angka : ");
        //untuk user memasukkan angka
        angka = ganGen.nextInt();
        //angka yang dimasukkan kemudian disimpan ke variabel angka
        
        if ((angka >= 0) && (angka % 2 == 0)){ 
            System.out.println("Bilangan genap"); 
            //kondisi jika angka yang di masukkan adalah bilangan genap
        } else {    
            System.out.println("Bilangan ganjil");
        } //kondisi jika angka yang di masukkan adalah bilangan ganjil
        
    }
}
