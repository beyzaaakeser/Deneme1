package preclass_materials_for_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int satir = 10;

        for (int i = 1; i<= satir ; i++){

            for (int k = satir; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

































































    }
}
