package preclass_materials_overriding_soru_cozumleri;

public class Test03 extends Derived03{

    public void getDetails(){
        System.out.println("Test Class");
        super.getDetails();
    }

    public static void main(String[] args) {
        Derived03 obj = new Test03();
        obj.getDetails();
    }
}
