package java_turkce_array_soru_cozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSoru7 {
    public static void main(String[] args) {

        int arr[] = {12, 23, 12, 2, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 12)); //2


//        String str = "Cok calis, mutevazi ol";
//        String strArray[] = str.split(",");
//        System.out.println(Arrays.toString(strArray));

        String str = "Cok calis, mutevazi ol";
        String strArray[] = str.split(" "); // cift tirnak içinde space var
        System.out.println(Arrays.toString(strArray));

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        System.out.println(arr1==arr2);
        System.out.println(arr1==arr1);
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1.equals(arr2));

        boolean a = arr1.equals(arr2);
        System.out.println(a);


        char xrr[] = new char[4];
        xrr[0] = 'A';
        xrr[2] = 'E';
        xrr[3] = 'M';
        System.out.println(Arrays.toString(xrr));


//        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//
//        System.out.println();


        ArrayList<String> liste = new ArrayList<String>();
        liste.add("A");
        liste.add("B");
        liste.add("C");
        liste.add("D");
        liste.remove(3);
        liste.remove("A");
        System.out.println(liste);




        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(3);
        list2.add(1);
        list2.remove(4);
        System.out.println(list2);

























































    }
}
