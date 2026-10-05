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
public class diskonBarang { //Awal dari class diskonBarang
    public static void main(String[] args) {
        int jumBar, hargaPerbarang, jumPem;
        //deklarasi variabel bilangan bulat dari jumBar, hargaPerbarang, jumPem
        double diskon;
        //deklarasi variabel bilangan rill dari diskon
        
        Scanner diskonBar = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        //untuk meminta pengguna memasukkan jumlah barang yang dibeli
        jumBar = diskonBar.nextInt();
        //jumlah yang dimasukkan akan disimpan di variabel jumBar
        
        hargaPerbarang = 100000;
        //inisialisasi nilai untuk variabel hargaPerbarang 
        //harga per barang sama dengan 100000
        jumPem = jumBar * hargaPerbarang;
        //menghitung jumlah pembelian dengan operasi kali 
        //variabel jumBar * hargaPerbarang yang akan disimpan
        //di variabel jumPem
        if (jumPem >=1000000){
            //percabangan jika jumPem lebih besar sama dengan 1000000
            diskon = jumPem * 0.9;
            //operasi perkalian untuk mencari harga setelah di kali dengan diskon
            //misalnya diskon 10% makan kita kalikan jumlah pembelian dengan 90%
            //makan dapatlah total yang harus dibayar setelah diskon
            System.out.println("Karena pembelian di atas "+jumPem); 
            //perintah ini menampilkan harga total pembelian dari pengguna
            System.out.println("Maka anda diberikan diskon sebesa 10% "
                    + "dan total belanja setelah diskon adalah " +diskon);
            //perintah ini menampilkan bahwa pengguna mendapatkan diskon 
            //dan total belanja setelah diskon
        } else {
            //kondisi jika kondisi if tidak memenuhi maka,
            System.out.println("anda tidak mendapatkan diskon, total belanja anda " + jumPem);
            //perintah ini akan menampilkan bahwa pengguna tidak mendapatkan diskon
            //dan menampilkan total belanjanya
        }
    }
} //Akhir dari class diskonBarang
