public class Texte extends Item {
    private String texte;

    public Texte(String texte, Rectangle container) {
        super();
        this.texte = texte;
    }

    @Override
    public String toString() {
        return "Texte{" +
                "Rectangle{" +
                "\n -" + super.getP1() +
                "\n -" + getP2() +
                "\n -" + getP3() +
                "\n -" + getP4() +
                "\n -Texte ='" + texte +
                '}';
    }
}

