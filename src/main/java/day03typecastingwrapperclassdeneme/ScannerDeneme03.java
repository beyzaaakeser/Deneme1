package day03typecastingwrapperclassdeneme;

import java.util.Scanner;

public class ScannerDeneme03 {

    public static void main(String[] args) {

        //kullanicidan bir ucgenin kenar uzunluklarini girmesini isteyin ve ucgenin cevresiyle alanini bulun

        Scanner ucgen = new Scanner(System.in);

        System.out.println("Ucgenin yuksekligini giriniz");
        double yukseklik = ucgen.nextDouble();

        System.out.println("Ucgenin ilk kenarini giriniz");
        double k1 = ucgen.nextDouble();

        System.out.println("Ucgenin ikinci kenarini giriniz");
        double k2 = ucgen.nextDouble();

        System.out.println("Ucgenin ucuncu kenarini giriniz ");
        double k3 = ucgen.nextDouble();

        System.out.println("Ucgenin alani " + (yukseklik*k3)/2);
        System.out.println("UCgenin cevresi " + (k1+k2+k3));




















    }





















}
