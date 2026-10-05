/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;
//Berfungsi untuk memanggil scanneer agar user bisa menginput jawaban
/**
 *
 * @author Richard Fernando 265314027
 */
public class berIde { //Awal dari class berIde
    public static void main(String[] args) {
        int tb,bb,beratIdeal;
        //deklarasi bilangan bulat yang akan di masukkan ke variabel tb,bb,dan beratIdeal
    
        Scanner bBi = new Scanner(System.in);
        //untuk membaca input dari pengguna
        System.out.print("Masukkan tinggi badan : ");
        //untuk meminta pengguna memasukkan tinggi badan
        tb = bBi.nextInt();
        //angka yang dimasukkan kemudian disimpan ke variabel tb
        
        System.out.print("Masukkan berat badan : ");
        //untuk meminta pengguna memasukkan berat badan
        bb = bBi.nextInt();
        //angka yang dimasukkan kemudian disimpan ke variabel bb
        
        beratIdeal = tb - bb;
        //pencarian berat badan ideal dengan mengurangkan tinggi badan(tb) dan berat badan(bb)
        
        System.out.println("");
        //sebagai pemisah antara yang di atas dan dibawah (whitespace(
        
        if (90 <= beratIdeal && beratIdeal <= 110){
            /*percabangan if yang dimana jika 90 lebih kecil sama dengan variabel berat ideal AND
             *variabel berat ideal lebih kecil sama dengan 110 maka,
             */
            System.out.println("Berat badan anda ideal!");
            //perintah ini akan menampilkan bahwa berat badan pengguna ideal
        } else if ( beratIdeal > 90){
            //percabangan else if yang dimana jika variabel berat ideal lebih besar dari 90 maka,
            System.out.println("Terlalu kurus!");
            //perintah ini akan menampilkan bahwa berat badan pengguna terlalu kurus
        } else if (beratIdeal < 110){
            //percabangan else if yang dimana jika variabel berat ideal lebih kecil dari 110 maka,
            System.out.println("Telalu gemuk!");
            //perintah ini adakan menampilkan bahwa berat badan pengguna terlalku gemuk
        }
    }
}//Akhir dari class berIde
