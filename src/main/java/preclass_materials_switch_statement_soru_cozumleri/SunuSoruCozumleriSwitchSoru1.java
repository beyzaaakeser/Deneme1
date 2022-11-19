package preclass_materials_switch_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSwitchSoru1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Haftanin kacinci gunu oldugunu giriniz");
        byte gunNo = input.nextByte();

        switch (gunNo){

            case 1 :
                System.out.println("Pazar");
                break;
            case 2 :
                System.out.println("Pazartesi");
                break;
            case 3 :
                System.out.println("Sali");
                break;
            case 4 :
                System.out.println("Carsamba");
                break;
            case 5 :
                System.out.println("Persembe");
                break;
            case 6 :
                System.out.println("Cuma");
                break;
            case 7 :
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli bir gun numarasi giriniz");
        }












































    }
}
