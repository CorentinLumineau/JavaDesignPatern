package fr.uga.miage.graphic.test;

import fr.uga.miage.graphic.main.Image;
import fr.uga.miage.graphic.main.Point;
import fr.uga.miage.graphic.main.Rectangle;
import fr.uga.miage.graphic.main.Texte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ImageTest {
    @Test
    public void testGetURI() {
        String uri = "testURI";
        Rectangle container = new Rectangle(new Point(10,10), new Point(10,20), new Point(20,20), new Point(20,10));
        Image img = new Image(uri, container);
        Assertions.assertEquals(uri, img.getUri());
    }

    @Test
    public void testAddNewItem() {
        String uri = "testURI";
        Rectangle container = new Rectangle(new Point(10,10), new Point(10,20), new Point(20,20), new Point(20,10));
        Image img = new Image(uri, container);

        String text = "Hello";
        Rectangle containerText = new Rectangle(new Point(11,11), new Point(11,14), new Point(14,14), new Point(14,11));
        Texte texte = new Texte(text,containerText);
        img.addItem(texte);
    }
}
