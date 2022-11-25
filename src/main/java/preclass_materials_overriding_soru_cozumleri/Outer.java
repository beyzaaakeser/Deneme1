package preclass_materials_overriding_soru_cozumleri;

public class Outer {
    public static void main(String[] args) {
        Computer mouse = new Laptop();
        System.out.println(mouse.getValue(100,200));
    }
}
