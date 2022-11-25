package preclass_materials_varargs_stringbuilder_soru_cozumleri;

public class Soru5 {
    public static void main(String[] args) {
        int total=0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total+=letters.substring(1,2).length();
        total+=letters.substring(6,6).length();
        try {
            total+=letters.substring(6,5).length();
        } catch (Exception e) {
            System.out.println("Hatali index siralamasi");
        }
        System.out.println(total);
    }
}
