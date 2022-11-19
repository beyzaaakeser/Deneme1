package preclass_materials_for_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru4 {
    public static void main(String[] args) {

        // kullanicidan 100den kucuk tam sayi aliniz. 1den baslayarak girilen sayiya kadar 3un kati olan sayilari yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("LUtfen 100den kucuk tam sayi giriniz");
        int sayi = input.nextInt();

        if (sayi>0 && sayi<101) {

            for (int i = 1; i <= sayi; i++) {
                    if (i%3==0){
                        System.out.print(i + " ");
                    }

            }
        }else System.out.println("GECERLI SAYI GIRINIZ");
















































    }
}
