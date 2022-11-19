package preclass_materials_if_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriNestedIfSoru11 {
    public static void main(String[] args) {

      /* kullanicidan sifre girmesini isteyin.
         eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin. Ilk harf "A" ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.

        eger ilk harf kuxuk ise 'z' olup olmadigini kontrol edin ilk harf 'z' ise   "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
       */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");
        String pwd = input.next();
        char ilkHarf = pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println( "Gecerli Sifre");
            }else System.out.println("Gecersiz Sifre");

        }else if (ilkHarf>= 'a' && ilkHarf<= 'z'){
          if (ilkHarf=='z'){
              System.out.println("Gecerli Sifre");
          }else System.out.println("Gecersiz Sifre");
        }else System.out.println("Sifre harf ile baslamali");

































    }
}
