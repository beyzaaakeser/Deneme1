package okul_yonetim_projesi;

public class Ogrenci {


    String ogrenciAd;
    String ogrenciSoyAd;
    String ogrenciKimlikNo;
    String ogrenciSinif;
    String ogrenciNo;
    int ogrenciYas;

    public Ogrenci(String ogrenciAd, String ogrenciSoyAd, String ogrenciSinif, String ogrenciNo, int ogrenciYas) {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyAd = ogrenciSoyAd;
        this.ogrenciSinif = ogrenciSinif;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciYas = ogrenciYas;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyAd() {
        return ogrenciSoyAd;
    }

    public void setOgrenciSoyAd(String ogrenciSoyAd) {
        this.ogrenciSoyAd = ogrenciSoyAd;
    }

    public String getOgrenciKimlikNo() {
        return ogrenciKimlikNo;
    }

    public void setOgrenciKimlikNo(String ogrenciKimlikNo) {
        this.ogrenciKimlikNo = ogrenciKimlikNo;
    }

    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(String ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas(int ogrenciYas) {
        this.ogrenciYas = ogrenciYas;
    }

    @Override
    public String toString() {
        return "Ogrenci Bilgileri : " +
                "ogrenciAd='" + ogrenciAd + '\'' +
                ", ogrenciSoyAd='" + ogrenciSoyAd + '\'' +
                ", ogrenciSinif='" + ogrenciSinif + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", ogrenciYas=" + ogrenciYas;
    }
}



