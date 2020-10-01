package fr.uga.miage.graphic.main;

import java.util.ArrayList;

public class Graphique {
    private Rectangle graphique;
    private ArrayList<Item> items;

    public Graphique(Rectangle graphique) {
        this.graphique = graphique;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void moveTo(int translationX, int translationY) {
        //We don't move global graphic but all items inside
        for(Item i : items) {
            i.moveTo(translationX, translationY);
        }
    }

    public Rectangle getGraphique() {
        return graphique;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "fr.uga.miage.graphic.main.Graphique {" +
                "\n"+ graphique +
                "\n\t- Items = " + items;
    }
}
