/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;

/**
 *
 * @author Richard
 */
public class musim {
    enum Musim {SEMI, PANAS, GUGUR, DINGIN}
    public static void main(String[] args) {
        Musim musimEropa = Musim.SEMI;
        switch (musimEropa){
            case DINGIN : System.out.println("December,January,February");
                          break;
            case SEMI :System.out.println("March,April,Nay");
                       break;
            case PANAS : System.out.println("June,July,August");
                         break;
            case GUGUR : System.out.println("September,October,November");
                         break;
        }
        
    }
}