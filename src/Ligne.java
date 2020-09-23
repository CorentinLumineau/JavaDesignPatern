public class Ligne extends Item {
    private Point p1;
    private Point p2;

    public Ligne(Point p1, Point p2, Rectangle container) {
        super.setContainer(container);
        this.p1 = p1;
        this.p2 = p2;
    }

    public void moveTo(int translationX, int translationY) {
        super.getContainer().moveTo(translationX, translationY);

        this.p1.setX(this.p1.getX() + translationX);
        this.p1.setY(this.p1.getY() + translationY);

        this.p2.setX(this.p2.getX() + translationX);
        this.p2.setY(this.p2.getY() + translationY);
    }

    public String toString() {
        return "Ligne{" +
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
