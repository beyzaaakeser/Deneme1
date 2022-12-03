package depo_projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methodlar {

    static Scanner input = new Scanner(System.in);
    static HashMap<Integer,Veriler> urunler = new HashMap<>();

    public static void urunTanimla(){

        System.out.println("Tanimlamak istediginiz urunun ID numarasini giriniz");
        int iD = input.nextInt();
        System.out.println("Tanimlamak istediginiz urunun ismini giriniz");
        input.nextLine();
        String urunIsim = input.nextLine();
        System.out.println("Tanimlamak istediginiz urunun ureticisini giriniz");
        String ureten= input.nextLine();
        System.out.println("Tanimlamak istediginiz urunun miktarini giriniz");
        int miktar= input.nextInt();
        System.out.println("Tanimlamak istediginiz urunun birimini giriniz");
        String birimi = input.next();
        System.out.println("Tanimlamak istediginiz urunun raf numarasini giriniz");
        int  rafNo = input.nextInt();
        Veriler obje = new Veriler(urunIsim,ureten,miktar,birimi,rafNo);
        urunler.put(iD,obje);
        System.out.println("Yeni urun eklemek icin 1'e\nCikis yapmak icin 0'a basiniz");
        int secim = input.nextInt();
        if (secim==1){
            urunTanimla();
        } else if (secim==0) {
            Urunler.anaMenu();
        }else {
            System.out.println("Hatali giris yaptiniz");
        }
        input.nextLine();

    }

    public static void urunListele(){
        for (Map.Entry<Integer,Veriler> w: urunler.entrySet()){
            System.out.println(w);
        }
        Urunler.anaMenu();
    }

    public static void urunGirisi(){
        System.out.println("Giris yapmak istediginiz urunun ID numarasini giriniz");
        int iD2 = input.nextInt();
        if (urunler.containsKey(iD2)){
            System.out.println("Guncellemek istediginiz miktari giriniz");
            int yeniMiktar = input.nextInt();
            urunler.get(iD2).setMiktar(urunler.get(iD2).miktar+yeniMiktar);
        }else {
            System.out.println("Girilen bilgiye ait urun bulunmamaktadir");
        }
        Urunler.anaMenu();
    }

    public static void urunuRafaKoy(){
        System.out.println("Lutfen rafa koymak istediginiz urunun ID'sini giriniz.");
        int iD3 = input.nextInt();
        System.out.println("Lutfen yeni raf numarasini giriniz");
        int yeniRaf = input.nextInt();
        urunler.get(iD3).setRaf(yeniRaf);

        Urunler.anaMenu();
    }

    public static void urunCikisi(){
        System.out.println("Cikis yapmak istediginiz urunun ID numarasini giriniz");
        int iD4 = input.nextInt();
        if (urunler.containsKey(iD4) && urunler.get(iD4).miktar>0){
            System.out.println("Urunden kac adet cikis yapmak istediginizi giriniz.");
            int cikSayisi= input.nextInt();
            if (urunler.get(iD4).miktar>=cikSayisi){
                urunler.get(iD4).setMiktar(urunler.get(iD4).miktar-cikSayisi);
            }else {
                System.out.println("Stok sayisindan fazla urun cikisi yapilamaz");
            }
        }
        Urunler.anaMenu();
    }






}
