package preclass_materials_do_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen toplanmasi icin sayilar giriniz islemi bitirmek icin 0'a basiniz ");


        int sum = 0;
        int sayac = 0;


        do{
            int sayi = input.nextInt();
            if (sayi>0) {

                sum = sum+ sayi;
                sayac++;

            }else if(sayi<0){
                System.out.println("Lutfen pozitif sayi girin.");
            }else{
                break;
            }


        }while(true);
        System.out.println("Girilen sayi adedi : " + sayac);
        System.out.print("Girilen sayilarin toplami : " + sum);













































    }
}
