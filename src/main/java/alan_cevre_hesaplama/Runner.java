package alan_cevre_hesaplama;

public class Runner {

    public static void main(String[] args) {


      Ucgen ucgen = new Ucgen();
      Sekil kare = new Kare();
      Dikdortgen dikdortgen = new Dikdortgen();
      Sekil cember = new Cember();

        System.out.println(String.format("%.0f",ucgen.ucgenAlan(5, 10, 15)));
        System.out.println(ucgen.ucgenCevre(5, 10, 15));

        System.out.println();

        System.out.println(kare.alan(10));
        System.out.println(kare.cevre(10));

        System.out.println();

        System.out.println(dikdortgen.alan(5, 10));
        System.out.println(dikdortgen.cevre(5, 10));

        System.out.println();

        System.out.println(cember.cevre(10));
        System.out.println(cember.alan(10));


    }








}
