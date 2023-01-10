package soru;

public class Soru {

    public static void main(String[] args) {
        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

        String s = "missisippi";
        String d ="";

        for (int i = 0; i <s.length() ;      i++) {
            String c = s.substring(i,i+1);
            if (s.indexOf(c)!=s.lastIndexOf(c)){

                if (!d.contains(c)){
                        d= d+c;
                }
            }
        }

        System.out.println(d);


    }
}
