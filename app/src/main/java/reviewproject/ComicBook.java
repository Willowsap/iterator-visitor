package reviewproject;

public class ComicBook extends Book {
    private boolean inColor;

    public ComicBook(String title, String author, boolean inColor) {
        super(title, author);
        this.inColor = inColor;
    }

    public boolean isInColor() {
        return inColor;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
