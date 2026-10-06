/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;
//Berfungsi untuk memanggil scanneer agar user bisa menginput jawaban
/**
 *
 * @author Richard Fernando 265314027
 */
public class tuaMuda {//Awal dari class tuaMuda
    public static void main(String[] args) {
        int umur1, umur2; 
        //Deklarasi variabel bilangan bulat dari umur1 dan umur2
        String nama1, nama2;
        //deklarasi variabel untuk lebih dari 1 karatker unicode dari nama1 dan nama2
    
        Scanner umurNama = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan nama : ");
        //untuk meminta user memasukkan nama
        nama1 = umurNama.next();
        //nama yang dimasukkan kemudian disimpan ke variabel nama1
        
        System.out.print("Masukkan umur : ");
        //untuk meminta user memasukkan umur
        umur1 = umurNama.nextInt();
        //angka yang dimasukkan kemudian disimpan ke variabel umur1
       
        System.out.println("");
        //sebagai pemisah antara yang di atas dan dibawah (whitespace)
        
        System.out.print("Masukkan nama : ");
        //untuk meminta user memasukkan nama
        nama2 = umurNama.next();
        //nama yang dimasukkan kemudian disimpan ke variabel nama2
        
        System.out.print("Masukkan umur : ");
        //untuk meminta user memasukkan umur
        umur2 = umurNama.nextInt();
        //angka yang dimasukkan kemudian disimpan ke variabel umur2
        
        if (umur1 > umur2) { 
            //Percabangan if yang dimana jika angka lebih umur1 lebih besar dari umur2
            System.out.println(nama1+" lebih tua dari "+nama2);
            //perintah ini untuk menampilkan bahwa umur nama1 lebih tua dari nama2
        } else if (umur1 == umur2) {
            //Percabangan else if yang dimana jika angka lebih umur1 sama dengan umur2
            System.out.println(nama1+" seumuran dengan "+nama2);
            //perintah ini untuk menampilkan bahwa umur nama1 seumuran dengan nama2
        } else {
            //Percabangan else yang dimana jika angka lebih umur1 lebih kecil dari umur2
            System.out.println(nama1+" lebih muda dari "+nama2);
            //perintah ini untuk menampilkan bahwa nama1 lebih muda dari nama2
        }
    }
}//Akhir dari class tuaMuda
