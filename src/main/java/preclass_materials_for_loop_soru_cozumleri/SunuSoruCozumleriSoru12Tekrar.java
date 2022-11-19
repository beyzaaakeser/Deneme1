package preclass_materials_for_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru12Tekrar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz.");
        int satir = input.nextInt();

        for (int i = 1; i<=satir ; i++){ // int i =1 diyoruz cunku 0.satir diye bi sey yok satiri 1den baslatiriz sayma sayisi olarak


            for (int k =1; k<=i; k++){  // k<= i dedik cunku bu k satir sayisina kadar gitmeli diyoruz.
                System.out.print("*");

            }


            System.out.println();


        }







































    }
}
