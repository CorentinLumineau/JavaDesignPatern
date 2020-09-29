package fr.uga.miage.graphic.main;

public class Ligne extends Item {
    private Point p1;
    private Point p2;

    public Ligne(Point p1, Point p2, Rectangle container) {
        super(container.getP1(), container.getP2(), container.getP3(), container.getP4());
        this.p1 = p1;
        this.p2 = p2;
    }

    public void moveTo(int translationX, int translationY) {
        super.moveTo(translationX, translationY);
        this.p1.moveTo(translationX, translationY);
        this.p2.moveTo(translationX, translationY);
    }

    public String toString() {
        return "fr.uga.miage.graphic.main.Ligne{" +
                "\n -" +  p1 +
                "\n -" + p2 +
                "\n}";
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
