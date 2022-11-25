package slack_alan_cevre_sorusu;

public class Cember extends Sekil {

    /* 1-asagidaki hiyararsiye gore class creat ediniz...

     sekil <--Cember ++++
     sekil <--Dikdortgen<--Kare ++++
     sekil <--Üçgen ++++

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz. +++
    3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
    */



    @Override
    public double alan(double r) {
        double alan= (3.14)*r*r;
        return alan;
    }

    @Override
    public double cevre(double r) {
        double cevre = 2*(3.14)*r;
        return cevre;
    }
}
