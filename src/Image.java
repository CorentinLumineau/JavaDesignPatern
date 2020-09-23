public class Image extends Item{
    private String uri;

    public Image(String uri, Point p1, Point p2, Point p3, Point p4) {
        super();
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Image{" +
                "\n -Rectangle{" +
                "\n -" + getP1() +
                "\n -" + getP2() +
                "\n -" + getP3() +
                "\n -" + getP4() +
                "\n -Image ='" + uri +
                '}';
    }
}

