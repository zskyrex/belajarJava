/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner; 
/*Berfungsi untuk memanggil scanneer
 *agar user bisa menginput jawaban
*/

/**
 *
 * @author Richard Fernando 265314027
 */
public class ganjilGenap { //Awal dari class ganjilGenap
    public static void main(String[] args) {
        int angka;
        //dekalarasi bilangan bulat yang akan dimasuukan ke variabel angka
        
        Scanner ganGen = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan angka : ");
        //untuk meminta user memasukkan angka
        angka = ganGen.nextInt();
        //angka yang dimasukkan kemudian disimpan ke variabel angka
        
        if ((angka >= 0) && (angka % 2 == 0)){ 
            /*Percabangan yang dimana jika angka
             *lebih besar sama dengan 0 AND
             *angka di moduluskan apakah
             *hasil baginya sama dengan 0
             *ini digunakan untuk mencari
             *Bilangan genap dan ganjil
            */
            System.out.println("Bilangan genap"); 
            /*kondisi jika angka yang di masukkan adalah bilangan genap
             *dan perintah ini akan menampilkan bahwa nilai yang diinput
             *adalah bilangan genap
            */
        } else {
            System.out.println("Bilangan ganjil");
        } /*kondisi dijalankan ketika kondisi sebelumnnya tidak memenuhi
           *dan perintah ini akan menampilkan bahwa nilai yang diinput
           *adalah bilangan ganjil
           */
        
    }
}//Akhir dari class ganjilGenap
