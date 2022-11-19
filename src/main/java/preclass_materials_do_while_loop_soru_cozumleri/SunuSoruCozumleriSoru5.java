package preclass_materials_do_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");



          do{
              String pwd = input.nextLine();

              boolean boslukHaric = pwd.replaceAll(" ","").length()>7;
              boolean kucukHarf = pwd.replaceAll("[^a-z]","").length()>0;
              boolean buyukHarf = pwd.replaceAll("[^A-Z]","").length()>0;
              boolean sembol = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
              boolean gecerli = boslukHaric && kucukHarf&& buyukHarf&& sembol;

              if(!gecerli){
                  System.out.println("Gecersiz sifre, istenilen kriterde parola olusturun");
              }else {
                  System.out.println("Sifre Basariya Olusturuldu.");
                  break;
              }

          }while(true);























































































    }
}
