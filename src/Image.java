public class Image extends Item{
    private String uri;

    public Image(String uri, Rectangle container) {
        super(container.getP1(), container.getP2(), container.getP3(), container.getP4());
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Image {" +
                "Container {" +
                "\n -" + super.getP1() +
                "\n -" + super.getP2() +
                "\n -" + super.getP3() +
                "\n -" + super.getP4() +
                "\n -Image ='" + uri +
                '}';
    }
}

