/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Richard Fernando 265314027
 */
public class SegiEmpat1 { //Awal dari class SegiEmpat1
    public static void main(String[] args) {
        int panjang, lebar;
        //ini untuk deklarasi variabel bilangan bulat dari panjang dan lebar
        int luas;
        //ini untuk deklarasi variabel bilangan bulat dari luas
        //dan untuk menyimpan hasil perkalian dari panjang dan lebar
        int keliling;
        //ini untuk deklarasi variabel bilangan bulat dari keliling
        //dan untuk menyimpan hasil penjumlahan dari (panjang x 2) + (lebar x 2)
        
        panjang = 15;
        //ini adalah inisialisasi nilai variabel panjang
        lebar = 10;
        //ini adalah inisialisasi nilai variabel lebar
        luas = panjang * lebar;
        /*ini adalah rumus untuk mencari luas segi empat
         *yang dimana hasil perkaliannya akan disimpan kembali 
         *ke variabel luas
         */
        keliling = (panjang*2) + (lebar*2);
        /*ini adalah rumus untuk mencari keliling segi empat
         *yang dimana hasil perkaliannya akan disimpan kembali 
         *ke variabel luas
         */
        System.out.println("Luas segiempat       = "+luas);
        /*perintah ini untuk menampilkan hasil perkalian dari
         *variabel panjang dan lebar yang sudah disimpan di
         *variabel luas
         */
        System.out.println("Keliling segiempat   = "+keliling);
         /*perintah ini untuk menampilkan hasil penjumlahan dari
         *variabel panjang dan lebar yang sudah disimpan di
         *variabel keliling
         */
    }
} //Akhir dari class SegiEmpat1
