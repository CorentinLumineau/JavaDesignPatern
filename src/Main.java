public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Point(10, 10), new Point(20, 10), new Point(20, 5), new Point(10, 5));
        Graphique g = new Graphique(r);

        Rectangle r2 = new Rectangle(new Point(12, 8), new Point(18, 8), new Point(18, 7), new Point(12, 7));
        g.addRectangle(r2);
        r2.addTexte(new Texte("Salut a tous", new Point(14, 6), new Point(16, 6), new Point(16, 9), new Point(14, 9)));
        Ligne l1 = new Ligne(new Point(2, 4), new Point(5,7));
        g.addLigne(l1);
        System.out.println(g.toString());
        g.moveTo(2,3);
        System.out.println(g.toString());
    }
}
