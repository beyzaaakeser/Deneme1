package preclass_materials_iterators_soru_cozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru2 {
    public static void main(String[] args) {

        /*
            Bir Listten istenen sayi araliginda olmayan  elementleri silen bir program  yaziniz.
            or: [2,13,56,23,45,14,40]  ==> 20 ile 40 arasinda olmayanlari sil
         */

        List<Integer> list = new ArrayList<>();
        list.add(2); // silinecek
        list.add(13); // sil
        list.add(56); // sil
        list.add(23);
        list.add(45); // sil
        list.add(14); // sil
        list.add(40);
        System.out.println(list);

        System.out.println();

        ListIterator<Integer> yeni = list.listIterator();

        while (yeni.hasNext()){
            Integer degisken = yeni.next();
            if (!(degisken>=20 && degisken<=40)){
                yeni.remove();
            }

        }
        System.out.println(list);





















    }
}
