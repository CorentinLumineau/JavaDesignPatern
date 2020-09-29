package fr.uga.miage.graphic.main;

public class Rectangle extends Item {

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public String toString() {
        return "\nfr.uga.miage.graphic.main.Rectangle{" +
                "\n -" + super.getP1() +
                "\n -" + super.getP2() +
                "\n -" + super.getP3() +
                "\n -" + super.getP4() +
                "\n}";
    }
}
