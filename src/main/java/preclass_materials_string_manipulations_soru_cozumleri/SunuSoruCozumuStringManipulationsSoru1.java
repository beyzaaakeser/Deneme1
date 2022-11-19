package preclass_materials_string_manipulations_soru_cozumleri;

public class SunuSoruCozumuStringManipulationsSoru1 {
    public static void main(String[] args) {

    // String methodlarini kullanarak "Java ogrenmek123 Cok guzel@" Stringini "Java ogrenmek cok guzel." sekline getir.
    //              Java ogrenmek cok guzel.   ==> rakamlari sil - Buyuk Cyi kucuk C yap - @ yerine . koy
    String cumle = "Java ogrenmek123 Cok guzel@";

    String yeniCumle = cumle.replaceAll("[0-9]","");
    String yeniCumle2 = yeniCumle.replaceAll("C","c");
    String soncumle = yeniCumle2.replaceAll("@",".");
        System.out.println(soncumle);





































    }
}
