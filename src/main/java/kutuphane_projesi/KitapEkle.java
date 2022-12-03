package kutuphane_projesi;

import java.util.HashMap;
import java.util.Scanner;

public class KitapEkle {

    static Scanner input = new Scanner(System.in);
    static HashMap<Integer,Kitap> kitapMap = new HashMap<>();

    public static void kitapEkle(){

            System.out.println("Lutfen eklemek istediginiz kitabin adini giriniz");
            String kitapIsmi = input.nextLine();
            System.out.println("Lutfen eklemek istediginiz kitabin yazarinin bilgilerini giriniz ");
            String yazar = input.nextLine();
            System.out.println("Lutfen kitap fiyatini giriniz");

            int fiyat = input.nextInt();

            Kitap kitap = new Kitap(kitapIsmi,yazar,fiyat);
            kitapMap.put(Kitap.kitapNo,kitap);
            System.out.println("Baska bir kitap eklemek icin 1'i\nCikmak icin 0'i giriniz");
            int sec=input.nextInt();
            input.nextLine();
            if (sec==0){
                MethodlarConstructorlar.anaMenu();
            }else {
                kitapEkle();
            }

    }
}
