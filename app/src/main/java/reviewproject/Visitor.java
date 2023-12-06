package reviewproject;

public abstract class Visitor {
    public void visit(TextBook book) {}
    public void visit(ComicBook book) {}
    public abstract String report();
}
