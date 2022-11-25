package preclass_materials_exception_soru_cozumleri;

import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas = input.nextInt();

        try {
          if (yas<0|| yas>200){
                throw new IllegalArgumentException();
            }

            if (yas>0 || yas<200){
                System.out.println("Yasiniz "+yas);
            }

        }catch (IllegalArgumentException e){
            System.out.println("Yasiniz uygun aralikta degil.");
        }







    }
}
