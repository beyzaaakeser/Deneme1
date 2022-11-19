package preclass_materials_switch_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSwitchSoru2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kacinci ay oldugunu giriniz");
        byte ay = input.nextByte();


        switch (ay){

            case 1 :
                System.out.println("Ocak");
                break;

            case 2 :
                System.out.println("Subat");
                break;

            case 3 :
                System.out.println("Mart");
                break;

            case 4 :
                System.out.println("Nisan");
                break;

            case 5 :
                System.out.println("Mayis");
                break;

            case 6 :
                System.out.println("Haziran");
                break;

            case 7 :
                System.out.println("Temmuz");
                break;

            case 8 :
                System.out.println("Agustos");
                break;

            case 9 :
                System.out.println("Eylul");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasim");
                break;
            case 12 :
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz.");
        }










































    }
}
