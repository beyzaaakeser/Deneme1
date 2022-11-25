package preclass_materials_varargs_stringbuilder_soru_cozumleri;

public class Soru2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);

    }


}
