package question_bank_loops_soru_cozumleri;

public class LoopsSoruCozumleriSoru3 {
    public static void main(String[] args) {

//        // 1.YOL :

        String s = "ama" +
                "" +
                "" +
                "";
        String r = "";

        for (int i = s.length()-1 ; i>-1 ; i--){
            String c = s.substring(i,i+1);
            r= r+c;
        }
        if (s.equals(r)){
            System.out.println("girilen kelime : " +s +" \npalindromdur");
        }else {
            System.out.println("girilen kelime : " + s+ "\npalindrom degildir.");
        }



        // 2.YOL :

        String kelime = "ana";
        String bos = "";

        int k = kelime.length()-1;

        while(k>-1){
            String c = kelime.substring(k,k+1);
            bos = bos + c;
            k--;
        }
        if (kelime.equals(bos)){
            System.out.println("girilen kelime : " +kelime +" \npalindromdur");
        }else {
            System.out.println("girilen kelime : " + kelime+ "\npalindrom degildir.");
        }


        // 3.YOL :
        String klm = "aya";
        String boss = "";
        int z = klm.length()-1;

        do{
            String c = klm.substring(z,z+1);
            boss = boss+c;
            z--;

        }while(z>-1);

        if (klm.equals(boss)){
            System.out.println("girilen kelime : " +klm +" \npalindromdur");
        }else{
            System.out.println("girilen kelime : " +klm +" \npalindromdur");
        }


































    }
}
