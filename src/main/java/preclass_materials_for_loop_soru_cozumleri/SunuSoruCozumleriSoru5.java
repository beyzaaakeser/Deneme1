package preclass_materials_for_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru5 {
    public static void main(String[] args) {


        // kullanicidan 100den kucuk tam sayi isteyin. 1den baslayarak girilen sayiya kadar 3un veya 5in kati olan sayilari yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir sayi giriniz.");
        int sayi = input.nextInt();

        if (sayi>0 &&sayi<101) {

            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
                    for (int i = 1;  i <= sayi; i++){
                        if (i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }

        }else System.out.println("gecerli sayi giriniz");












































    }
}
