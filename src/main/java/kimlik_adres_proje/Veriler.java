package kimlik_adres_proje;

public class Veriler {

    private int kimlikNo;
    private String isimSoyIsim;
    private String adres;
    private String telNo;

    public Veriler(String isimSoyIsim, String adres, String telNo) {
        this.isimSoyIsim = isimSoyIsim;
        this.adres = adres;
        this.telNo = telNo;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getIsimSoyIsim() {
        return isimSoyIsim;
    }

    public void setIsimSoyIsim(String isimSoyIsim) {
        this.isimSoyIsim = isimSoyIsim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Veriler{" +
                "kimlikNo=" + kimlikNo +
                ", isimSoyIsim='" + isimSoyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
}
