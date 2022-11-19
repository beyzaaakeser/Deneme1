package preclass_materials_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int sayi = input.nextInt();

        int sayac = 0;
        int i = 1;

        while(i<sayi+1){

            if (sayi%i==0){
                System.out.print(i +" ");
                sayac++;
            }

            i++;
        }
        System.out.println();
        System.out.println( "Toplamda bolen sayi = " +sayac);


































    }
}
