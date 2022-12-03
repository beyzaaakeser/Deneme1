package static_butce_hesaplama;

public class Butce {

    public static int butce;
    public int harclik;


    public void maas(int maas){

        butce+= maas;
    }

    public void harclikAl(int alinanHarclik){
        butce-=alinanHarclik;
        harclik+=alinanHarclik;
    }

    public void harclikHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;
    }

    public void butcedenHarca(int harcananPara){
        butce-= harcananPara;
    }

} // class parantezi

