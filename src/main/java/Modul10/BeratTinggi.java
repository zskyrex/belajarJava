/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Richard Fernando 265314027
 */
public class BeratTinggi { //awal dari class BeratTinggi
    public static void main(String[] args) {
        int tinggi_badan; 
        //ini untuk deklarasi variabel  bilangan bulat darit inggi_badan 
        int berat_ideal; 
        //ini untuk deklarasi variabel bilangamn bulat dari berat_ideal
        
        tinggi_badan = 170; 
        //ini adalah inisialisasi nilai variabel tinggi badan 
        berat_ideal = tinggi_badan - 110; 
        /*ini adalah rumus untuk menghitung berat badan ideal dengan tinggi badan dikurangi 110
         *dan hasilnya akan disimpan lagi ke variabel berat_ideal
        */
        
        System.out.println("Berat ideal dari tinggi badan "+tinggi_badan+" adalah "+berat_ideal);
        /*Perintah ini menampilkan output berat ideal dari variabel tinggi_badan adalah
         *dan di akhiri dengan memangil variabel berat_ideal
         */
    }
} //Akhir dari class BeratTinggi
