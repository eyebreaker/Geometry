package Test;

import Model.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bhushan on 28-Jul-15.
 */

public class RectangleTest {

    @Test
    public void testGetArea() throws Exception{
        int breadth = 5;
        int height = 4;
        Rectangle rect = new Rectangle(breadth,height);
        assertEquals(20,rect.getArea());
    }

}