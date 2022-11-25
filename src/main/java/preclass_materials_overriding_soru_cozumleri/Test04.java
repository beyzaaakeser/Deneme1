package preclass_materials_overriding_soru_cozumleri;

public class Test04 extends Derived04{

    protected final void getDetails(){
        System.out.println("Test Class");
    }

    public static void main(String[] args) {
        Derived04 obj = new Derived04();
        obj.getDetails();
    }

}
