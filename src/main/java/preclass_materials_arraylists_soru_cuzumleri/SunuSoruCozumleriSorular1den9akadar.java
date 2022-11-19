package preclass_materials_arraylists_soru_cuzumleri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SunuSoruCozumleriSorular1den9akadar {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<String>();  // 1. Soru

        lst.add("A");
        lst.add("C");
        lst.add("E");
        lst.add("F");

        System.out.println(lst);// [A, C, E, F]

        lst.add("B");
        lst.add(1,"L");
        System.out.println(lst);  //[A, L, C, E, F, B]      2.Soru

        lst.set(3,"D");
        System.out.println(lst); // [A, L, C, D, F, B]      3.Soru


        lst.remove("F");
        System.out.println(lst);// [A, L, C, D, B]          4.Soru

        Collections.sort(lst);
        System.out.println(lst);  // [A, B, C, D, L]        5.Soru


        boolean varMi = lst.contains("L");//                6.Soru
        boolean varMi2 = lst.contains("M");
        System.out.println(varMi); // true
        System.out.println(varMi2); // false


        System.out.println(lst.size()); // 5                7.Soru


        lst.clear();
        System.out.println(lst); // []                      8.Soru


        System.out.println(lst.isEmpty()); // true          9.Soru


































































    }
}
