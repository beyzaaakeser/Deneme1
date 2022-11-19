package preclass_materials_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis = input.nextInt();


        int i = baslangic;

        while(i<bitis+1){

            if (i%2==0){
                System.out.print(i + " ");
            }


            i++;
        }













































    }
}
