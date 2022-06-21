package pk.edu.pk.erasmus.java;

public sealed class Shape permits Rectangle, Square {
    double getCenter(Shape s){
        return switch (s){
            case Rectangle r -> r.getRectanglePosition();
            case Square square -> square.getSquarePosition();
            default -> 0;
        };
    }
}
