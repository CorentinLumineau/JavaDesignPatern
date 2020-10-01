package fr.uga.miage.graphic.main;

public class Ligne extends Item {
    private Point startPoint;
    private Point endPoint;

    public Ligne(Point p1, Point p2, Rectangle container) {
        super(container.getP1(), container.getP2(), container.getP3(), container.getP4());
        this.startPoint = p1;
        this.endPoint = p2;
    }

    public void moveTo(int translationX, int translationY) {
        super.moveTo(translationX, translationY);
        this.startPoint.moveTo(translationX, translationY);
        this.endPoint.moveTo(translationX, translationY);
    }

    public String toString() {
        return "\nLigne =" +
                "\n\t Position : " + startPoint + endPoint;
    }

    public void setP1(Point p1) {
        this.startPoint = p1;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}
