package reviewproject;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getBookByPosition(int position) {
        return books.get(position);
    }

    public Book[] getAllBooks(Book book) {
        return (Book[]) books.toArray(new Book[]{});
    }

    public int numBooks() {
        return books.size();
    }

    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
