package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumuContainsSoru1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz.");
        String mail = input.next();

        boolean a = !mail.contains("@gmail.com");
        if (a){
            System.out.println("Lutfen gmail adresinizi giriniz.");
        }else {
            System.out.println("Gmail basariyla kaydedildi");
        }

        String mail2 = input.next();
        boolean b = mail2.endsWith("@gmail.com");
        if (b) {
            System.out.println("Mail adresiniz basariyla kaydedildi.");
        }








































    }
    }




