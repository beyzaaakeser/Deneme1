package praclass_materials_inhertiance_soru_cozumleri;

public class Sinif extends Okul {

    public Sinif(int age){
        super();
        System.out.println("child class parametreli");
    }

    public Sinif(){
        this(11);
        System.out.println("child class parametresiz");
    }

    public static void main(String[] args) {
        Sinif sinif = new Sinif();
    }


}
