package Model;

/**
 * Created by Bhushan on 28-Jul-15.
 */
public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return width*height;
    }


}
