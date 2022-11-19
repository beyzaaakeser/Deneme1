package day03typecastingwrapperclassdeneme;

import java.util.Scanner;

public class ScannerDeneme01 {
    public static void main(String[] args) {
        // Scanner lar disardaaki datayi benim kodumun icine tasir
        // Scanner kullanicidan data almaya yarar. kullanici ile etkilesim kurmamizi saglar
        // Scanner bir Java Class'idir
        // Scanner Classi kullanabilmek icin import ya da util etmek gerekir. bunu da Scanner yazip enterlayarak ya da imlecle ustunde durduktan sonra import classi secerek yapariz.


        //kullanicidan data almak icin yapilmasi gerekenler\
        // 1.Adim) Scanner Classtan obje olustur. obje olusturmayi adim adim ogrenmistik onceki derslerde. burada ek olarak method parantezi icine System.in yaziyoruz. yani sistemin icine bir sey koy diyorsun
       // 2.Adim) kullaniciya mesaj ver ne yapaccagini soyle
        // 3. Adim) kullanicidan aldigin datayi bir variable icine koy ve yazdir

       //1.Adim
        Scanner input = new Scanner(System.in);
        // 2.Adim)
        System.out.println("Hey kullanici kapi numarani gir");
        // 3. Adim)
        byte number = input.nextByte();
        System.out.println("Hey kullanici senin kapi numaran " + number);





































    }








































}
