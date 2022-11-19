package java_turkce_overriding_soru_cozumleri.soru1;

import java_turkce_overriding_soru_cozumleri.soru1.B;

public class C {

    public static void main(String args[]) {
        B obj1 = new B();
        obj1.display();
        System.out.println(obj1.i);


        int arr[] = {9, 8, 7, 6};
        try {
            System.out.print("Good");
            System.out.print(arr[4]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("Better");
        }

        String s2 = null;
        try{
            System.out.println(s2.length());
            System.out.print("Good");
        }catch(NullPointerException e) {
            System.out.print("Better");
        }

        String s = "123";
        System.out.println(s + 1);




    }
}
