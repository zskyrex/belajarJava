/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;

/**
 *
 * @author Richard
 */
public class nilai {
    public static void main(String[] args) {
         int N = 4;
    
   switch (N){
       case 1 : System.out.println("Bilangan tersebut adalah 1");
                break;
       case 2 :
       case 4 :
       case 8 : System.out.println("Bilangan tersebut adalah 2,4,atau 8");
                System.out.println("yakni bilangan kelipatan 2");
                break;
       case 3 :
       case 6 :
       case 9 : System.out.println("Bilangan tersebut adalah 3,6,atau 9");
                System.out.println("yakni bilangan kelipatan 3");
                break;
       case 5 : System.out.println("Bilangan tersebut adalah 5.");
                break;
    default : System.out.println("Bilangan tersebut adalah 7 atau lebih dari 9.");
              break;
    }
}
}
