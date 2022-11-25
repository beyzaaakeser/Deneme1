package preclass_materials_exception_soru_cozumleri;

import java.io.IOException;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Carpma yapmak icin bir String sayi giriniz");
        String sayi = input.next();

        try {
            System.out.println(Integer.valueOf(sayi)*2);
        }catch (Exception e){
            System.out.println("Girdiginiz String sayiya cevrilemez.");
        }


    }

}
