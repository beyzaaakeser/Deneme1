package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriStringManipulationsSoru6 {
    public static void main(String[] args) {

        // Preclass Materiallerindeki  06String Manipulations soru 6

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");
        String pwd = input.nextLine();


        // ilk harf buyuk harf olmali
        boolean first = pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z';

        // son harf kucuk harf olmali
        boolean second = pwd.charAt(pwd.length()-1)>='a' && pwd.length()-1 <='z';

        // sifre bosluk icermemeli
        boolean third = !pwd.contains(" ");

        // sifre uzunlugu en az 8 karakter olmali
        boolean fourth = pwd.length()>7;

        if (first && second && third  && fourth){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz, lutfen yeni bir sifre girin");
        }




































    }
}
