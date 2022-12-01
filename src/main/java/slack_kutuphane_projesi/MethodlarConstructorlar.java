package slack_kutuphane_projesi;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static slack_kutuphane_projesi.KitapEkle.kitapMap;

public class MethodlarConstructorlar {

    static Scanner input = new Scanner(System.in);


    public static void anaMenu(){
            System.out.println("Kitap eklemek icin 1'i\nNumara ile kitap goruntulemek icin 2'yi\nBilgi ile kitap goruntulemek icin 3'u" +
                    "\nNumara ile kitap silmek icin 4'u\nTum kitaplari listelemek icin 5'i\nCikis yapmak icin 6'yi giriniz");

            int secim = input.nextInt();

            switch (secim){
                case 1:
                    KitapEkle.kitapEkle();
                    break;
                case 2:
                    numaraGoruntule();
                    anaMenu();
                    break;
                case 3:
                    bilgiGoruntule();
                    anaMenu();
                    break;
                case 4:
                    noIleSil();
                    anaMenu();
                    break;
                case 5:
                   kitapListele();
                   anaMenu();
                    break;
                case 6:
                    System.out.println("Tesekkurler yine bekleriz");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");

            }// switch
    } // menu methodu




    public static void numaraGoruntule(){
        System.out.println("Goruntulemek istediginiz kitabin numarasini giriniz");
        int numara = input.nextInt();

        if (kitapMap.containsKey(numara)){
            System.out.println(numara+" "+ kitapMap.get(numara));
        }else {
            System.out.println("Bu numaraya ait kitap bulunmamaktadir");
        }
    }

    public static void bilgiGoruntule(){
        input.nextLine();
        System.out.println("Lutfen sorgulamak istediginiz kitabin bilgilerini giriniz.. (Yazar bilgileri veya kitap ismi)");
        String bilgi = input.nextLine();

        for (Map.Entry<Integer,Kitap> w: KitapEkle.kitapMap.entrySet()){
            if (w.getValue().yazarAd.equalsIgnoreCase(bilgi)){
                System.out.println(w);
            } else if (w.getValue().kitapAd.equalsIgnoreCase(bilgi)) {
                System.out.println(w);
            }
        }
    }

    public static void noIleSil(){
        System.out.println("Lutfen silmek istediginiz kitabin numarasini giriniz");
        int no = input.nextInt();

        if (Kitap.kitapNo==no){
            kitapMap.remove(no);
        } else{
            System.out.println("Bu numaraya ait kitap bulunmamaktadir.");
        }
    }

    public static void kitapListele(){
        for (Map.Entry<Integer,Kitap> w:  KitapEkle.kitapMap.entrySet()){
            System.out.println(w);
        }

    }






}
