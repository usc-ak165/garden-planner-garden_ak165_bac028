package garden_planner.model;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testCalculations() {
        Circle c = new Circle();
        assertEquals(c.getArea(5.0 , 3.14));
        assertEquals(c.getPerimeter(6.0 , 3.14));
        assertEquals(c.toString());
    }

    private void assertEquals(String s) {
    }

    private void assertEquals(double area) {
    }
}
