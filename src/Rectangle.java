public class Rectangle extends Item {

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public String toString() {
        return "Rectangle :" +
                "\n\t- Position = " + super.getP1() + " " + super.getP2() + " " + super.getP3() + " " + super.getP4();
    }
}
