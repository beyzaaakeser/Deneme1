package preclass_materials_do_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru6 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int sum = 0;
        int sayac = 0;

    do {
        System.out.println("Lutfen toplamak icin sayi giriniz.");
        int sayi = input.nextInt();



        if (sayi>0 && sayi<501){
                sum = sum+sayi;
                sayac++;
            }

        if(sum>500){
            break;
        }


    }while(true);
        System.out.println("Girilen sayi adedi : " + sayac + " ve girilen sayilarin toplami " + sum);





































































    }
}
