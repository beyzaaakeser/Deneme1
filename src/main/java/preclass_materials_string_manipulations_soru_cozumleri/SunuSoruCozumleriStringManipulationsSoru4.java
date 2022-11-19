package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriStringManipulationsSoru4 {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyisimini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        String isim = input.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = input.nextLine();

        int a = isim.length();
        int b = soyIsim.length();

        if(a>b){
            System.out.println("Isim Soy isimden buyuk");
        }else if (b>a) {
            System.out.println("Soy isim isimden buyuk");
        }else if (a==b){
            System.out.println("Isim ile soy isim birbirine esit.");
        }else {
            System.out.println("Hatali giris yaptiniz");
        }


    }
}
