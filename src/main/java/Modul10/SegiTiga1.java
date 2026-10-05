/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Richard Fernando 265314027
 */
public class SegiTiga1 { //Awal dari class SegiTiga1
    public static void main(String[] args) {
        int alas, tinggi;
        //ini untuk deklarasi variabel bilangan bulat dari alas dan tinggi
        double luasSeg;
        /*ini untuk deklarasi variabel bilangan koma, atau desimal
         *dari variabel luasSeg
         */
        
        alas = 35;
        //ini adalah inisialisasi nilai variabel alas
        tinggi = 3;
        //ini adalah inisialisasi nilai variabel tinggi
        luasSeg = 0.5 * alas * tinggi;
        /*ini adalah rumus untuk mencari luas segitiga
         *yang dimana hasil dari perkalian tersebut
         *akan disimpan kembali di variabel luasSeg
        */
        System.out.println("Hasil dari luas segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah = "+luasSeg);
        /*Perintah ini untuk menampilkan hasil luas segitiga dengan menampilkan 
         *variabel alas, variabel tinggi dan variabel luasSeg
         */
    }
}
