package day06IfStatementVeSwitch;

import java.util.Scanner;

public class NEstedIfOrnek {

    public static void main(String[] args) {

        // passwordun ilk harfi bir sayi ve son basamagi harf olmalidir
        // ilk basamak == sayi ve son basamagi == buyuk harf ise gecerli
        // ilk basamagi == sayi ve son basamagi kucuk harf ise gecersiz


        String pwd = "123B";

//        if (pwd.charAt(0)>='0' && pwd.charAt(0)<='9'){
//
//            if (pwd.charAt(3)>='A'&& pwd.charAt(3)<= 'Z'){
//                System.out.println("Gecerli password giris saglandi");
//            }else{
//                System.out.println("Gecersiz password giris saglanamadi");
//            }
//        }else{
//            System.out.println("Gecersiz password giris saglanamadi");
//        }

        // bunlarda pwd.charat(O) yapmak uzun suruyor diye charati bir kaba koyuyor yani variable atiyor onu kullaniyor.

        char ilkBasamak = pwd.charAt(0);
        char sonBasamak = pwd.charAt(3);

                if (ilkBasamak>='0' && ilkBasamak<='9'){

            if (sonBasamak>='A'&& sonBasamak<= 'Z'){
                System.out.println("Gecerli password giris saglandi");
            }else{
                System.out.println("Gecersiz password giris saglanamadi");
            }
        }else{
            System.out.println("Gecersiz password giris saglanamadi");
        }


        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());


        int sayı1 = 5;
        int sayı2 = 2;
        double sonuç = sayı1 / sayı2;
        System.out.println(sonuç);
























    }
}
