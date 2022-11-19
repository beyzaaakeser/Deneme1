package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriIndexOf02 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin.

        girilen kelime cumlede kullanilmamis
        girilen kelime cumlede 1 kere kullanilmis
        girilen kelime cumlede 1den fazla kullanilmis
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = input.nextLine();
        System.out.println("Bir kelime giriniz");
        String kelime= input.next();

        boolean a = cumle.indexOf(kelime)==cumle.lastIndexOf(kelime);


            if (!cumle.contains(kelime)) {
                System.out.println("Girilen kelime cumlede kullanilmamis");
            } else if (a) {
                System.out.println("Girilen kelime cumlede sadece 1 kere kullanilmis.");
            } else if (!a) {
                System.out.println("girilen kelime cumlede birden fazla kez kullanilmistir.");
            }else{
                System.out.println("Gecerli veri giriniz");
            }






































    }
        }

