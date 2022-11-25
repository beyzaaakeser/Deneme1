package praclass_materials_inhertiance_soru_cozumleri;

public class Test01 extends  Derived{

    public  Test01 (){
        super("abc");
    }
    public Test01 (String temp){
        System.out.println("Test class "+temp);
    }

    public static void main(String[] args) {
        Test01 obj = new Test01("beyza");

    }

}
