package fr.uga.miage.graphic.main;

import java.util.ArrayList;

public class Image extends Item {
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

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "\nImage :" +
                "\n\t- Position = " + super.getP1() + " " + super.getP2() + " " + super.getP3() + " " + super.getP4() +
                "\n\t- Image = " + uri +
                "\n\t- Contenu = " + items;
    }
}

