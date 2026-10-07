/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;//Menunjukkan File class berada di package modul 11
import java.util.Scanner;
//Berfungsi untuk memanggil scanneer agar user bisa menginput jawaban
/**
 *
 * @author Richard Fernando 265314027
 */
public class nilaiUjian { //Awal dari class nilaiUjian
    public static void main(String[] args) {
        int uts1, uts2, uas;
        //deklarasi variabel bilangan bulat untuk variabel 
        //uts1,uts2,dan uas
        double nilai;
        //deklarasi variabel bilangan rill untuk variabel nilai
        
        Scanner nilaiTotal = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan nilai UTS pertama : ");
        //untuk meminta pengguna memasukkan nilai UTS pertama
        uts1 = nilaiTotal.nextInt();
        //menyimpan jawaban pengguna di variabel uts1
        System.out.print("Masukkan nilai UTS kedua : ");
        //untuk meminta pengguna memasukkan nilai UTS kedua
        uts2 = nilaiTotal.nextInt();
        //menyimpan jawaban pengguna di variabel uts2
        System.out.print("Masukkan nilai UAS : ");
        //untuk meminta pengguna memasukkan nilai UAS
        uas = nilaiTotal.nextInt();
        //Menyimpan jawaban pengguna di variabel uas
        
        nilai = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);
        //rumus untuk mencari total nilai dari ketiga ujian
        //dengan memberi bobot 30% untuk uts 1 dan uts 2, dan 40% untuk uas
        //baru dijumlahkan 
        
        System.out.println("");
        //sebagai pemisah antara yang di atas dan dibawah (whitespace)
        
        if (nilai >= 80){
            //percabangan if yang dimana jika nilai lebih besar sama dengan 80 maka,
            System.out.println("Nilai finalmu adalah A" );
            //perintah ini akan menampilkan Nilai finalnya adalah A
        } else if (65 <= nilai && nilai < 80){
            //percabangan else if yang dimana jika 65 lebih kecil sama dengan nilai AND nilai lebih kecil dari 80 maka,
            System.out.println("Nilai finalmu adalah B");
            //perintah ini akan menampilkan Nilai finalnya adalah B
        } else if (55 <= nilai && nilai <=65){
            //percabangan else if yang dimana jika 55 lebih kecil sama dengan nilai AND nilai lebih kecil sama dengan 65 maka,
            System.out.println("Nilai finalmu adalah C");
            //perintah ini akan menampilkan Nilai finalnya adalah V
        } else if (50 <= nilai && nilai <=55){
            //percabangan else if yang dimana jika 50 lebih kecil sama dengan nilai AND nilai lebih kecil sama dengan 55 maka,
            System.out.println("Nilai finalmu adalah D");
            //perintah ini akan menampilkan Nilai finalnya adalah D
        } else {
            //percabangan else yang dimana jika nilai lebih kecil dari 50 maka,
            System.out.println("Nilai finalmu adalah E");
            //perintah ini akan menampilkan Nilai finalnya adalah E
        }
    }
}//Akhir dari class nilaiUjian
