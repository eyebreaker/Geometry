package Model;

/**
 * Created by Bhushan on 28-Jul-15.
 */
public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return width*height;
    }

    @Override
    public double perimeter(){
        return (width + height)*2;
    }

}
