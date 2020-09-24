public class Texte extends Item {
    private String texte;

    public Texte(String texte, Rectangle container) {
        super(container.getP1(), container.getP2(), container.getP3(), container.getP4());
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    @Override
    public String toString() {
        return "Texte {" +
                "Container {" +
                "\n -" + super.getP1() +
                "\n -" + super.getP2() +
                "\n -" + super.getP3() +
                "\n -" + super.getP4() +
                "\n -Texte ='" + texte +
                '}';
    }
}

