package slack_alan_cevre_sorusu;

public class Ucgen extends Sekil{

    public double ucgenCevre (double a , double b , double c){
        return a+b+c;
    }


    public double ucgenAlan(double a, double b , double c ){
        double y = (a+b+c)/2;
        return Math.sqrt(y*(y-a)*(y-b)*(y-b));
    }





}
