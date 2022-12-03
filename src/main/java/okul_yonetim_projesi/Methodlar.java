package okul_yonetim_projesi;

import java.util.HashMap;
import java.util.Scanner;

public class Methodlar {

    static Scanner input = new Scanner(System.in);



    public static void menu() {
        System.out.println("====================================\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\t====================================");
        System.out.println("ÖĞRENCİ İŞLEMLERİ icin 1'i\nÖĞRETMEN İŞLEMLERİ icin 2'yi\nÇIKIŞ icin Q'yu seciniz.");
        String secim = input.next().toUpperCase();
        switch (secim) {
            case "1":
                islemlerMenuOgrenci();
                break;
            case "2":
                islemlerMenuOgretmen();
                break;
            case "Q":
                System.out.println("Tesekkur ederiz");
                break;
            default:
                System.out.println("Gecersiz secim");
                menu();
        }
    }

    public static void islemlerMenuOgrenci(){
        System.out.println("============= İŞLEMLER =============");
        System.out.println("Ekleme yapmak icin 1'i\nArama yapmak icin 2'yi\nListelemek icin 3'u\nSilmek icin 4'u\nAna Menuye donmek icin 5'i\nCikis yapmak icin Q'yu seciniz.");
        String sec= input.next().toUpperCase();
        switch (sec){
            case "1":
                OgrenciMethod.ogrenciEkle();
                break;
            case "2":
                OgrenciMethod.ogrenciArama();
                break;
            case "3":
                OgrenciMethod.ogrenciListele();
                break;
            case "4":
                OgrenciMethod.ogrenciSil();
                break;
            case "5":
                menu();
                break;
            case "Q":
                System.out.println("Tesekkur ederiz");
                break;
            default:
                System.out.println("Hatali secim yaptiniz");
                islemlerMenuOgrenci();
        }
    }


    public static void islemlerMenuOgretmen(){
        System.out.println("============= İŞLEMLER =============");
        System.out.println("Ekleme yapmak icin 1'i\nArama yapmak icin 2'yi\nListelemek icin 3'u\nSilmek icin 4'u\nAna Menuye donmek icin 5'i\nCikis yapmak icin Q'yu seciniz.");
        String sec= input.next().toUpperCase();
        switch (sec){
            case "1":
                OgretmenMethod.ogretmenEkle();
                break;
            case "2":
                OgretmenMethod.ogretmenArama();
                break;
            case "3":
                OgretmenMethod.ogretmenListele();
                break;
            case "4":
                OgretmenMethod.ogretmenSil();
                break;
            case "5":
                menu();
                break;
            case "Q":
                System.out.println("Tesekkur ederiz");
                break;
            default:
                System.out.println("Hatali secim yaptiniz");
                islemlerMenuOgretmen();
        }
    }



} // class
