package preclass_materials_pass_by_value_soru_cozumleri;

import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {

        double price = 200;
        Scanner input = new Scanner(System.in);
        System.out.println("Almak istediginiz urunun adetini giriniz");
        int adet = input.nextInt();

//        System.out.println(onIndirim(price));
//        System.out.println(yirmiIndirim(price));
//        System.out.println(yirmiBesIndirim(price));
//        System.out.println(price);

        if (adet>30){
            System.out.println("Ayni urunden 30'dan fazla alinamaz.");
        } else if (adet>20) {
            System.out.println(adet*yirmiIndirim(price));
        } else if (adet>10) {
            System.out.println(adet * onIndirim(price));
        }else {
            System.out.println(adet*price);
        }


    }


    public static double onIndirim(double price){

         double on = price*0.9;
         return on;
    }

    public static double yirmiIndirim(double price){
        double yirmi = price * 0.8;
        return yirmi;
    }

    public static double yirmiBesIndirim(double price){
        double yirmiBes = price * 0.75;
        return yirmiBes;
    }


















}
