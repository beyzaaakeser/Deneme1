package preclass_materials_pass_by_value_soru_cozumleri;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        double price =100;
        double indirimPrice = indirim(price);
        System.out.println(price);






    }


    public static double indirim(double price){
        double ind=  price * 0.9;
        System.out.println("Indirimli fiyatiniz : "+ind);
        return ind;
    }





}
