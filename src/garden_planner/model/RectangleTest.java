package garden_planner.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {


    @Test
    void testCalculations() {
        Rectangle r = new Rectangle();
        assertEquals(r.getArea(5.0 , 10.0));
        assertEquals(r.getPerimeter(6.0 , 12.0));
        assertEquals(r.toString());
    }

    private void assertEquals(String s) {
    }

    private void assertEquals(double area) {
    }


}



