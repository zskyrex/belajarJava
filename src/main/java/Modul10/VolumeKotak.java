/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Richard Fernando 265314027
 */
public class VolumeKotak { //Awal dari class VlomeKotak
    public static void main(String[] args) {
        int panjang, lebar, tinggi, volume;
        /*ini untuk deklarasi variabel bilangan bulat dari
         *panjang, lebar, tinggi, dan volume
         */
        
        panjang = 10;
        //ini adalah inisialisasi nilai dari variabel panjang
        lebar = 15;
        //ini adalah inisialisasi nilai dari variabel lebar
        tinggi = 5;
        //ini adalah inisialisasi nilai dari variabel tinggi
        volume = panjang * lebar * tinggi;
        /*ini adalah rumus untuk mencari volume kotak
         *yang dimana hasil dari perkalian tersbut akan
         *disimpan kembali di variabel volume
        */
        System.out.println("Volume kotak dengan panjang "+panjang+",lebar "+lebar+",tinggi "+tinggi+" adalah "+volume);
        /*Perintah ini untuk menampilkan volume kotak dengan menyebutkan 
         *variabel panjang, lebar, tinggi , dan hasil dari perkalian rumus tersebut
        */
    }
}
