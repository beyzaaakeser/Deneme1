package preclass_materials_static_keyword_soru_cozumleri;

public class Deneme1 {


    static  int count=0;

    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        Deneme1 obj1 = new Deneme1();
        Deneme1 obj2 = new Deneme1();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1 count = "+ obj1.count);
        System.out.println("Obj2 count = "+ obj2.count);

    }




}
