package preclass_materials_arrays_soru_cozumleri;

import java.util.Arrays;

public class SunuSoruCozumleriSoru1 {

    public static void main(String[] args) {

   String isim[] = new String[4];

   isim[0]= "Ali";
   isim[1] = "Veli";
   isim[2]= "Ayse";
   isim[3] = "Fatma";

        System.out.println(Arrays.toString(isim));

        isim[0]="Can";
        isim[2]="Gul";
        System.out.println(Arrays.toString(isim));


        byte sayi[] = {1,2,3};
         sayi[0]=2;
         sayi[1]=3;
         sayi[2]=1;
        System.out.println(Arrays.toString(sayi));

        System.out.println(sayi.length);

        int t =0;
        for (int w: sayi){
            t=t+w;
        }
        System.out.println(t);



        int number[]= new int[10];
       number[0]=12;
       number[1]=120;
       number[2]=121;
       number[3]=1289;
       number[4]=12021564;
       number[5]=124856;
       number[6]=121354;
       number[7]=1248;
       number[8]=12534;
       number[9]=128;
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));






























































    }
}
