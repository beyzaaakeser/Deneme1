package preclass_materials_overriding_soru_cozumleri;

public class Test02 extends Derived {
    public void getDetails(){
        System.out.println("Test class");
    }

    public static void main(String[] args) {
        Derived obj = new Test02();
        obj.getDetails();
    }
}
