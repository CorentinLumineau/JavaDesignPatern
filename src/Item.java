public abstract class Item {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;


    public Item(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public abstract String toString();
    public void moveTo(int translationX, int translationY) {
        p1.moveTo(translationX, translationY);
        p2.moveTo(translationX, translationY);
        p3.moveTo(translationX, translationY);
        p4.moveTo(translationX, translationY);
    };

}
