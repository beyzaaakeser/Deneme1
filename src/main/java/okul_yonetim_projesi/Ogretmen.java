package okul_yonetim_projesi;

public class Ogretmen {

    String ogretmenAd;
    String ogretmenSoyAd;
    static String ogretmenKimlikNo;
    String ogretmenBolum;
    String ogretmenSicilNo;
    int ogretmenYas;


    public Ogretmen(String ogretmenAd, String ogretmenSoyAd,  String ogretmenBolum, String ogretmenSicilNo, int ogretmenYas) {
        this.ogretmenAd = ogretmenAd;
        this.ogretmenSoyAd = ogretmenSoyAd;
        this.ogretmenBolum = ogretmenBolum;
        this.ogretmenSicilNo = ogretmenSicilNo;
        this.ogretmenYas = ogretmenYas;
    }

    public String getOgretmenAd() {
        return ogretmenAd;
    }

    public void setOgretmenAd(String ogretmenAd) {
        this.ogretmenAd = ogretmenAd;
    }

    public String getOgretmenSoyAd() {
        return ogretmenSoyAd;
    }

    public void setOgretmenSoyAd(String ogretmenSoyAd) {
        this.ogretmenSoyAd = ogretmenSoyAd;
    }

    public String getOgretmenKimlikNo() {
        return ogretmenKimlikNo;
    }

    public void setOgretmenKimlikNo(String ogretmenKimlikNo) {
        this.ogretmenKimlikNo = ogretmenKimlikNo;
    }

    public String getOgretmenBolum() {
        return ogretmenBolum;
    }

    public void setOgretmenBolum(String ogretmenBolum) {
        this.ogretmenBolum = ogretmenBolum;
    }

    public String getOgretmenSicilNo() {
        return ogretmenSicilNo;
    }

    public void setOgretmenSicilNo(String ogretmenSicilNo) {
        this.ogretmenSicilNo = ogretmenSicilNo;
    }

    public int getOgretmenYas() {
        return ogretmenYas;
    }

    public void setOgretmenYas(int ogretmenYas) {
        this.ogretmenYas = ogretmenYas;
    }

    @Override
    public String toString() {
        return
                "ogretmenAd='" + ogretmenAd + '\'' +
                ", ogretmenSoyAd='" + ogretmenSoyAd + '\'' +
                ", ogretmenBolum='" + ogretmenBolum + '\'' +
                ", ogretmenSicilNo='" + ogretmenSicilNo + '\'' +
                ", ogretmenYas=" + ogretmenYas;
    }
}
