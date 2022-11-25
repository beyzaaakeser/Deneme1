package preclass_materials_collections_soru_cozumleri;

import java.util.LinkedList;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        name.add("Ali");
        name.add("Veli");
        name.add("Can");
        name.add("Ayse");
//        System.out.println(name);
//        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = input.next();


        if (name.contains(isim)){
            name.remove(isim);
            System.out.println("Bu isim listte vardi ve silindi");
            System.out.println("Listin guncel hali ==> "+name);
        }else {
            System.out.println("Bu isim listte yok bu yuzden List'e eklendi");
            name.add(isim);
            System.out.println("List'in guncel hali ==> "+name);
        }















    }
}
