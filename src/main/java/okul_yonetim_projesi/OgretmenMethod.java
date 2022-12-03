package okul_yonetim_projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgretmenMethod {

    static HashMap<String,Ogretmen> ogretmenMap = new HashMap<>();
    static Scanner input = new Scanner(System.in);


    public static void ogretmenEkle(){
        System.out.println("Lutfen eklemek istediginiz ogretmenin kimlik numarasini giriniz");
        String ogretmenKimlik= input.next();
        System.out.println("Lutfen eklemek istediginiz ogretmenin ismini giriniz");
        String ogretmenIsim = input.next();
        System.out.println("Lutfen eklemek istediginiz ogretmenin soy ismini giriniz");
        String ogretmenSoyIsim = input.next();
        System.out.println("Lutfen eklemek istediginiz ogretmenin bolumunu giriniz");
        String bolum = input.next();
        System.out.println("Lutfen eklemek istediginiz ogretmenin sicil numarasini giriniz");
        String ogretmenNo = input.next();
        System.out.println("Lutfen eklemek istediginiz ogretmenin yasini giriniz");
        int ogretmenYas = input.nextInt();
        Ogretmen ogretmen = new Ogretmen(ogretmenIsim,ogretmenSoyIsim,bolum,ogretmenNo,ogretmenYas);
        ogretmenMap.put(Ogretmen.ogretmenKimlikNo,ogretmen);

        if (!ogretmenMap.containsKey(ogretmenKimlik)){
            ogretmenMap.put(ogretmenKimlik,ogretmen);
        }else {
            System.out.println("Verilen kimlik numarasi ile kayitli ogretmen var.Tekrar denemek icin 1'i\nCikis yapmak icin 0'i seciniz.");
            int secim = input.nextInt();
            switch (secim){
                case 1:
                    ogretmenEkle();
                    break;
                case 0:
                    System.out.println("Tesekkur ederiz");
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz.");
            }
        }

        System.out.println("Ogretmen basariyla eklendi");

        System.out.println("Yeni ogretmen eklemek icin E'yi\nMenuye donmek icin M'yi seciniz");
        String secim2 = input.next();
        if (secim2.equalsIgnoreCase("E")){
            ogretmenEkle();
        } else if (secim2.equalsIgnoreCase("M")) {
            Methodlar.islemlerMenuOgretmen();
        }else{
            System.out.println("Hatali giris yaptiniz.");
            ogretmenEkle();
        }

    }

    public static void ogretmenArama() {
        System.out.println("Lutfen aramak istediginiz ogretmenin kimlik numarasini giriniz");
        String ogretmenAra = input.next();


            if (ogretmenMap.containsKey(ogretmenAra)) {
                System.out.println("Girdiginiz kimlik numarasina ait ogretmenin bilgileri : "  + ogretmenMap.get(ogretmenAra));
            } else {
                System.out.println("Girdiginiz ogretmen kimlik numarasina ait ogretmen bulunmamaktadir veya ogretmen'in kimlik numarasi hatali." +
                        "Tekrar denemek icin 1'i\nCikis yapmak icin 0'i seciniz. ");
                int secim = input.nextInt();
                switch (secim) {
                    case 1:
                        ogretmenArama();
                        break;
                    case 0:
                        System.out.println("Tesekkur ederiz");
                        break;
                    default:
                        System.out.println("Hatali secim yaptiniz.");
                }
            }


        System.out.println("Yeni ogretmen aramak icin A'yi\nMenuye donmek icin M'yi seciniz");
        String secim2 = input.next();
        if (secim2.equalsIgnoreCase("A")) {
            ogretmenArama();
        } else if (secim2.equalsIgnoreCase("M")) {
            Methodlar.islemlerMenuOgretmen();
        } else {
            System.out.println("Hatali giris yaptiniz.");
            ogretmenArama();

        }
    }

    public static void ogretmenListele(){
        for (Map.Entry<String, Ogretmen> w: ogretmenMap.entrySet()){
            System.out.println(w);
        }

        System.out.println("Menuye donmek icin M'yi\nCikis yapmak icin Q'yu seciniz");
        String secim2 = input.next();
        if (secim2.equalsIgnoreCase("M")){
            Methodlar.islemlerMenuOgretmen();
        } else{
            System.out.println("Cikis yapildi.");
        }
    }


    public static void ogretmenSil(){
        System.out.println("Lutfen silmek istediginiz ogretmenin kimlik numarasini giriniz");
        String silKimlik = input.next();

        if(Ogretmen.ogretmenKimlikNo==silKimlik){
            ogretmenMap.remove(silKimlik);
            System.out.println("Ogretmen basariyla silindi.");
        }else {
            System.out.println("Bu kimlik numarasina ait ogretmen bulunmamaktadir, silme islemi basarisiz.");
        }

        System.out.println("Baska bir ogretmeni silmek icin S'yi\nMenuye donmek icin M'yi seciniz");
        String secim2 = input.next();
        if (secim2.equalsIgnoreCase("S")){
            ogretmenSil();
        } else if (secim2.equalsIgnoreCase("M")) {
            Methodlar.islemlerMenuOgrenci();
        }else{
            System.out.println("Hatali giris yaptiniz.");
            ogretmenSil();
        }

    }


}//class
