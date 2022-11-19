package preclass_materials_for_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru13 {
    public static void main(String[] args) {

     // carpim tablosu olusturma

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen carpim tablosu olusturmak icin bir sayi degeri veriniz");
        byte sayi = input.nextByte();
        byte n = 1;

        while(n<11){

            System.out.println(sayi + "X" + n + "=" + sayi*n);
            n++;
        }







































































































    }
}
