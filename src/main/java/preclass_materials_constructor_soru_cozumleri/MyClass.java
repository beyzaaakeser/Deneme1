package preclass_materials_constructor_soru_cozumleri;

public class MyClass {

    int num1;
    String name = "Ali";

    MyClass() {
        char letter = 'c';
    }

    MyClass(int num1) {
        this();
        this.num1 = num1;
    }

    void MyClass() {
        num1++;
    }

//    increase(int num1){
//        name++;
//    }

}
