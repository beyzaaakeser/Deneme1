package preclass_materials_if_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriIfStatementSoru02 {
    public static void main(String[] args) {

        //kullanicidan karakter isteyin ve girilen karakterin harf olup olmadigini yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = input.next().charAt(0);

        if (karakter>='a' && karakter <='z'){
            System.out.println("kucuk harf = " + karakter);
        } else if (karakter >= 'A' && karakter<= 'Z') {
            System.out.println("buyuk harf = " + karakter);
        }else System.out.println("Girdiginiz karakter harf degil");


    }
}
