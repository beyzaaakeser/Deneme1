package okul_application;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {

    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız. +++
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.+++++
    //  3- Bütün fieldlar için encapsulation uygulayınız.  ++++
    //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
    //     ArrayList cinsinden Öğrencileri olsun.++++
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz. ++++
    //  6- bir okul nesnesi oluşturup ++++, bu okula max öğrenci miktarına ulaşana kadar öğrenci
    //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.

    public static void main(String[] args) {
       ogrenciEkle();
        System.out.println(Okul.ogrenciler);


    }

    private static void ogrenciEkle() {

        Okul okul = new Okul();

        while (Okul.ogrenciler.size()<=Okul.maxOgrenci) {

            Scanner input = new Scanner(System.in);
            System.out.println("Adiniz giriniz");
            String ad = input.nextLine();
            System.out.println("Soyadinizi giriniz");
            String soyAd = input.next();
            System.out.println("Yasinizi giriniz");
            int yas = input.nextInt();
            System.out.println("Ogrenci Numaranizi gireiniz");
            String ogrenciNumarasi = input.next();


            if (!(yas>15) && yas>0) {
                Okul.ogrenciler.add(String.valueOf(new Student(ad,soyAd,ogrenciNumarasi,yas)));
                System.out.println("Okula kaydoldunuz");
            } else {
                System.out.println("Okula kaydolamadiniz yasiniz kayit icin uygun degil....");
            }

            if (Okul.ogrenciler.size()==Okul.maxOgrenci){
                System.out.println("Yasiniz yas sinirindan buyuk veya Okulun ogrenci kapasitesi dolu");
                break;
            }

        }//while

        } // method

    } // class



