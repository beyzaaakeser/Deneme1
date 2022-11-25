package preclass_materials_iterators_soru_cozumleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Soru5cozulmedi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        System.out.println(list);

        ListIterator<Integer> iteratorList = list.listIterator();


    }
}
