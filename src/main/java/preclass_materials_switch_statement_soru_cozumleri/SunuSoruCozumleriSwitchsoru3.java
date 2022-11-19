package preclass_materials_switch_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSwitchsoru3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = input.nextInt();

        switch (sayi){
            case 10 :
                System.out.println("Iki basamakli en kucuk sayi");
            break;
            case 100 :
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000 :
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Lutfen gecerli sayi giriniz");

        }







































    }
}
