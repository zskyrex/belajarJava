/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Richard Fernando 265314027
 */
public class Animals {//Awal dari class Animals
    public static void main(String[] args) {
        boolean rabbit = true;
        //deklarasi variable rabbit dengan nilai true
        boolean donkey = true;
        //deklarasi variable donkey dengan nilai true
        boolean leporidae = true;
        //deklarasi variable leporidae dengan nilai true
        
        if (rabbit & donkey | donkey & leporidae | donkey)
            //kondisi jika ketiga nilai tersebut true maka,
            // bitwise OR ( | ) digunakan untuk mengecek kiri dan kanan
            // kalau Short circuit logical OR (||) 
            //akan mengecek bagian kiri terlebih dahulu
            //jika yang kiri sudah bernilai true maka 
            //bagian kanan tidak akan di cek karena sama sama
            //akan menhasilkan true
            System.out.println("DOG ");
            //perintah ini akan menampilkan output DOG
        if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
            //kondisi jika keempat nilai tersebut bernilai true maka,
            System.out.println("CAT ");
            //perintah ini akan menampilkan CAT
       /*output yang dihasilkan dari kedua kodisi tersebut tetap keluar
        tetapi perbedaannya hanya terletak pada penambahan variabel dari rabbit
        di kondisi kedua, karena pada deklarasi semuanya bernilai true
        maka yang ditampilkan pun kedua kondisi tersebut.
            */
    }
}//Akhir dari class Animals
