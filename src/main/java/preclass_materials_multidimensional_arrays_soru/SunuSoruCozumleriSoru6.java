package preclass_materials_multidimensional_arrays_soru;

import java.util.Arrays;

public class SunuSoruCozumleriSoru6 {
    public static void main(String[] args) {

        int[][] arr = { {2,1,3,4}, {5,6,7,8},{3}, {9},{5,6}};
        System.out.println(arr.length); // 5

        int dgr = 3;
        int dgr2 = 6;
        int uzunluk = 0;
        int idx = 0;

        for(int[] w : arr){
            for(int k : w){
                uzunluk++;
            }
        }
        System.out.println(uzunluk);//12


        int[] brr = new int[uzunluk];

        for(int i = 0 ; i<arr.length; i++ ){
            for(int k = 0; k<arr[i].length; k++){
                if(arr[i][k] !=dgr && arr[i][k] !=dgr2 ){
                    brr[idx]=arr[i][k];
                    idx++;
                }
            }
        }

        System.out.println(Arrays.toString(brr));  //[2, 1, 4, 5, 7, 8, 9, 5, 0, 0, 0, 0]







    }
}
