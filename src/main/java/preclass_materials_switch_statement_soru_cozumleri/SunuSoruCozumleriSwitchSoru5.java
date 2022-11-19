package preclass_materials_switch_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSwitchSoru5 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gunIsmi = input.next().toLowerCase();

        switch (gunIsmi){
            case "pazar" :
                System.out.println("Hafta Sonu");
                break;
            case "pazartesi" :
                System.out.println("Hafta Ici");
                break;
            case "sali" :
                System.out.println("Hafta Ici");
                break;
            case "carsamba" :
                System.out.println("Hafta Ici");
                break;
            case "persembe" :
                System.out.println("Hafta Ici");
                break;
            case "cuma" :
                System.out.println("Hafta Ici");
                break;
            case "cumartesi" :
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecerli gun ismi giriniz");
        }










































    }
}
