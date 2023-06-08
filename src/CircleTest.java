import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    @Test
    void testCircleConst() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Circle circle = new Circle(p1, p2);
        assertEquals(2.0, circle.getCenterX(), 0.001);
        assertEquals(3.0, circle.getCenterY(), 0.001);
        assertEquals(2.4494, circle.getRadius(), 0.001);
    }
    @Test
    void testCircleConst1() {
        Point p1 = new Point(-1, 2);
        Point p2 = new Point(3, -4);
        Circle circle = new Circle(p1, p2);
        assertEquals(1.0, circle.getCenterX(), 0.001);
        assertEquals(-1.0, circle.getCenterY(), 0.001);
        assertEquals(5.8309, circle.getRadius(), 0.001);
    }
    @Test
    void testCircleConst2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Circle circle = new Circle(p1, p2);
        assertEquals(0.0, circle.getCenterX(), 0.001);
        assertEquals(0.0, circle.getCenterY(), 0.001);
        assertEquals(0.0, circle.getRadius(), 0.001);
    }
}