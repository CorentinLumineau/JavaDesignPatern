import java.util.ArrayList;

public class Rectangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Ligne> lignes;
    private ArrayList<Texte> textes;
    private ArrayList<Image> images;


    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.rectangles = new ArrayList<Rectangle>();
        this.lignes = new ArrayList<Ligne>();
        this.textes = new ArrayList<Texte>();
        this.images = new ArrayList<Image>();
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public void moveTo(int translationX, int translationY) {
        p1.moveTo(translationX, translationY);
        p2.moveTo(translationX, translationY);
        p3.moveTo(translationX, translationY);
        p4.moveTo(translationX, translationY);
        rectangles.forEach(r -> r.moveTo(translationX, translationY));
        lignes.forEach(l -> l.moveTo(translationX, translationY));
        textes.forEach(t -> t.moveTo(translationX, translationY));
        images.forEach(i -> i.moveTo(translationX, translationY));
    }

    public void addLignes(Ligne l) {
        lignes.add(l);
    }

    public void addTexte(Texte t) {
        textes.add(t);
    }

    public void addImage(Image i) {
        images.add(i);
    }

    @Override
    public String toString() {
        return "\nRectangle{" +
                "\n -" + p1 +
                "\n -" + p2 +
                "\n -" + p3 +
                "\n -" + p4 +
                "\n - Contenu : " +
                "\n - Rectangles=" + rectangles +
                "\n - Lignes=" + lignes +
                "\n - Texte=" + textes +
                "\n - Image=" + images +
                "\n}";
    }
}
