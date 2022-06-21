package pk.edu.pk.erasmus.java;

public class Circle extends Figure {
    @Override
    public double getArea() {
        double r = 10000000.0;
        return Mathematic.getPi() * r * r;
    }
}
