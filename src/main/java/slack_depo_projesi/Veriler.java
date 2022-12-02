package slack_depo_projesi;

import java.util.HashMap;
import java.util.Scanner;

public class Veriler {

    String urunIsmi;
    String uretici;
    String birim;
    static int ID;
    int miktar;
    int raf;
    static int counter=1000;

    public Veriler(String urunIsmi, String uretici, int miktar, String birim,  int raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        ID = counter;
        this.miktar = miktar;
        this.raf = raf;
        counter++;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }


    @Override
    public String toString() {
        return "Depo'daki Urunkler: " +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", birim='" + birim + '\'' +
                ", miktar=" + miktar +
                ", raf=" + raf;
    }



}
