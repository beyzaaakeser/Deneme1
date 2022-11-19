package preclass_materials_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru7 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi = input.nextInt();

        int sonuc = 0;

        while(sayi >0){

            sonuc = sonuc+ sayi%10;

            sayi = sayi/10;

        }
        System.out.println(sonuc);






























    }
}
