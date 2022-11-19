package question_bank_loops_soru_cozumleri;

public class LoopsSoruCozumleriSoru2 {
    public static void main(String[] args) {

        // 1.YOL : for loop ile cozumu

       String s1 = "adanada";
       String d = "";
       for (int i = 0; i<s1.length(); i++ ){
            String c = s1.substring(i,i+1);

            if(s1.indexOf(c)!=s1.lastIndexOf(c)){
                if(!d.contains(c)){
                    d= d+c;
                }
            }

       }

        System.out.println(d);


       // 2.YOL: while loop ile cozumu

        String s2 = "adanadan selams";
        String d2 = "";

        int i2 = 0;

        while(i2<s2.length()){
            String c2 = s2.substring(i2, i2+1);
            if (s2.indexOf(c2)!=s2.lastIndexOf(c2)){
                if (!d2.contains(c2)){
                    d2 = d2 + c2;
                }
            }
            i2++;
        }
        System.out.println(d2);


        // 3.YOL : do while loop ile cozumu

        String ab = "beyza berna mustafa nerede yasiyor";
        String bos ="";
        int z = 0;
        do{
            String ad = ab.substring(z,z+1);
            if (ab.indexOf(ad)!=ab.lastIndexOf(ad)){
                if (!bos.contains(ad)){
                    bos = bos+ad+ " ";
                }
            }

            z++;
        }while(z<ab.length());
        System.out.println(bos);























































    }
}
