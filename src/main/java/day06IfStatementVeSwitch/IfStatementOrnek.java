package day06IfStatementVeSwitch;

import java.util.Scanner;

public class IfStatementOrnek {
    public static void main(String[] args) {

        // kullanicidan yas degeri alin ve hangi okulda oldugunu yazin

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yas giriniz..");

        int yas = input.nextInt();

        if (yas<0) {
            System.out.println("Gecerli yas giriniz" );
        } else if (yas<5) {
            System.out.println("Okula gidemez kucuk yas");
        } else if (yas<6) {
            System.out.println("Krese gidebilir");
        } else if (yas<10) {
            System.out.println("ILK okula gidebilir");
        } else if (yas<13) {
            System.out.println("Orta okula gidebilir");
        } else if (yas<18) {
            System.out.println("Liseye gidebilir");
        } else if (yas<22) {
            System.out.println("Universiteye gidebilir");
        }else{
            System.out.println("Girdiginiz yas araligi arasainda egitim hakki tyanimlanmamistir");
        }


    }


}
