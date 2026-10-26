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
public class bonusKaryawan { //Awal dari class bonusKaryawan
    public static void main(String[] args) {
        int gajiPokok,masaKerja;
        //deklarasi variabel bilangan bulat dari gajiPokok dan masaKerja
        double bonusGaji = 0,totalBonus;
        //deklarasi variabel bilangan rill dari bonusGaji dan totalBonus
        String golongan;
        //deklarasi variabel string untuk karakter unicode yang lebih dari 1
        
        Scanner bonusGajikaryawan = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Gaji pokok = ");
        //meminta pengguna untuk memasukkan gaji pokok
        gajiPokok = bonusGajikaryawan.nextInt();
        //gaji pokok yang telah dimasukkan akan disimpan di variabel gajiPokok
        
        System.out.print("Golongan I-IV = ");
        //meminta pengguna untuk memasukkan golongan dari no 1-4 dalam romawi
        golongan = bonusGajikaryawan.next().toUpperCase();
        //golongan yang sudah dimasukkan akan disimpan di variabel golongan
        //toUppercase digunakan untuk agar teks yang di input tidak 
        //case sesitive. sehingga pengguna dapat menginput huruf kecil maupun besar
        
        System.out.print("Masa Kerja = ");
        //meminta pengguna untuk memasukkan masa kerja
        masaKerja = bonusGajikaryawan.nextInt();
        //masa kerja yang sudah dimasukkan akan disimpan di variabel masaKerja
        
        switch (golongan){
        //Memulai pemeriksaan nilai dari variabel "ukuran"
            case "I" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.5;
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.4;
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0.3;
                       }
                       break;
            /* jika nilai "golongan" adalah "I", maka akan masuk ke kondisi percabangan
             * untuk mencari persenan bonus berdasarkan masa kerja yang diinput
             * oleh pengguna yang disimpan di variabel masaKerja,lalu hentikan switch
             */
            case "II" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.4;
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.3;
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0.2;
                       }
                       break;
            /* jika nilai "golongan" adalah "I", maka akan masuk ke kondisi percabangan
             * untuk mencari persenan bonus berdasarkan masa kerja yang diinput
             * oleh pengguna yang disimpan di variabel masaKerja,lalu hentikan switch
             */
            case "III" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.3;
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.2;
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){                                            
                            bonusGaji =  gajiPokok * 0.1;                                                            
                       }
                       break;
           /* jika nilai "golongan" adalah "I", maka akan masuk ke kondisi percabangan
             * untuk mencari persenan bonus berdasarkan masa kerja yang diinput
             * oleh pengguna yang disimpan di variabel masaKerja,lalu hentikan switch
             */
            case "IV" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.2;
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.1;
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0;
                       }
                       break;
            /* jika nilai "golongan" adalah "I", maka akan masuk ke kondisi percabangan
             * untuk mencari persenan bonus berdasarkan masa kerja yang diinput
             * oleh pengguna yang disimpan di variabel masaKerja,lalu hentikan switch
             */
            default : System.out.println("Golongan tidak ditemukan!");
                      return;
            // jika tidak ada nilai yang cocok,maka akan menampilkan "Golongan tidak ditemukan !" lalu hentikan switch
        }
        totalBonus = gajiPokok - bonusGaji;
        /*setelah mendapatkan persenan dari bonus 
         *langkah selanjutnya adalah mencari total dari bonus gaji
         *dengan mengutangi gaji pokok dengan persenan gaji
        */
        System.out.println("Besar bonus gajimu adalah " + totalBonus);
        //perintah ini untuk menampilkSan besar bonus gaji yang sudah di kurangin dan memanggil variabel totalBonus
    }
}//Akhir dari class bonusKaryawan