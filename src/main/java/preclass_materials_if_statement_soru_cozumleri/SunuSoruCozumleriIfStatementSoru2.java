package preclass_materials_if_statement_soru_cozumleri;

import java.util.Scanner;

public class SunuSoruCozumleriIfStatementSoru2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismilerinin basladigi bir harf giriniz. Gun isimleri p, s, c ile baslar");
        String gun = input.next().toLowerCase();

        if (gun.startsWith("p")){
            System.out.println("Pazar, Pazartesi, Persembe");
        } else if (gun.startsWith("s")) {
            System.out.println("Sali");
        } else if (gun.startsWith("c")) {
            System.out.println("Carsamba, Cuma");
        } else {
            System.out.println("Gecerli gun ismi giriniz");
        }


    }
}
