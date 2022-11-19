package day03typecastingwrapperclassdeneme;

public class TypeCastingDeneme01 {
    public static void main(String[] args) {

    /*  type casting bir datayi baska bir data typeine cevirme islemidir
        kucuk datayio buyuge cevirme isleminr auto widening (Otomatik genisletme) deriz ve java bunu kendiliginden otomatik olarak yapar cunku risksiz islemdir.
        buyuk datayi kucuk data typeine cevirme islemine explicit narrowing (acikca daraltma) deriz. java bu islemi riskli gorur ve kendiliginden yapmaz.
        senin yapmani ister. kucuk data tipinin ismini parantez icinde acikca yazarak yaparsin bu yuzden ismi acikca daraltmadir.
    */
        byte katSayisi = 14;
        long newKatSayisi = katSayisi; // kucukten buyuge gectik bu yuzden java otomatik olarak yazdi. ekstradan parantezli kod yazmay gerek yok

        double virgulluSayi = 25.90;
        float newVirgulluSyi = (float)virgulluSayi; // parantez icinde hangi kucuk data typeina cevirecegimizi acikca yaziyoruz

        float fiyat = 12.50F; // float degerlerinin sonuna 'f' veya 'F' koyariz ama genelde F konulur. bunu unutma !! DIKKAT !!
        short newFiyat = (short)fiyat;

        int odaSayisi = 5;
        long newOdaSayis = odaSayisi; //  yine kucukten buyuge oldugu icin ekstra bi sey yazmaya gerek yok otomatik yapiyor


        double fiyatt = 1.2;
        short yeniFiyatt= (short)fiyatt;
        System.out.println(yeniFiyatt);


        double uzaklik = 225.96;
        long newUzaklik = (long)uzaklik;







    }



















}
