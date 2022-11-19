package java_turkce_varargs_soru_cozumleri;

public class Soru1 {
    public static void main(String[] args) {

        m1(true, false, true);
        m1(false, true);
        m1(true, false, true, true);


    }


    public static int m1(boolean b1, boolean... b2) {
        return b2.length;
    }

}

