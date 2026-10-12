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
public class SwitchDemoInput {//Awal dari class SwitchDemoInput
    public static void main(String[] args) {
        int month;
         //deklarasi variabel bilangan bulat month
        String monthString;
        //deklarasi variabel string untuk karakter unicode yang lebih dari 1
        
        Scanner bulanString = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Msukkan bulan dalam angka : ");
        //untuk meminta penmgguna memasukkan bulan dalam angka
        month = bulanString.nextInt();
        //jawaban yang telah diketik akan disimpan di variabel month
            
        switch (month) {
        // Memulai pemeriksaan nilai dari variabel "month"
            case 1: monthString = "January";
                    break;
            // Jika nilai "month" adalah 1, set variabel "monthString" ke "January" lalu hentikan switch
            case 2: monthString = "February";
                    break;
            // Jika nilai "month" adalah 2, set variabel "monthString" ke "February" lalu hentikan switch
            case 3: monthString = "March";
                    break;
            // Jika nilai "month" adalah 3, set variabel "monthString" ke "March" lalu hentikan switch
            case 4: monthString = "April";
                    break;
            // Jika nilai "month" adalah 4, set variabel "monthString" ke "April" lalu hentikan switch
            case 5: monthString = "May";
                    break;
            // Jika nilai "month" adalah 5, set variabel "monthString" ke "May" lalu hentikan switch
            case 6: monthString = "June";
                    break;
            // Jika nilai "month" adalah 6, set variabel "monthString" ke "June" lalu hentikan switch
            case 7: monthString = "July";
                    break;
            // Jika nilai "month" adalah 7, set variabel "monthString" ke "July" lalu hentikan switch
            case 8: monthString = "August";
                    break;
            // Jika nilai "month" adalah 8, set variabel "monthString" ke "August" lalu hentikan switch
            case 9: monthString = "September";
                    break;
            // Jika nilai "month" adalah 9, set variabel "monthString" ke "September" lalu hentikan switch
            case 10: monthString = "October";
                    break;
            // Jika nilai "month" adalah 10, set variabel "monthString" ke "October" lalu hentikan switch
            case 11: monthString = "November";
                    break;
            // Jika nilai "month" adalah 11, set variabel "monthString" ke "November" lalu hentikan switch
            case 12: monthString = "December";
                    break;
            // Jika nilai "month" adalah 12, set variabel "monthString" ke "December" lalu hentikan switch
            default: monthString = "Invalid month";
                    break;
            // Jika tidak ada nilai yang cocok, set variabel "monthString" ke "Invalid Month" lalu hentikan switch
       }
       System.out.println(monthString);
       //perintah ini untuk menampilkan keluaran dari variabel monthString
    }
}//Akhir dari class SwitchDemoInput
