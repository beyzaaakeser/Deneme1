package question_bank_loops_soru_cozumleri;

public class LoopsSoruCozumuSoru1 {
    public static void main(String[] args) {

        // 1.YOL : for loop ile cozumu

        String s = "";
        for(int i = 120 ; i>10 ; i--){
            if(i%4==0 && i%6 ==0){
                s= s+ i + " ";
            }
        }
        System.out.println(s);


        // 2.YOL : while loop ile cozumu

        String s2 = "";

        int i2 = 120;

        while (i2>10){
            if(i2%4==00 && i2%6==0){
                s2= s2+ i2 + " ";
            }
            i2--;
        }
        System.out.println(s2);


        // 3. YOL : do while loop
        String s3 = "";
        int i3 = 120;

        do{

            if(i3%4==0 && i3 %6 ==0)
            s3 =s3 +i3 +" ";

            i3--;
        }while(i3>10);
        System.out.println(s3);








































    }
}
