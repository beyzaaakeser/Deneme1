package preclass_materials_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic harfi giriniz");
        char baslangic = input.next().toLowerCase().charAt(0);
        System.out.println("Lutfen bitis harfi giriniz");
        char bitis = input.next().toLowerCase().charAt(0);

        char ch = baslangic;

        while(ch<=bitis){
            System.out.print(ch+ " ");
            ch++;
        }














































    }
}
