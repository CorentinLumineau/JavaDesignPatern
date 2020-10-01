package fr.uga.miage.graphic.test;

import fr.uga.miage.graphic.main.Graphique;
import fr.uga.miage.graphic.main.Point;
import fr.uga.miage.graphic.main.Rectangle;
import fr.uga.miage.graphic.main.Texte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphiqueTest {
    @Test
    public void testAddItemInGraphic() {
        Rectangle graphiqueRec = new Rectangle(new Point(10, 10), new Point(10, 20), new Point(20, 20), new Point(20, 10));
        Graphique g = new Graphique(graphiqueRec);

        Assertions.assertEquals(g.getItems().size(), 0);

        String textContent = "Hello";
        Rectangle container = new Rectangle(new Point(10, 10), new Point(10, 20), new Point(20, 20), new Point(20, 10));
        Texte text = new Texte(textContent, container);
        g.addItem(text);

        Assertions.assertEquals(g.getItems().size(), 1);
    }

    @Test
    public void testMoveGraphic() {
        Rectangle graphiqueRec = new Rectangle(new Point(10, 10), new Point(10, 20), new Point(20, 20), new Point(20, 10));
        Graphique g = new Graphique(graphiqueRec);

        Assertions.assertEquals(g.getItems().size(), 0);

        String textContent = "Hello";
        Rectangle container = new Rectangle(new Point(10, 10), new Point(10, 20), new Point(20, 20), new Point(20, 10));
        Texte text = new Texte(textContent, container);
        g.addItem(text);

        g.moveTo(1, 4);

        assertEquals(g.getItems().get(0).getP1().getX(), 11);
        assertEquals(g.getItems().get(0).getP1().getY(), 14);
        assertEquals(g.getItems().get(0).getP2().getX(), 11);
        assertEquals(g.getItems().get(0).getP2().getY(), 24);
        assertEquals(g.getItems().get(0).getP3().getX(), 21);
        assertEquals(g.getItems().get(0).getP3().getY(), 24);
        assertEquals(g.getItems().get(0).getP4().getX(), 21);
        assertEquals(g.getItems().get(0).getP4().getY(), 14);
    }
}