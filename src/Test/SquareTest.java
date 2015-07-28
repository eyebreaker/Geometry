package Test;

import Model.Square;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bhushan on 28-Jul-15.
 */
public class SquareTest {

    @Test
    public void testArea() throws Exception{
        double side = 5;
        Square square = new Square(side);
        assertTrue(25 == square.area());
    }

    @Test
    public void testPerimeter() throws Exception{
        double side =5 ;
        Square square = new Square(side);
        assertTrue(20 == square.perimeter());
    }

}