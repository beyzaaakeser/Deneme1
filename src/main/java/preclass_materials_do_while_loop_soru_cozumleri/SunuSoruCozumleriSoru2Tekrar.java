package preclass_materials_do_while_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru2Tekrar {
    public static void main(String[] args) {

        // kullanicidan harf alin ve ondan sonraki tum harfelri yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen harf giriniz");
        char harf = input.next().toLowerCase().charAt(0);


        do{

            System.out.print(harf+ " ");
            harf++;
        }while(harf>='a' && harf<='z');










































    }
}
