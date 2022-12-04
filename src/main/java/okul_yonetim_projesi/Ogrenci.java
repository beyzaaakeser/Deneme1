package okul_yonetim_projesi;

public class Ogrenci {


    private String ogrenciAd;
    private String ogrenciSoyAd;
    private String ogrenciKimlikNo;
    private String ogrenciSinif;
    private String ogrenciNo;
    private int ogrenciYas;


    public Ogrenci(String ogrenciAd, String ogrenciSoyAd, String ogrenciSinif, String ogrenciNo, int ogrenciYas){
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyAd = ogrenciSoyAd;
        this.ogrenciSinif = ogrenciSinif;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciYas = ogrenciYas;
    }

    public Ogrenci(String ogrenciNo){
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd() {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyAd() {
        return ogrenciSoyAd;
    }

    public void setOgrenciSoyAd() {
        this.ogrenciSoyAd = ogrenciSoyAd;
    }

    public String getOgrenciKimlikNo() {
        return ogrenciKimlikNo;
    }

    public void setOgrenciKimlikNo() {
        this.ogrenciKimlikNo = ogrenciKimlikNo;
    }

    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif() {
        this.ogrenciSinif = ogrenciSinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo()  {
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas() {
        this.ogrenciYas = ogrenciYas;
    }

    @Override
    public String toString() {
        return
                "ogrenciAd='" + ogrenciAd + '\'' +
                        ", ogrenciSoyAd='" + ogrenciSoyAd + '\'' +
                        ", ogrenciSinif='" + ogrenciSinif + '\'' +
                        ", ogrenciNo='" + ogrenciNo + '\'' +
                        ", ogrenciYas=" + ogrenciYas;
    }
}



