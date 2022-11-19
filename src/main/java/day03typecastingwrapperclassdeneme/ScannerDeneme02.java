package day03typecastingwrapperclassdeneme;

import java.util.Scanner;

public class ScannerDeneme02 {

    public static void main(String[] args) {

        // Example 1 : kullanicidan 3 sayi alin ve ilk iki sayiyi birnirine bolup 3., ile carpin

        Scanner example1 = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz");
        double s1 = example1.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double s2 = example1.nextDouble();
        System.out.println("Ucuncu sayiyi giriniz");
        double s3 = example1.nextDouble();


        System.out.println("Hey kullanici cevap " + (s1/s2)*s3);























    }





























}
