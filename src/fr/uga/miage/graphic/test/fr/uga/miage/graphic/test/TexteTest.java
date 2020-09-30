package fr.uga.miage.graphic.test;

import fr.uga.miage.graphic.main.Point;
import fr.uga.miage.graphic.main.Rectangle;
import fr.uga.miage.graphic.main.Texte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TexteTest {
    @Test
    public void testGetText() {
        String textContent = "Hello";
        Rectangle container = new Rectangle(new Point(10,10), new Point(10,20), new Point(20,20), new Point(20,10));
        Texte text = new Texte(textContent, container);
        Assertions.assertEquals(textContent, text.getTexte());
    }

    @Test
    public void testMoveText() {
        String textContent = "Hello";
        Rectangle container = new Rectangle(new Point(10,10), new Point(10,20), new Point(20,20), new Point(20,10));
        Texte text = new Texte(textContent, container);

        Assertions.assertEquals(10, text.getP1().getX());
        Assertions.assertEquals(10, text.getP1().getY());

        text.moveTo(2,1);

        Assertions.assertEquals(12, text.getP1().getX());
        Assertions.assertEquals(11, text.getP1().getY());
    }
}