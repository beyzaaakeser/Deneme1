package preclass_materials_iterators_soru_cozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Beyza");
        list.add("busra");
        list.add("berna");
        list.add("sevim");
        list.add("mustafa");
        list.add("keser");
        System.out.println(list);

        ListIterator<String> itList= list.listIterator();
        while (itList.hasNext()){
            String str= itList.next();
            itList.set("*"+str+"*");
        }
        System.out.println(list);






























    }
}
