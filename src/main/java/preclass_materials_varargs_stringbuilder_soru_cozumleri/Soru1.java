package preclass_materials_varargs_stringbuilder_soru_cozumleri;

import java.time.LocalTime;

public class Soru1 {

    // For loop ile 1000 defa islem yapalim. onncesinde ve sonrasinda zxamani kontrol edip stringbuilder ve string classlarin performanslarini karsilastirali.
    // ipucu long TimeSb = System.nanoTime(); kullanalim.


    public static void main(String[] args) {


        long start = LocalTime.now().getNano();
        System.out.println(start);


        System.out.println();
        for (int i = 0; i <1001 ; i++) {

            System.out.print(i+" ");

        }
        long end = LocalTime.now().getNano();
        System.out.println(end);










    }




}
