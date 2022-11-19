package question_bank_loops_soru_cozumleri;

import java.util.Scanner;

public class LoopsSoruCozumleriSoru5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz ");
        int satir = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz");
        int sutun = input.nextInt();


        // 1.YOL :



        for(int i =1; i < satir+1 ; i++){
            String s = "";
            for (int k = 1; k<sutun+1 ;k++){
                s = s+ "A ";
            }
            System.out.println(s);
        }



        // 2.YOL :










































    }
}
