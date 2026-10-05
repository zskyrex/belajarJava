/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;
/**
 *
 * @author Richard
 */
public class berIde {
    public static void main(String[] args) {
        int tb,bb,beratIdeal;
        
        Scanner bBi = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan : ");
        tb = bBi.nextInt();
        
        System.out.print("Masukkan berat badan : ");
        bb = bBi.nextInt();
        
        beratIdeal = tb - bb;
        System.out.println("");
        
        if (90 <= beratIdeal && beratIdeal <= 110){
            System.out.println("Berat badan anda ideal!");
        } else if ( beratIdeal < 90){
            System.out.println("Terlalu gemuk!");
        } else if (beratIdeal > 110){
            System.out.println("Telalu kurus!");
        }
    }
}
