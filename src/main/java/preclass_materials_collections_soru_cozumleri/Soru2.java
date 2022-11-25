package preclass_materials_collections_soru_cozumleri;

import java.util.HashSet;
import java.util.Set;

public class Soru2 {
    public static void main(String[] args) {

        int arr[]={2,5,3,4,2,1,5,4,6,3,2,1,5,4};

        Set<Integer> set = new HashSet<>();
        for (Integer w : arr){
            set.add(w);
        }
        System.out.println(set);



    }
}
