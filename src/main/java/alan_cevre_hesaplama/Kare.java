package alan_cevre_hesaplama;

public class Kare extends Sekil{

    @Override
    public double alan(double r) {
        return r*r;
    }

    @Override
    public double cevre(double r) {
        return 4*r;

    }
}
