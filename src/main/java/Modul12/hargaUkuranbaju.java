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
public class hargaUkuranbaju { //Awal dari class hargaUkuranbaju
    public static void main(String[] args) {
           String ukuran;
           //deklarasi variabel string untuk karakter unicode yang lebih dari 1
           int jumlahBeli,totalBayar,hargaKaos;
           //deklarasi variabel bilangan bulat dari variabel jumlahBeli, dan totalBayar
           
           Scanner ukuranJumlah = new Scanner (System.in);
           //untuk membaca input dari pengguna
           System.out.print("Masukkan ukuran kaos yang ingin dibeli S-XXL = ");
           //meminta pengguna untuk memasukkan ukuran kaos yang ingin dibeli
           ukuran = ukuranJumlah.next().toUpperCase();
           //ukuran yang dimasukkan akan disimpan di variabel ukuran
           
           System.out.print("Jumlah kaos yang dibeli = ");
           //meminta pengguna untuk memasukkan jumlah kaos yang dibeli
           jumlahBeli = ukuranJumlah.nextInt();
           //jumlah yang dimasukkan akan disimpan di variabel jumlahBeli
           
           switch (ukuran){
           //Memulai pemeriksaan nilai dari variabel "ukuran"
               case "S" :hargaKaos = 30000;
                         System.out.println("Harga per buah "+hargaKaos);
                         break;          
                /* jika nilai "ukuran" adalah "S", set variabel "hargaKaos" sama dengan 30000
                 * dan menampilkan harga per buah dan memanggil variabel hargaKaos
                 * lalu hentikan switch 
                 */
               case "M" : hargaKaos = 38000;
                          System.out.println("Harga per buah "+hargaKaos);
                          break;
                 /* jika nilai "ukuran" adalah "M", set variabel "hargaKaos" sama dengan 38000
                 *  dan menampilkan harga per buah dan memanggil variabel hargaKaos,
                 *  lalu hentikan switch 
                 */
               case "L" : hargaKaos = 45000;
                          System.out.println("Harga per buah "+hargaKaos);
                          break;
                 /* jika nilai "ukuran" adalah "l", set variabel "hargaKaos" sama dengan 45000
                  * dan menampilkan harga per buah dan memanggil variabel hargaKaos,
                  * lalu hentikan switch 
                  */
               case "XL" :hargaKaos = 50000;
                          System.out.println("Harga per buah "+hargaKaos);
                          break;
                 /* jika nilai "ukuran" adalah "XL", set variabel "hargaKaos" sama dengan 50000
                  * dan menampilkan harga per buah dan memanggil variabel hargaKaos,
                  * lalu hentikan switch 
                  */
               case "XXL" :hargaKaos = 60000;
                          System.out.println("Harga per buah "+hargaKaos);
                          break;
                 /* jika nilai "ukuran" adalah "XXL", set variabel "hargaKaos" sama dengan 60000
                  * dan menampilkan harga per buah dan memanggil variabel hargaKaos,
                  * lalu hentikan switch 
                  */
               default : System.out.println("Invalid Ukuran");
                         return;
               // jika tidak ada nilai yang cocok,maka akan menampilkan "Invalid Month" lalu hentikan switch
           } totalBayar = jumlahBeli * hargaKaos;
             //Menghitung total pembayaran dengan mengkalikan varibael jumlahBeli dai hargaKaos
             System.out.println("Total yang harus di bayar Rp "+totalBayar+".00");
             //perintah untuk menampilkan total yang harus di bayar pengguna dengan 
             //memanggil variabel totalBayar 
    }
}//Akhir dari class hargaUkuranbaju
