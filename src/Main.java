public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Point(10, 10), new Point(20, 10), new Point(20, 5), new Point(10, 5));
        Graphique g = new Graphique(r);

        Rectangle r2 = new Rectangle(new Point(12, 8), new Point(18, 8), new Point(18, 7), new Point(12, 7));
        Texte t = new Texte("Hello world", r2);
        g.addItem(t);

        Rectangle imgContainer = new Rectangle(new Point(14, 6), new Point(16, 6), new Point(16, 9), new Point(14, 9));
        Image img = new Image("freuighq5g151e8rg1e", imgContainer);
        g.addItem(img);

        Rectangle ligneContainer = new Rectangle(new Point(14, 6), new Point(16, 6), new Point(16, 9), new Point(14, 9));
        Ligne l1 = new Ligne(new Point(15,6), new Point(15,8), ligneContainer);
        img.addItem(l1);
        System.out.println(g);
        System.out.println("------------------------------------");
        g.moveTo(2,3);
        System.out.println(g.toString());

    }
}
