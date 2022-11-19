package static_butce_sorusu;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba = new Butce();
        baba.maas(7500);
        System.out.println(Butce.butce); //7500

        Butce anne = new Butce();
        anne.maas(4000);
        System.out.println(Butce.butce);//11500

        Butce velet = new Butce();

        baba.harclikAl(2500);
        baba.harclikHarca(2000);
        anne.harclikAl(1000);
        anne.harclikHarca(500);
        velet.harclikAl(350);
        velet.harclikHarca(250);
        System.out.println(Butce.butce);//7650
        System.out.println(velet.harclik);//100

        baba.butcedenHarca(3500); // kira+aidat
        anne.butcedenHarca(2000); // alisveris

        System.out.println(Butce.butce); //2150

        velet.maas(1200);
        System.out.println(Butce.butce); //3350




    }
}
