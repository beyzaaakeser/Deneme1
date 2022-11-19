package java_turkce_date_time_soru_cozumleri;

public class Test {

    // SORU 4



    int x;
    Test(int i) { x = i; }
    Test() { x = 0; }
    public static void main(String[] args) {
        Test t = new Test(5);
        change(t);
        System.out.println(t.x);
    }
    public static void change(Test t){
        t = new Test();
        t.x = 10;
    }
}
