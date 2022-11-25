package preclass_materials_maps_soru_cozumleri;

import java.util.Arrays;
import java.util.HashMap;

public class Soru1 {
    public static void main(String[] args) {

        System.out.println(harfSayisiniBul("Hellooo"));
    }

    public static HashMap<String,Integer> harfSayisiniBul(String str){
        HashMap<String,Integer> map = new HashMap<>();
        String arr[]= str.split("");
        System.out.println(Arrays.toString(arr));

        for (String w: arr){
            if (!map.containsKey(w)){
                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        return map;
    }


}
