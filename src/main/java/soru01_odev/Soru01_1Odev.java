package soru01_odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01_1Odev {
    public static void main(String[] args) {

        /*
             Kullanıcıdan int öğelerini girmesini ve listeye öğe eklemesini istemek için kod yazın
        -    Kullanıcıdan kaldırılacak öğeleri girmesini isteyin, ardından bu öğeyi listeden kaldırın.
        -    Kullanıcıdan güncellemek için öğeyi girmesini isteyin, ardından güncelleyin.

        */

        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        boolean a =true;
        while (a) {
            System.out.println("Oge eklemek icin E'yi\nOge silmek icin S'yi\nOge guncellemek icin G'u\nCikis yapmak icin C'yi giriniz");

            String secim = input.next().toUpperCase();
            switch (secim){
                case "E":
                    System.out.println("Lutfen eklemek istediginiz oge'yi giriniz.");
                    int oge = input.nextInt();
                    list.add(oge);
                    System.out.println("Listeye oge basariyla eklendi");
                    System.out.println("Listenin guncel hali : "+list);
                    break;

                case "S":
                    System.out.println("Lutfen silmek istediginiz ogeyi girinz.");
                    int oge2 = input.nextInt();
                    list.remove((Integer) oge2);
                    System.out.println("Silmek istediginiz oge listeden basariyla silindi");
                    System.out.println("Listenin guncel hali : "+list);
                    break;

                case "G":
                    System.out.println("Lutfen guncellemek istediginiz ogeyi giriniz");
                    int oge3 = input.nextInt();
                    if (list.contains(oge3)){
                        System.out.println("Ogenin guncellenmis halini giriniz");
                        int oge4 = input.nextInt();
                        list.set(list.indexOf(oge3),oge4 );
                        System.out.println("Oge basariyla guncellendi");
                        System.out.println("Listenin guncel hali : "+list);
                    }
                    break;
                case "C":
                    a=false;
                    System.out.println("Cikis yapildi");
                    break;
                default:
                    System.out.println("Hatali veri girdiniz");

            }

        }

    }









}
