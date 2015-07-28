package Model;

/**
 * Created by Bhushan on 28-Jul-15.
 */
public class Square extends Shape {

    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4*(side);
    }
}
