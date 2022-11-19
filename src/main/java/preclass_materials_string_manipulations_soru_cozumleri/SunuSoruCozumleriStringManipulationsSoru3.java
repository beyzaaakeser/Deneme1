package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriStringManipulationsSoru3 {
    public static void main(String[] args) {

        // Kullanicidan isim isteyin.
        // isim a harfi iceriyorsa "Girdiginiz isim 'a' harfi iceriyor"
        // isim Z harfi iceriyorsa "Girdiginiz isim 'Z' harfi iceriyor"
        // ikisi de yoksa "Girdiginiz isim a veya z harfi icermiyor yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isiminizi giriniz.");
        String isim = input.nextLine();

        // isim a harfi iceriyorsa
       boolean first =isim.contains("a");

        // isim Z iceriyorsa
        boolean second = isim.contains("Z");


        if (first || second){
            if(first){
                System.out.println("Isiminiz a harfi iceriyor");
            }
            if(second) {
                System.out.println("Isiminiz Z harfi iceriyor");
            }

        }else{
            System.out.println("Isiminiz a veya Z harfi icermiyor");
        }


    }
}
