package reviewproject;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf shelf;
    int currIndex;

    public BookShelfIterator(BookShelf shelf) {
        this.shelf = shelf;
        this.currIndex = 0;
    }

    public boolean hasNext() {
        return currIndex < shelf.numBooks();
    }

    public Book next() {
        return shelf.getBookByPosition(currIndex++);
    }
}
