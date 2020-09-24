import java.util.ArrayList;

public class Image extends Item{
    private String uri;
    private ArrayList<Item> items;

    public Image(String uri, Rectangle container) {
        super(container.getP1(), container.getP2(), container.getP3(), container.getP4());
        this.items = new ArrayList<>();
        this.uri = uri;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public void moveTo(int translationX, int translationY) {
        super.moveTo(translationX, translationY);
        for(Item i: items){
            i.moveTo(translationX, translationY);
        }
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
                "\n -Contenu ='" + items +
                '}';
    }
}

