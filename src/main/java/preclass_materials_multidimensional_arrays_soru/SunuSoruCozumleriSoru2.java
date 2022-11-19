package preclass_materials_multidimensional_arrays_soru;

import java.util.Arrays;

public class SunuSoruCozumleriSoru2 {
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5}, {6}};

        int sum = 1;
        int idx = 0;

        for (int i = 0; i< arr.length ; i++){

            for (int k = 0 ;k< arr[i].length; k++){

                idx= arr[i][k];

            }

            sum = sum * idx;
            idx = 0;





        }
        System.out.println(sum);

















































    }
}
