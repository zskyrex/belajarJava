/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12; 
//class jumlahHari terletak di package Modul12
import java.util.Scanner;
//Berfungsi untuk memanggil scanneer agar user bisa menginput jawaban

/**
 *
 * @author Richard Fernando 265314027
 */
public class jumlahHari {//Awal dari class Switchdemo
    public static void main(String[] args) {
        String bulan;
       //deklarasi variabel string untuk karakter unicode yang lebih dari 1
        
        Scanner masukBulan = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan bulan : ");
        //untuk meminta penmgguna memasukkan bulan yang ingin dicek jumlah harinya
        bulan = masukBulan.next().toLowerCase();
        //jawaban yang telah diketik akan disimpan di variabel jumlahHari
        
        switch (bulan){
        //Memulai pemeriksaan nilai dari variabel "bulan"
            case "january": case "march": case "may": case "july": case "august" :
            case "october" : case "december" :
                           System.out.println("Jumlah hari 31 hari");
                           break;
            /* Jika nilai "bulan" adalah "january","march","may,"july","august",
             * "october",atau "december", maka tampilkan jumlah hari, lalu hentikan switch    
             */
            case "april" : case "june" :  case "september" :  case "november":
                           System.out.println("Jumlah hari 30 hari");
                           break;
            /*Jika nilai "bulan" adalah "april","june","september","november"
             *maka tampilkan jumlah hari, lalu hentikan switch          
             */
            case "february" : System.out.println("Jumlah hari 28 hari");
                              break;     
            // Jika nilai "bulan" adalah "february", maka tampilkan jumlah hari, lalu hentikan switch
            default : System.out.println("Invalid Month");
                      break;
            // Jika tidak ada nilai "bulan" yang cocok, tampilkan "Invalid Month" lalu hentikan switch
        }
    }
}//Akhir dari class Switchdemo
