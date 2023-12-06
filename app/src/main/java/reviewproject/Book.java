package reviewproject;

public abstract class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s ny %s", title, author);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book) {
            return ((Book) o).getTitle().equals(title)
                && ((Book) o).getAuthor().equals(author);
        }
        return false;
    }

    public abstract void accept(Visitor v);
}
