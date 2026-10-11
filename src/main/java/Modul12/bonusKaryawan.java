/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;
import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class bonusKaryawan {
    public static void main(String[] args) {
        int gajiPokok,masaKerja;
        double bonusGaji, totalBonus;
        String golongan;
        
        Scanner bonusGajikaryawan = new Scanner(System.in);
        System.out.print("Besarnya gaji pokok = ");
        gajiPokok = bonusGajikaryawan.nextInt();
        
        System.out.print("Golongan I-IV= ");
        golongan = bonusGajikaryawan.next().toUpperCase();
        
        System.out.print("Masa Kerja = ");
        masaKerja = bonusGajikaryawan.nextInt();
        
        switch (golongan){
            case "I" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.5;
                           totalBonus = gajiPokok - bonusGaji;
                           System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.4;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0.3;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       }
                       break;
            case "II" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.4;
                           totalBonus = gajiPokok - bonusGaji;
                           System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.3;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0.2;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       }
                       break;
            case "III" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.3;
                           totalBonus = gajiPokok - bonusGaji;
                           System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.2;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0.1;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       }
                       break;
            case "IV" : if ((masaKerja >= 0) && (masaKerja <= 10)){
                           bonusGaji = gajiPokok * 0.2;
                           totalBonus = gajiPokok - bonusGaji;
                           System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 11) && (masaKerja <= 20)){
                            bonusGaji =  gajiPokok * 0.1;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       } else if ((masaKerja >= 21) && (masaKerja <= 30)){
                            bonusGaji =  gajiPokok * 0;
                            totalBonus = gajiPokok - bonusGaji;
                            System.out.println("Besar bonus gajimu adalah " + totalBonus);
                       }
                       break;
            default : System.out.println("Golongan tidak ada!");
                      break;
        }
    }
}
