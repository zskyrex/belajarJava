/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul13;
import java.util.Scanner;
/**
 *
 * @author Richard
 */
public class Konversi {
    public static void main(String[] args) {
        int minimum,maksimum, selisih;
        double celcius,fahrenheit, reamur;
        
        System.out.println("Tabel konversi celcius ke reamur dan fahrenheit");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu minimum dalam celcius     : ");
        minimum = input.nextInt();
        System.out.print("Masukkan suhu maksimum dalam celcius    : ");
        maksimum = input.nextInt();
        System.out.print("Masukkan selisih Kenaikan dalam celcius : ");
        selisih = input.nextInt();
        
        System.out.println("Celcius        Reamur       fahrenheit");
        celcius = minimum;
        while (celcius <= maksimum){
            fahrenheit = 9.0/5.0 * celcius + 32;
            reamur = 4.0/5.0 * celcius;
            System.out.println(celcius+"\t"+reamur+"\t"+fahrenheit);
            
            celcius = celcius + selisih;
        }
        
    }
}
