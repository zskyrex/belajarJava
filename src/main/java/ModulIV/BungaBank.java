/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModulIV;
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class BungaBank {
    public static void main(String[] args) {
        
        double deposito, bunga;
        
        Scanner dataBank = new Scanner(System.in);
        System.out.print("Masukkan jumlah deposito anda : ");
        deposito = dataBank.nextDouble();
        
        if(deposito >=50000000){
            bunga = 0.01 * deposito;
        }
        else{
            bunga = 0.0075 * deposito;
        }
        System.out.println("Buanga anda perbulan adalah "+bunga);
    }
}
