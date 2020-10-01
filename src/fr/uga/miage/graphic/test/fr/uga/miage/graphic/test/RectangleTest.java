package fr.uga.miage.graphic.test;

import fr.uga.miage.graphic.main.Point;
import fr.uga.miage.graphic.main.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void testMoveTo() {
        Rectangle rectangle = new Rectangle(new Point(10,10), new Point(10,20), new Point(20,20), new Point(20,10));
        rectangle.moveTo(1, 4);

        assertEquals(rectangle.getP1().getX(), 11);
        assertEquals(rectangle.getP1().getY(), 14);
        assertEquals(rectangle.getP2().getX(), 11);
        assertEquals(rectangle.getP2().getY(), 24);
        assertEquals(rectangle.getP3().getX(), 21);
        assertEquals(rectangle.getP3().getY(), 24);
        assertEquals(rectangle.getP4().getX(), 21);
        assertEquals(rectangle.getP4().getY(), 14);
    }

}