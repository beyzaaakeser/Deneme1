package question_bank_loops_soru_cozumleri;

public class LoopsSoruCozumuSoru9 {
    public static void main(String[] args) {

        // String icindeki tum kucuk harfleri * a ceviren kodu yaziniz.
        // String str = "ALi Can?";


        // 1.YOL :
//        String str = "Ali Can?";
//
//        str = str.replaceAll("[^a-z]","");
//
//        String t = "";
//
//        for (int i = 0; i <str.length() ; i++) {
//
//            String r = str.substring(i,i+1);
//            t = t+r+'*';
//
//        }
//        System.out.println(t);

        // 2.YOL :

//        String s = "Ali Can?";
//        s = s.replaceAll("[^a-z]", "");
//        String t = "";
//        Integer i=0;
//        while(i<s.length()){
//            String r = s.substring(i,i+1);
//            t = t + r + "*";
//            i++;
//        }
//        System.out.println(t);

        // 3. YOL :

        String s = "Ali Can?";
        s= s.replaceAll("[^a-z]","");
        String t = "";

        int i =0;

        do {

            String r = s.substring(i,i+1);
            t = t+r+'*';
            i++;

        }while(i<s.length());
        System.out.println(t);
















































    }
}
