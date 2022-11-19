package preclass_materials_static_keyword_soru_cozumleri;

public class Counter1 {

    int count;
    static int stCount;

    public Counter1(){
        count++;
        stCount++;
    }

    public int getCount(){
        return count;
    }
    public static int getStCount(){
        return stCount;
    }

    public static void main(String[] args) {
        Counter1 cs1 = new Counter1();
        Counter1 cs2 = new Counter1();
        Counter1 cs3 = new Counter1();
        Counter1 cs4 = new Counter1();
        Counter1 cs5 = new Counter1();
        Counter1 cs6 = new Counter1();

        System.out.println("count is " + cs6.getCount());
        System.out.println(cs6.getStCount());
    }

}
