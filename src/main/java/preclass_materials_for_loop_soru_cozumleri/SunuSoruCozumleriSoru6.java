package preclass_materials_for_loop_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSoru6 {
    public static void main(String[] args) {

        //                          !!!!!!!DIKKAT INTERVIEW SORUSUUU !!!!!



        // kullanicidan 100den kucuk tam sayi isteyin. 1den basalayarak girilen sayiya kadar tum sayilari yazdirin Ancak
        // sayi 3un kati ise SAYI YERINE "Java yazdirin.
        // sayi 5in kati ise sayi yerine "Guzeldir"
        // Sayi hem 3un hem 5in kati  ise yerine "Java Guzeldir.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk sayi giriniz ");
        int sayi = input.nextInt();


        if (sayi>0 && sayi<101) {

            for (int i = 1; i <= sayi; i++) {
                    if(i%3!=0 && i%5!=0) {
                        System.out.print(i+ " ");

                    }else if (i % 3 == 0) {
                            System.out.print("Java, ");
                        } else if (i % 5 == 0) {
                            System.out.print("Guzeldir  ");
                        } else if (i % 3 == 0 && i % 5 == 0) {
                            System.out.print("Java Guzeldir");
                        }
                    }
            }
        System.out.println();
        }





//            String a = "KALEM";
//        System.out.println(a.indexOf('L'));





































    }

