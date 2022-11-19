package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriIndexOf01 {
    public static void main(String[] args) {

        // kullanicidan bir cumle ve bir harf isteyin harfin cumlede var olup olmadigini yazdirin.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle = input.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf = input.nextLine();

        if (cumle.contains(harf)){
            System.out.println("Cumlenin icinde istediginiz harf bulunmaktadir ");
        }
        if (!cumle.contains(harf)) {
            System.out.println("Cumlenin icinde istediginiz harf bulunmamaktadir");
        }











    }
}
