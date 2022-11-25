package preclass_materials_exception_soru_cozumleri;

import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {
        String[] str = {"Et", "Sut", "Cikolata", "Yulaf", "Muz", "Patates"};
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen almak istediginiz urunun sirasini giriniz. \nEt : 0 \nSut : 1 \nCikolata : 2 \nYulaf : 3 \nMuz : 4 \nPatates : 5");
        int idx = input.nextInt();

        if (idx > -1 && idx < str.length) {
            System.out.println(str[idx]);
        }

        try {
            System.out.println(str[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("girdiginiz sira urun listesinden buyuk.");
        }

    }

}

