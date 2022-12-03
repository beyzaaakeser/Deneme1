package kimlik_adres_proje;

import java.util.HashMap;
import java.util.Scanner;

public class MethodlarConstructorlar {
    static Scanner input = new Scanner(System.in);
    static HashMap<Integer,Veriler> kullanici = new HashMap<>();

    public static void saveInfo(){
        System.out.println("Lutfen kimlik numaranizi girin 4 haneli");
        Integer kimlik = input.nextInt();

        if(kullanici.containsKey(kimlik)){
            System.out.println("Ayni kimlik numarasi ile islem yapilamaz.");
            saveInfo();
        }else {
            System.out.println("Lutfen tam isiminizi giriniz");
            String tamIsim = input.nextLine();
            input.nextLine();
            System.out.println("Lutfen adresinizi giriniz");
            String adres = input.nextLine();
            System.out.println("Lutfen telefon numaranizi giriniz");
            String telNo = input.nextLine();

            Veriler veri = new Veriler(tamIsim, adres, telNo);
            kullanici.put(kimlik, veri);
        }
            System.out.println("Kayit icin1'e \nAna ekrana donmek icin 2'ye basiniz");
            int sec = input.nextInt();
         switch (sec){
             case 1:
                 saveInfo();
                 break;
             case 2:
                 selectOption();
                 break;
             default:
                 System.out.println("Yanlis secim yaptiniz");
         }

   }

    public static void getInfo(){
        Integer kimlik = input.nextInt();
        if (kullanici.containsKey(kimlik)){
            System.out.println(kimlik+" "+kullanici.values());
        }else {
            System.out.println("Kimlik numarasi bulunamadi");
            getInfo();
        }

    }

    public static void removeInfo(){
        Integer kimlik = input.nextInt();
        if (kullanici.containsKey(kimlik)){
            kullanici.remove(kimlik);
        }else{
            System.out.println("Girilen kimlik bilgisine ait veri bulunamadi");
        }

    }

    public static void selectOption(){
        System.out.println("Sistemden cikis yapmak icin 0'i \nSisteme kayit icin 1'i\nSorgulamak icin 2'yi\nVerileri silmek icin 3'u seciniz.");
        String secim = input.nextLine();
        switch (secim){
            case "0" :
                System.out.println("Cikis yapildi");
                break;
            case "1":
                saveInfo();
                break;
            case "2":
                getInfo();
                break;
            case "3":
                removeInfo();
                break;
        }


    }











}
