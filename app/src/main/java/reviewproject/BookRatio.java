package reviewproject;

public class BookRatio extends Visitor {
    private int textBookCount;
    private int comicBookCount;

    public void visit(TextBook book) {
        this.textBookCount++;
    }

    public void visit(ComicBook book) {
        this.comicBookCount++;
    }

    public String report() {
        double total = textBookCount + comicBookCount;
        return String.format("The shelf contains %.2f%% comic books and %.2f%% textbooks", 
            textBookCount / total * 100, comicBookCount / total * 100);
    }
}
