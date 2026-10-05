/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Richard Fernando 265314027
 */
public class Lingkaran { //Awal dari class Lingkaran
    public static void main(String[] args) {
        int jari_jari; 
        //ini untuk deklarasi variable bilngan bulat dari jari_jari
        double luas, keliling; 
        //ini unbtuk deklarasi variabel bilangan koma atau desimal dari luas dan keliling lingkaran
        
        jari_jari = 21; 
        //ini adalah inisialisasi nilai untuk variabel jari_jari
        luas = Math.PI * (jari_jari * jari_jari); 
        /*ini adalah rumus untuk mencari luas lingkaran, dan menggunakan Math.PI (π)
         *dan hasilnya akan disimpan lagi ke variabel luas
        */
        keliling = 2 * Math.PI * jari_jari;
        /*ini adalah rumus untuk mencari keliling lingkaran, dan menggunakan Math.PI(π)
         * dan kemudian akan disimpan kembali di variabel keliling
        */
        /*Karena PI(π)sudah disediakan oleh java jadi kita tidak perlu lagi
         *menginisialisasi nilai PI(π) secara manual
         */ 
        System.out.println("Luas lingkaran      = "+luas); 
        //Perintah ini untuk menampilkan output Luas lingkaran dan memanggil variabel luas
        System.out.println("Keliling lingkaran  = "+keliling);
        //Perintah ini untuk menampilkan output Keliling lingkaran dan memanggil variabel keliling
    }
} //Akhir dari class lingkaran
