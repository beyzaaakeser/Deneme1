package java_turkce_encapsulation_soru_cozumleri;

public class Soru3 {

    private int ssn = 1234;
    private String disease = "Headahce";
    private double salary = 100000;

    public String getDisease() {
        return disease;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public double getSalary() {
        return salary;

    }

    public static void main(String[] args) {

        Soru3 obj = new Soru3();
        System.out.println(obj.getDisease());




    }// main



}// class