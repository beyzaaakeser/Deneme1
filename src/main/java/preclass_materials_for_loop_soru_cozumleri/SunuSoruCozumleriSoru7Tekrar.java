package preclass_materials_for_loop_soru_cozumleri;

public class SunuSoruCozumleriSoru7Tekrar {
    public static void main(String[] args) {


        String klm = "Bulut";
        String ters = "";


        for (int i = klm.length()-1 ; i>=0 ; i--){

            char c = klm.charAt(i);

            ters = ters+c;

        }
        System.out.print(ters);































    }
}
