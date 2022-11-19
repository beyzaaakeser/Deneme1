package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumuContainsSoru2 {
    public static void main(String[] args) {

    //Kullanicidan bir cumle isteyin. cumkle "buyuk kelimesi iceriyorsa tum cumnleyi buyuk harf olarak yazdirin
    // cumle kucuk kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin.
    // iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor." yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle = input.nextLine().toLowerCase();


        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor");
        }




















































    }

    }
