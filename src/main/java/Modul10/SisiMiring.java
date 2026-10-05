/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Richard Fernando 265314027
 */
public class SisiMiring { //Awal dari class SisiMiring
    public static void main(String[] args) {
        int alas, tinggi;
        /*ini untuk deklarasi variabel bilangan bulat
         *dari alas dan tinggi
         */
        
        double panjang_sisi_miring;
        /*ini untuk deklarasi variabel bilangan koma/desimal
         *dari panjang_sisi_miring
         */
        alas = 8;
        //ini adalah inisialisasi nilai dari variabel alas
        tinggi = 10;
        //ini adalah inisialisasi nilai dari variabel tinggi
        panjang_sisi_miring = Math.sqrt (Math.pow(alas,2) + Math.pow(tinggi,2));
        /*ini adalah rumus untuk mencari panjang sisi miring segitiga
         *dan hasilnya akan disimpan kembali di variabel panjang_sisi_miring
        */
        /*Math.sqrt atau squareroot(akar) sudah disediakan oleh java
         *sehingga kita bisa mencari akar dari suatu bilangan hanya 
         *dengan memakai Math.sqrt
         *
         *Math.pow atau untuk mempangkat sebuah angka sudah disediakan uoeh java
         *sehingga kita tidak perlu mengulang perkalian seperti alas*alas 
         *dengan menggunakan Math.pow hanya perlu memasukan variabel yang sudah
         *di inisialisasi nilainya dan masukin angka pangkatnya.
        */
        System.out.println("Hasil panjang sisi miring segittia dengan alas "+alas+",tinggi "+tinggi+" adalah "+panjang_sisi_miring);
        /*perintah ini untuk menampilkan hasil dari panjang sisi miring segitiga
         *dan memanggil variabel alas, tinggi, dan hasil dari variabel
         *panjang_sisi_miring
        */
    }
} //Akhir dari class SisiMiring
