package question_bank_loops_soru_cozumleri;

public class LoopsSoruCozumleriSoru4 {
    public static void main(String[] args) {

        // 1. YOL :
         int sayi = 223878;
         String s = String.valueOf(sayi);
         String d = "";

         for (int i = 0 ; i<s.length()-1;i++){
             String c = s.substring(i,i+1);
             if (s.indexOf(c)==s.lastIndexOf(c)){
                 d =d + c;

             }
         }
        System.out.println(d);


         // 2.YOL :

        int num = 223878;
        String s2 = String.valueOf(num);
        String d2 = "";
        int i2 = 0;

        while(i2<s2.length()){
            String c2 = s.substring(i2,i2+1);
            if(s2.indexOf(c2) == s.lastIndexOf(c2)){
                d2 = d2+c2;

            }
            i2++;
        }

        System.out.println(d2);


        // 3.YOL :

        int number = 223878;
        String s3= String.valueOf(number);
        String d3= "";

        int i3 =0;

        do{

            String c3 = s3.substring(i3,i3+1);
            if(s3.indexOf(c3) == s3.lastIndexOf(c3)){
                d3 = d3 + c3;
            }
            i3++;
        }while(i3<s3.length());
        System.out.println(d3);


















































    }
}
