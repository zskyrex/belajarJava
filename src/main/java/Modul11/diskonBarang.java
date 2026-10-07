/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11; //Menunjukkan File class berada di package modul 11
import java.util.Scanner;
//Berfungsi untuk memanggil scanneer agar user bisa menginput jawaban
/**
 *
 * @author Richard Fernando 265314027
 */
public class diskonBarang { //Awal dari class diskonBarang
    public static void main(String[] args) {
        int jumBar, hargaPerbarang, toBel;
        //deklarasi variabel bilangan bulat dari jumBar(jumlah Barang), hargaPerbarang,
        //dan tobel (total belanja)
        double hargaSetelahdiskon;
        //deklarasi variabel bilangan rill dari hargaSetelahdiskon
        Scanner jumlahBarang = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        //untuk meminta pembeli memasukkan jumlah barang yang dibeli
        jumBar = jumlahBarang.nextInt();
        //jumlah yang dimasukkan akan disimpan di variabel jumBar
        
        hargaPerbarang = 100000;
        //inisialisasi nilai untuk variabel hargaPerbarang 
        //harga per barang sama dengan 100000
        toBel = jumBar * hargaPerbarang;
        //menghitung jumlah pembelian dengan operasi kali 
        //variabel jumBar dan hargaPerbarang yang akan disimpan
        //di variabel toBel
        if (toBel >=1000000){
            //percabangan jika toBel lebih besar sama dengan 1000000
            hargaSetelahdiskon= toBel * 0.9;
            //operasi perkalian untuk mencari harga setelah diskon
            //misalnya diskon 10% maka 100%-10%=90% dan 90% dikalikan dengan variabel toBel
            //maka dapatlah total yang harus dibayar setelah diskon
            System.out.println("Karena pembelian mencapai "+toBel);
            //perintah ini menampilkan harga total pembelian dari pengguna
            System.out.println("Maka anda diberikan diskon sebesar 10% "
                    + "dan total belanja setelah diskon adalah " +hargaSetelahdiskon);
            //perintah ini menampilkan bahwa pembeli mendapatkan diskon sebesar 10%
            //dan total belanja pembeli setelah diskon dengan menampilkan 
            //variabel hargaSetelahdiskon
        } else {
            //kondisi jika kondisi if tidak memenuhi maka,
            System.out.println("Total belanja anda " + toBel);
            //perintah ini akan menampilkan total belanja saja karena
            //karena total belanja tidak mencapai minimal 1000000
        }
    }
} //Akhir dari class diskonBarang
