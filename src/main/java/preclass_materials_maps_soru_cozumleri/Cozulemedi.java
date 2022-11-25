package preclass_materials_maps_soru_cozumleri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cozulemedi {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(101,"Ali,Can,Java");
        map1.put(102,"Veli,Yan,Java");
        map1.put(103,"Ali,Yan,C#");

        String istenenDil = "JAVA";
        List<String> isimList = javaBilenler(map1,istenenDil);
        System.out.println(isimList);


    }

    private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
        List <String> isimListesi = new ArrayList<>();
        for (String each : map1.values()){
            String arr[] = each.split(", ");
            if (arr[2].equalsIgnoreCase(istenenDil)){
                isimListesi.add(arr[0]);
            }
        }
        return isimListesi;
    }


}
