package question_bank_loops_soru_cozumleri;

import java.util.Arrays;

public class LoopsSoruCozumleriSoru10 {
    public static void main(String[] args) {

    /*
            Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
            işaretiyle yazdırmak için gereken kodu yazınız.
            Örneğin; 75.4238 ==> *4*2*3*8
     */

//
        // 1. YOL :
//        double sayi = 75.4238;
//
//        String s = String.valueOf(sayi);
//        String yeniS = s.split("\\.")[1];
//        System.out.println(yeniS);
//
//        String t = "";
//
//
//        for (int i = 0; i <yeniS.length() ; i++) {
//
//            String r = yeniS.substring(i,i+1);
//            t=t+('*'+r);
//
//
//        }
//        System.out.println(t);



        // 2.YOL :
//
//        double num = 75.4238;
//        String s = String.valueOf(num);
//        int idxnokta = s.indexOf(".");
//
//        String ondalik = s.substring(idxnokta+1);
//
//        String t ="";
//
//        int i = 0;
//        while(i<ondalik.length()){
//
//            String r= ondalik.substring(i,i+1);
//            t = t+r+'*';
//            i++;
//        }
//        System.out.println(t);
//


        // 3.YOL :

        double num = 75.4238;
        String s = String.valueOf(num);
        int idxnokta = s.indexOf(".");

        String ondalik = s.substring(idxnokta+1);

        String t ="";

        int i = 0;

        do {
            String r= ondalik.substring(i,i+1);
            t = t+r+'*';





            i++;
        }while (i<ondalik.length());
        System.out.println(t);











































    }
}
