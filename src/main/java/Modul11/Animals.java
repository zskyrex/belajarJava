/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;//Menunjukkan File class berada di package modul 11

/*
 *
 * @author Richard Fernando 265314027
 */
public class Animals {//Awal dari class Animals
    public static void main(String[] args) {
        boolean rabbit = true;
        //deklarasi variable rabbit dengan nilai true
        boolean donkey = false; 
        //deklarasi variable donkey dengan nilai false
        boolean leporidae = true;
        //deklarasi variable leporidae dengan nilai true
        
        if (rabbit & donkey | donkey & leporidae | donkey)
        /*Mengecek kondisi jika rabbit AND donkey menghasilkan nilai false OR
         *donkey AND leporidae menghasilkan nilai false OR donkey 
         *yang nilai yang dihasilkan di atas adalah nilai false 
         */
            System.out.println("DOG ");
        //perintah ini untuk menampilkan output dari kondisi pertama
        if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
        /*Mengecek kondisi jika rabbit & donkey menghasilkan nilai false OR
         *donkey & leporidae menghasilkan nilai false OR donkey  OR rabbit menghasilkan
         *maka nilai yang dihasilkan di atas adalah nilai true
         */
            System.out.println("CAT ");
         //perintah ini untuk menampilkan output dari kondisi kedua
    }
}//Akhir dari class Animals
