package preclass_materials_string_manipulations_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriStringManipulationsSoru7 {
    public static void main(String[] args) {


        // Preclass Materiallerindeki  06String Manipulations soru 7


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz.");
        String tamIsim = input.nextLine().toUpperCase();

        System.out.println("Lutfen kredi karti numaranizi 4 karakterde 1 bosluk koyarak giriniz.");
        String kartNo = input.nextLine();

        int ilkBosluk = tamIsim.indexOf(" ");//5
        int kartBosluk = kartNo.lastIndexOf(" ");//14

        String yeniIsim = tamIsim.substring(0,1)+ tamIsim.substring(1,ilkBosluk+1).replaceAll("[^ ]","*")
                + tamIsim.substring(ilkBosluk+1,ilkBosluk+2)+tamIsim.substring(ilkBosluk+2,tamIsim.length()).replaceAll("[a-zA-Z]","*");
        System.out.println("yeni isim = " + yeniIsim);

        String yeniKartNo = kartNo.substring(0,kartBosluk+1).replaceAll("[^ ]","*")+ kartNo.substring(kartBosluk+1);
        System.out.println("yeniKartNo = " + yeniKartNo);







































    }
}
