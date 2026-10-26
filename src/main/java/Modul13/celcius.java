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
public class celcius {
    public static void main(String[] args) {
        int n = 1;
        double celcius, reamur, fahrenheit;
        Scanner input = new Scanner(System.in);
        while (n <= 10){
            System.out.print("Masukkan suhu celcius ke-"+n+" : ");
            celcius = input.nextDouble();
            reamur = 4.0/5.0 * celcius;
            fahrenheit = 9.0/5.0 * celcius + 32;
            System.out.println("Hasil konversi Reamur         : "+reamur);
            System.out.println("Hasil konversi fahrenheit     : "+fahrenheit);
            System.out.println("");
            n++;
        }
        
    }
}
