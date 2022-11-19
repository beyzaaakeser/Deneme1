package preclass_materials_multidimensional_arrays_soru;

import java.util.Arrays;

public class SunuSoruCozumleriSoru4 {
    public static void main(String[] args) {

        int arr[][] ={{1,2,3}, {4,5}, {6,7}};

        int[] yeni = new int[arr.length];


        int sum = 0;


        for (int i = 0 ; i<arr.length ; i++){


            for (int k = 0; k<arr[i].length; k++){

                sum = sum + arr[i][k];


            }
            yeni[i] = sum;
            sum = 0;

        }
        System.out.println(Arrays.toString(yeni));






















































    }
}
