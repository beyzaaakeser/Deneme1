package okul_yonetim_projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    public class OgrenciMethod {

        static HashMap<String,Ogrenci> ogrenciMap = new HashMap<>();
        static Scanner input = new Scanner(System.in);


        public static void ogrenciEkle(){
            System.out.println("Lutfen eklemek istediginiz ogrencinin kimlik numarasini giriniz");
            String ogrencikimlik= input.next();
            System.out.println("Lutfen eklemek istediginiz ogrencinin ismini giriniz");
            String ogrenciIsim = input.next();
            System.out.println("Lutfen eklemek istediginiz ogrencinin soy ismini giriniz");
            String ogrenciSoyIsim = input.next();
            System.out.println("Lutfen eklemek istediginiz ogrencinin sinifini giriniz");
            String sinif = input.next();
            System.out.println("Lutfen eklemek istediginiz ogrencinin ogrenci numarasini giriniz");
            String ogrenciNo = input.next();
            System.out.println("Lutfen eklemek istediginiz ogrencinin yasini giriniz");
            int ogrenciYas = input.nextInt();
            Ogrenci ogrenci = new Ogrenci(ogrenciIsim,ogrenciSoyIsim,sinif,ogrenciNo,ogrenciYas);
            //ogrenciMap.put(Ogrenci.ogrenciKimlikNo,ogrenci);

            if (!ogrenciMap.containsKey(ogrencikimlik)){
                ogrenciMap.put(ogrencikimlik,ogrenci);
            }else {
                System.out.println("Verilen kimlik numarasi ile kayitli ogrenci var.Tekrar denemek icin 1'i\nCikis yapmak icin 0'i seciniz.");
                int secim = input.nextInt();
                switch (secim){
                    case 1:
                        ogrenciEkle();
                        break;
                    case 0:
                        System.out.println("Tesekkur ederiz");
                        break;
                    default:
                        System.out.println("Hatali secim yaptiniz.");
                }
            }
            System.out.println("Ogrenci basariyla eklendi");

            System.out.println("Yeni ogrenci eklemek icin E'yi\nMenuye donmek icin M'yi seciniz");
            String secim2 = input.next();
            if (secim2.equalsIgnoreCase("E")){
                ogrenciEkle();
            } else if (secim2.equalsIgnoreCase("M")) {
                Methodlar.islemlerMenuOgrenci();
            }else{
                System.out.println("Hatali giris yaptiniz.");
                ogrenciEkle();
            }


        }

        public static void ogrenciArama() {
            System.out.println("Lutfen aramak istediginiz ogrencinin kimlik numarasini giriniz");
            String ogrenciara = input.next();

                if (ogrenciMap.containsKey(ogrenciara)) {
                    System.out.println("Girdiginiz kimlik numarasina ait ogrencinin bilgileri : " + ogrenciMap.get(ogrenciara));
                } else {
                    System.out.println("Girdiginiz ogrenci kimlik numarasina ait ogrenci bulunmamaktadir veya ogrenci'nin kimlik numarasi hatali." +
                            "Tekrar denemek icin 1'i\nCikis yapmak icin 0'i seciniz. ");
                    int secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            ogrenciArama();
                            break;
                        case 0:
                            System.out.println("Tesekkur ederiz");
                            break;
                        default:
                            System.out.println("Hatali secim yaptiniz.");
                    }
                }

            System.out.println("Yeni ogrenci aramak icin A'yi\nMenuye donmek icin M'yi seciniz");
            String secim2 = input.next();
            if (secim2.equalsIgnoreCase("A")){
                ogrenciArama();
            } else if (secim2.equalsIgnoreCase("M")) {
                Methodlar.islemlerMenuOgrenci();
            }else{
                System.out.println("Hatali giris yaptiniz.");
                ogrenciArama();
            }

        }


        public static void ogrenciListele(){
            for (Map.Entry<String, Ogrenci> w: ogrenciMap.entrySet()){
                System.out.println(w);
            }
            System.out.println("Menuye donmek icin M'yi\nCikis yapmak icin Q'yu seciniz");
            String secim2 = input.next();
            if (secim2.equalsIgnoreCase("M")){
                Methodlar.islemlerMenuOgrenci();
            } else{
                System.out.println("Cikis yapildi.");
            }
        }


//        public static void ogrenciSil(){
//            System.out.println("Lutfen silmek istediginiz ogrencinin kimlik numarasini giriniz");
//            String silKimlik = input.next();
//
//            if(ogrenciMap.get()//equals(silKimlik)){
//                ogrenciMap.remove(ogrenciMap.containsKey(silKimlik));
//                System.out.println("Ogrenci basariyla silindi");
//            }else {
//                System.out.println("Bu kimlik numarasina ait ogrenci bulunmamaktadir, silme islemi basarisiz.");
//            }
//
//            System.out.println("Baska bir ogrenciyi silmek icin S'yi\nMenuye donmek icin M'yi seciniz");
//            String secim2 = input.next();
//            if (secim2.equalsIgnoreCase("S")){
//                ogrenciSil();
//            } else if (secim2.equalsIgnoreCase("M")) {
//                Methodlar.islemlerMenuOgrenci();
//            }else{
//                System.out.println("Hatali giris yaptiniz.");
//                ogrenciSil();
//            }
//
//        }


} // class
