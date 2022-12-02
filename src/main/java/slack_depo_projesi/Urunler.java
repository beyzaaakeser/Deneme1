package slack_depo_projesi;

import java.util.HashMap;
import java.util.Scanner;

public class Urunler {

    static Scanner input = new Scanner(System.in);
    static HashMap<Integer,Methodlar> urun = new HashMap<>();

    public static void main(String[] args) {

    }

    public static void anaMenu(){
        System.out.println("Lutfen yapmak istediginiz islemi giriniz.\nUrun tanimlamak icin 1'i\nUrunleri listelemek icin 2'yi\nUrun girisi yapmak icin3'u" +
                "\nUrunleri rafa koymak icin4'u\nUrun cikisi yapmak icin 5'i giriniz.");
        int secim = input.nextInt();

        switch (secim){
            case 1:
                Methodlar.urunTanimla();
                break;
            case 2:
                Methodlar.urunListele();
                break;
            case 3:
                Methodlar.urunGirisi();
                break;
            case 4:
                Methodlar.urunuRafaKoy();
                break;
            case 5:
                Methodlar.urunCikisi();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                anaMenu();
        }

    }


}
