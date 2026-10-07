/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;//Menunjukkan File class berada di package modul 11

/**
 *
 * @author Richard Fernando 265314027
 */
public class MyClass1 { //Awal dari class MyClass1
    public static void main(String s[]) {
         /*bagian ini ada perbedaan dimana
          *yang biasanya di pakai yaitu String [] args
          *berubah menjadi String s[]
          *keduanya tidak ada merubah apapun dan
          *hanya untuk penamaan saja
          */
        boolean a, b, c; 
        //deklarasi variable bilangan boolean dari a, b dan c
        a = b = c = true;
        //bilangan boolean variable a, b dan c bernilai true
        if (!a || (b && c)){
            //mengecek kondisi apakah Not a atau b && c bernilai true?
            System.out.println("If executed");
            //perintah ini akan dijalakan jika kondisi bernilai true
            //dan menampilkan if executed
        } else {
            //jika kondisi atas tidak memenuhi maka
            System.out.println("else executed");
            //perintah ini akan dijalankan ketika kondisi di atas bernilai false
        }
    }
} //Akhir dari class MyClass1
