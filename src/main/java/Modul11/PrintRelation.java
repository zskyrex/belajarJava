/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author Richard Fernando 265314027
 */
public class PrintRelation { //Awal dari class PrintRelation
    public static void main(String s[]) {
        /*bagian ini ada perbedaan dimana
         *yang biasanya di pakai yaitu String [] args
         *berubah menjadi String s[]
         *keduanya tidak ada merubah apapun dan
         *hanya untuk penamaan saja
        */
        int a = 7 * 3 + 6 / 2- 5;
        /*deklarasi variabel bilangan bulat a
         *yang dimana di dalamnya sedang mencari
         *nilai dari a
         */
        int b = 21 - 8 + a % 3 * 11;
         /*deklarasi variabel bilangan bulat b
         *yang dimana di dalamnya sedang mencari
         *nilai dari b
         */
        
        //struktur percabangan untuk perbandingan
        if (a < b){
            //kondisi jika a lebih kecil dari b
            System.out.println("A is less than B");
            /*perintah ini untuk menampilkan bahwa 
             *a lebih kecil dari b
             */
        }
        if (a == b){
            //kondisi jika a nilainya sama dengan b
            System.out.println("A is equal to B");
            /*perintah ini untuk menampilkan bahwa 
             *a sama dengan b
             */
        }
        if (a > b){
            //kondisi jika a lebih besar dari b
            System.out.println("A is greater than B");
            /*perintah ini untuk menampilkan bahwa 
             *a lebih besar dari b
             */
        }
    }
}// akhir dari class PrintRelation
