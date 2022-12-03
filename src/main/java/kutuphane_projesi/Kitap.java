package kutuphane_projesi;
public class Kitap {

    static int kitapNo;
    String kitapAd;
    String yazarAd;
    int kitapFiyat;
    static int counter=1000;


    public Kitap(String kitapAd, String yazarAd, int kitapFiyat) {
        this.kitapAd = kitapAd;
        this.yazarAd = yazarAd;
        this.kitapFiyat = kitapFiyat;
        kitapNo=counter;
        counter++;
    }

    @Override
    public String toString() {
        return " Numarali Kitap : " +
                " kitapAd='" + kitapAd + '\'' +
                ", yazarAd='" + yazarAd + '\'' +
                ", kitapFiyat=" + kitapFiyat
                ;
    }
}
