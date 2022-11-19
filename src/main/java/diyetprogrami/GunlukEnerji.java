package diyetprogrami;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class GunlukEnerji {


        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lufen cinsiystinizi giriniz..\nErkek = E\nKadin = K");
        char cinsiyet = input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giririz...");
        int yas = input.nextInt();
        System.out.println("Lutfen kilonuzu giririz...");
        double kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu cm olarak giririz. Ornek = 175 cm");
        double boyCm = input.nextDouble();
        double boyM = boyCm/100;

        GunlukEnerji bMI = new GunlukEnerji();
        double bMISon = bMIHesap(kilo, boyM);

        NumberFormat numberFormat = new DecimalFormat(".##");
        String bMISonu = numberFormat.format(bMISon);
        double bMISonuc = Double.parseDouble(bMISonu);

        if(bMISonuc<18.5){
            System.out.println("BMI : " + bMISonuc + "  Zayifsiniz.");
        }else if(bMISonuc<25){
            System.out.println("BMI : " + bMISonuc + "  Normalsiniz.");
        }else if(bMISonuc<30){
            System.out.println("BMI : " + bMISonuc + "  Kilolusunuz.");
        }else if(bMISonuc<35){
            System.out.println("BMI : " + bMISonuc + "  Obez.");
        }else if(bMISonuc<40){
            System.out.println("BMI : " + bMISonuc + "  Ileri derecede obez.");
        }else if(bMISonuc>=40){
            System.out.println("BMI : " + bMISonuc + "  Morbid obez.");
        }
        System.out.println("--------------------------------------");

        System.out.println("Lutfen hareket seviyenizi girirniz.\n--------------------------------------\n" +
                "1 - Masa basi is cok az/hareketsiz\n2 - Az aktif / haftada bir/iki egzersiz." +
                "\n3 - Orta aktif / haftada uc/bes egzersiz.\n4 - Cok aktif haftada yedi/sekiz egzersiz." +
                "\n5 - Agir is / Cok agir egzersiz. \n--------------------------------------  " );

        int hareket = input.nextInt();

        double hrkDeger = 0;
        switch (hareket){
            case 1:
                hrkDeger = 1.2;
                break;
            case 2:
                hrkDeger = 1.3;
                break;
            case 3:
                hrkDeger = 1.55;
                break;
            case 4:
                hrkDeger = 1.7;
                break;
            case 5:
                hrkDeger = 1.9;
                break;
            default:
                System.out.println("Lutfen gecerli deger giriniz..");
        }

        double bMHiziKadin = bMHiziKadin(kilo,boyCm,yas);
        double bMHiziErkek = bMHiziErkek(kilo,boyCm,yas);

        double erkekEnerji = bMHiziErkek * hrkDeger;    //Gunlk Enerji Miktari
        double bMIbuyukErk = bMHiziErkek * hrkDeger - 625;

        double kadinEnerji = bMHiziKadin * hrkDeger;
        double bMIbuyukKdn = bMHiziKadin * hrkDeger - 625;

        if(cinsiyet=='E'){
            System.out.println("Bazal Metabolizma Hizi = " + bMHiziErkek);

            if(bMISonuc<25){                          // burada kilo vermez ve almaz sbit kalir.
                System.out.println("Gunluk almaniz gereken maximum enerji miktari : " + erkekEnerji);

            } else{
                if((bMIbuyukErk<bMHiziErkek)) {
                    System.out.println("Gunluk almaniz gereken maximum enerji miktari : "
                            + bMHiziErkek + " ile "+ erkekEnerji + " araliginda olmali");
                } else
                    System.out.println("Gunluk almaniz gereken maximum enerji miktari : "
                            + bMIbuyukErk + " ile " + erkekEnerji);
            }

        }else if(cinsiyet=='K'){
            System.out.println("Bazal Metabolizma Hizi = " + kadinEnerji);
            if(bMISonuc<25){                // burada kilo vermez ve almaz sbit kalir.
                System.out.println("Gunluk almaniz gereken maximum enerji miktari : " + kadinEnerji);
            } else{
                if((bMIbuyukKdn<bMHiziKadin)) {
                    System.out.println("Gunluk almaniz gereken maximum enerji miktari : "
                            + bMHiziKadin + " ile "+  kadinEnerji + " araligida olmali");
                }else{
                    System.out.println("Gunluk almaniz gereken maximum enerji miktari : "
                            + bMIbuyukKdn + " ile " + kadinEnerji);
                }
            }
        }else {
            System.out.println("Lutfen gecerli bir karakter giriniz.");
        }
    }

        public static double bMIHesap(double a, double b){
        return a/(b*b);
    }

        public static double bMHiziKadin(double kilo, double boyCm, int yas){
        return ((10*kilo)+(6.25*boyCm)-(5*yas))-161;
    }

        public static double bMHiziErkek(double kilo, double boyCm, int yas){
        return ((10*kilo)+(6.25*boyCm)-(5*yas))+5;
    }

    }

