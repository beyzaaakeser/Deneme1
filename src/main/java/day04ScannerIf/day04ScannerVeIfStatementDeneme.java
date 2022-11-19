package day04ScannerIf;

import java.util.Scanner;

public class day04ScannerVeIfStatementDeneme {
    public static void main(String[] args) {

//        Scanner muzik = new Scanner(System.in);
//
//        System.out.println("Bir sarki ismi giriniz");
//        String sarki = muzik.nextLine();
//        sarki = "life goes on";
//        if (sarki == "life goes on" ) {
//            System.out.println("Kpop muhtesemdir ");
//
//        }


        // kullanicidan isim soy isim, ugurlu sayi al. isim soy isim ve sayinin ilk rakamiyla ilgili bi nickname olustur.

//        Scanner lakap = new Scanner(System.in);
//        System.out.println("Tam Isiminizi giriniz .");// Ali CAn
//
//        String tamIsim = lakap.nextLine(); //Ali Can
//
//        char ilkHarf= tamIsim.charAt(0);
//        System.out.print(ilkHarf);
//
//        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
//
//        System.out.println(soyIsminIlkHarfi);
//
//        System.out.println("Ugurlu sayi giriniz");
//        byte ugurlusayi = lakap.nextByte();
//
//        System.out.println("nickname'iniz :" + ilkHarf+ soyIsminIlkHarfi + ugurlusayi );


        // sayiniz 112 ile 117 arasindaysa dar aralik yazdir
        // sayiniz 112 ile 222 arasinda ise genis aralik yazdir

//        short s = 125;
//
//        if(s>111 && s<118){
//            System.out.println("Dar aralik");
//        }
//
//        short s2 = 145;
//        if (s>111 || s<222){
//            System.out.println("Genis aralik");
//        }
//
//
//            Scanner family = new Scanner(System.in);
//
//            System.out.println("Annenizin adini giriniz");
//            String anne = family.nextLine(); // Sevim
//            char ilkHarf = anne.charAt(0);
//            System.out.println(ilkHarf);
//            System.out.println("Babanizin adini giriniz");
//            String baba = family.nextLine();
//            char babaIlk = baba.charAt(0);
//            System.out.println(babaIlk);
//
//            System.out.println("Evli ablanizin soy adlarinin giriniz");
//            String abla = family.nextLine();
//            char ablaIlk = abla.split(" ")[1].charAt(0);
//            System.out.println(ablaIlk);
//            System.out.println("Ilk harfleriniz "+ ilkHarf + " " + babaIlk + " " + ablaIlk);
//

        char ch = 'd';

        if (ch>= 'a' && ch <= 'z' ){
            System.out.println(" kucuk harf ");
        }

        char ch1 = 'b';
        if ((ch1>= 'a'&& ch<= 'z') || (ch1>= 'A' && ch1<= 'Z')){
            System.out.println("Buyuk veya kucuk harf ama sayi degil");
        }















    }


























}
