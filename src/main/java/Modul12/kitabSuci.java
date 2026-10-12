/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul12;
//class jumlahHari terletak di package Modul12
/**
 *
 * @author Richard Fernando 265314027
 */
public class kitabSuci { //Awal dari class kitabSuci
    enum Agama {HINDU, BUDDHA, YAHUDI, KATOLIK, KRISTEN, ISLAM} 
    //Merupakah sebuah himpunan dari tipe enum Agama
    public static void main(String[] args) {
       Agama KitabSuciDanNabi = Agama.ISLAM;
       //mengdeklarasikan tipe enum dengan variabel KitabSuciDanNabi = Agama.(anggota yang ada pada himpunan Agama)
       switch (KitabSuciDanNabi){
       //Memulai pemeriksaan nilai dari variabel "KitabSuciDanNabi"
            case HINDU: System.out.println("Kitab suci agama Hindu adalah veda");
                         break;
            // Jika tipe enum "KitabSuciDanNabi" adalah Hindu, tampilkan kitab suci agama Hindu, lalu hentikan switch
            case BUDDHA:System.out.println("Kitab suci agama Buddha adalah Tripitaka");
                         System.out.println("Dan Nabi agama Buddha adalah Sidharta Gautama");
                         break; 
            // Jika tipe enum "KitabSuciDanNabi" adalah Buddha, tampilkan kitab suci dan Nabi agama Buddha, lalu hentikan switch
            case YAHUDI: System.out.println("Kitab suci agama Yahudi adalah Taurat");
                          System.out.println("Dan Nabi agama Yahudi adalah Musa");
                         break;
            // Jika tipe enum "KitabSuciDanNabi" adalah Yahudi, tampilkan kitab suci dan Nabi agama Yahudi, lalu hentikan switch
            case KATOLIK: System.out.println("Kitab suci agama Katolik adalah Injil");
                          System.out.println("Dan Nabi agama Katolik adalah Yesus");
                          break;
            // Jika tipe enum "KitabSuciDanNabi" adalah Katolik, tampilkan kitab suci dan Nabi agama Katolik, lalu hentikan switch
            case KRISTEN: System.out.println("Kitab suci agama Kristen adalah Injil");
                          System.out.println("Dan Nabi agama Kristen adalah Yesus");
                          break;
            // Jika tipe enum "KitabSuciDanNabi" adalah Kristen, tampilkan kitab suci dan Nabi agama Kristen, lalu hentikan switch
            case ISLAM: System.out.println("Kitab suci agama Islam adalah Alquran");
                         System.out.println("Dan Nabi agama Islam adalah Muhamad");
                         break;
            // Jika tipe enum "KitabSuciDanNabi" adalah Islam, tampilkan kitab suci dan Nabi agama Islam, lalu hentikan switch  
       }
    }
}//Akhir dari class kitabSuci
