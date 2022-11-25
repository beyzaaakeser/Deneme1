package preclass_materials_iterators_soru_cozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru4cozulemedi {
    public static void main(String[] args) {

        // Bir listteki elemanlari iterator kullanarak sondan basa dogrtu yazdirin


        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("13");
        list.add("56");
        list.add("23");
        list.add("45");
        list.add("14");
        list.add("40");
        System.out.println(list);

        System.out.println();

        ListIterator<String> yeni = list.listIterator();




























    }
}
