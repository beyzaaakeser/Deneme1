package denemegunu02;

import org.w3c.dom.ls.LSOutput;

public class ObjectCreationDeneme01 {
    //hocanin ders kaydinda Car olan ders. Car objesi olusturmayi anlatiyor. bunu deneyecegim

    //public static void main(String[] args) {
    // MethodCreationDeneme01 obj = new MethodCreationDeneme01()
    //bu baska bir classtan obje olusturma

    public String marka = "Maybelline";
    public int fiyat = 100;

    public static void main(String[] args) {
        ObjectCreationDeneme01 myMaybelline = new ObjectCreationDeneme01();

        System.out.println(myMaybelline.fiyat);
        System.out.println(myMaybelline.marka);
        myMaybelline.kusurlariKapat();
        myMaybelline.parlaklikVer();

        ObjectCreationDeneme01 myAnkara = new ObjectCreationDeneme01();
        System.out.println(myAnkara.nufus);
        System.out.println(myAnkara.il);
        myAnkara.buyukSehirMi();
        myAnkara.evetBuyukSehir();

        ObjectCreationDeneme01 myFamily = new ObjectCreationDeneme01();
        System.out.println(myFamily.aile);
        System.out.println(myFamily.kisiSayisi);
        myFamily.cocukSayisi();
        myFamily.enKucukCocuk();

        ObjectCreationDeneme01 myFaculty = new ObjectCreationDeneme01();
        System.out.println(myFaculty.okul);
        System.out.println(myFaculty.bolum);
        System.out.println(myFaculty.sinifSayisi);
        System.out.println(myFaculty.ogrenciSayisi);
        myFaculty.mezunMu();
        myFaculty.siniftaKaldi();

    }
    MethodCreationDeneme01 obj = new MethodCreationDeneme01();

    public void parlaklikVer(){
        System.out.println("Maybelline parlaklik verir" );
    }
    public void kusurlariKapat(){
        System.out.println("Maybelline kusurlari kapatir");
    }




    public String il = "ankara";
    public int nufus = 1000;
    public void buyukSehirMi(){
        System.out.println("Ankara buyuk sehir mi");
    }
    public void evetBuyukSehir(){
        System.out.println("Evet Ankara buyuk sehirdir ");
    }


    public String aile = "Keser";
    public int kisiSayisi = 5;
    public void cocukSayisi(){
        System.out.println("Uc cocuk");
    }
    public void enKucukCocuk(){
        System.out.println("Beyza");
    }

    public String okul = "Selcuk Universitesi";
    public String bolum = "Hukuk Fakultesi";
    public int sinifSayisi = 1;
    public int ogrenciSayisi = 6560;
    public void mezunMu(){
        System.out.println("2022 Yilinda Mezun Oldu");
    }
    public void siniftaKaldi(){
        System.out.println("Dersi gecemeyen sinifta kaldi");
    }































}







