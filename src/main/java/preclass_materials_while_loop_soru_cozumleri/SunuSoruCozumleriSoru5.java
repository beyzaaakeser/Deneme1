package preclass_materials_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

        int n = 1;

        while (n<11){

            System.out.println(sayi + "X"+ n + "="+ sayi*n);
            n++;
        }


































    }
}
