package fr.uga.miage.graphic.test;

import fr.uga.miage.graphic.main.Ligne;
import fr.uga.miage.graphic.main.Point;
import fr.uga.miage.graphic.main.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LigneTest {
    @Test
    public void testMoveTo() {
        Rectangle container = new Rectangle(new Point(10,10), new Point(10,20), new Point(20,20), new Point(20,10));
        Ligne ligne = new Ligne(new Point(10,12), new Point(20,18), container);

        Assertions.assertEquals(ligne.getStartPoint().getX(), 10);
        Assertions.assertEquals(ligne.getStartPoint().getY(), 12);
        Assertions.assertEquals(ligne.getEndPoint().getX(), 20);
        Assertions.assertEquals(ligne.getEndPoint().getY(), 18);

        ligne.moveTo(1, 4);

        Assertions.assertEquals(ligne.getStartPoint().getX(), 11);
        Assertions.assertEquals(ligne.getStartPoint().getY(), 16);
        Assertions.assertEquals(ligne.getEndPoint().getX(), 21);
        Assertions.assertEquals(ligne.getEndPoint().getY(), 22);

        //Test container
        Assertions.assertEquals(ligne.getP1().getX(), 11);
        Assertions.assertEquals(ligne.getP1().getY(), 14);
        Assertions.assertEquals(ligne.getP2().getX(), 11);
        Assertions.assertEquals(ligne.getP2().getY(), 24);
        Assertions.assertEquals(ligne.getP3().getX(), 21);
        Assertions.assertEquals(ligne.getP3().getY(), 24);
        Assertions.assertEquals(ligne.getP4().getX(), 21);
        Assertions.assertEquals(ligne.getP4().getY(), 14);
    }
}