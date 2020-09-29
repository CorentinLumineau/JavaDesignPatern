package fr.uga.miage.graphic.main;

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
        return "\nTexte : " +
                "\n\t- Position = " + super.getP1() + " " + super.getP2() + " " + super.getP3() + " " + super.getP4() +
                "\n\t- Texte = "+ '"' + texte + '"';
    }
}

