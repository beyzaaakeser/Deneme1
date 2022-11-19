package preclass_materials_switch_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriSwitchSoru4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("S , D , E , T kisaltmasindaki harflerden birini giriniz");
        char harf = input.next().toUpperCase().charAt(0);

        switch (harf){
            case  'S' :
                System.out.println("Software");
                break;
            case 'D' :
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Gecerli bir kisaltma giriniz");
        }




































    }
}
