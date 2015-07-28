package Test;

import Model.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bhushan on 28-Jul-15.
 */

public class RectangleTest {

    @Test
    public void testArea() throws Exception{
        double breadth = 5;
        double height = 4;
        Rectangle rect = new Rectangle(breadth,height);
        assertTrue(20 == rect.area());
    }

    @Test
    public void testPerimeter() throws Exception{
        double breadth = 5;
        double height = 4;
        Rectangle rect = new Rectangle(breadth,height);
        assertTrue(18 == rect.perimeter());
    }

}