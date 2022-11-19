package java_turkce_encapsulation_soru_cozumleri;

public class Soru6 {

    private String gender = "Male";
    private int age = 23;
    private boolean disabled = false;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isDisabled() {
        return disabled;
    }
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {

        Soru6 obj1 = new Soru6();
        obj1.setAge(0);
        System.out.println(obj1.getAge());
    }
    }

