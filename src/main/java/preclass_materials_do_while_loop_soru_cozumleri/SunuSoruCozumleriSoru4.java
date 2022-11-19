package preclass_materials_do_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru4 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Lutfen toplamak icin sayi giriniz, islemi bitirmek istediginizde 0'a basiniz.");


        int sum = 0;
        int sayac = 0;


        do {
            int sayi = input.nextInt();

            if(sayi<0) {
                System.out.println("Negatif sayi giremezsiniz");
            }else if (sayi > 0) {
                    sum = sum + sayi;
                    sayac++;

                } else if (sayi == 0) {
                    break;
                }



        }while(true);
        System.out.println("Girilen sayi adedi : "+sayac+" ve girilen sayilarin toplami "+sum);


































































    }
}
