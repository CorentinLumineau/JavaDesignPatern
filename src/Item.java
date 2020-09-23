public abstract class Item {

    private Rectangle container;

    public void setContainer(Rectangle container) {
        this.container = container;
    }

    public Rectangle getContainer() {
        return this.container;
    }

    public abstract String toString();
    public abstract void moveTo(int translationX, int translationY);

}
