package Model;

/**
 * Created by Bhushan on 28-Jul-15.
 */
public class TestClass {

    public static void main(String[] args){

        Shape shape = new Circle(5);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        shape = new Rectangle(3,4);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        shape = new Square(5);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());


    }
}
