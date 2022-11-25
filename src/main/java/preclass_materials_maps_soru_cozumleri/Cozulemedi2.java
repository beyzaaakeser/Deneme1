package preclass_materials_maps_soru_cozumleri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cozulemedi2 {
    public static void main(String[] args) {


    getNonRepeatedChars("Hellooo");






    }

    public static List<String> getNonRepeatedChars(String str){
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String arr[] = str.split("");

        for (String w : arr) {
            map.computeIfPresent(w,(key,value)-> value+1);
            map.computeIfAbsent(w,k->1);
        }
        System.out.println(map);

        for (Map.Entry<String,Integer> w: map.entrySet()){
            if (w.getValue()==1){
                list.add(w.getKey());
            }
        }
        return list;
    }


}
