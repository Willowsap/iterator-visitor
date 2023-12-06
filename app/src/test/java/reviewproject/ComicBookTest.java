package reviewproject;

import org.junit.jupiter.api.Test;
import org.mockito.Answers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;

public class ComicBookTest {
    private static final String TEST_TITLE = "title";
    private static final String TEST_AUTHOR = "Jane";
    private static final boolean TEST_COLOR = true;
    private ComicBook book;
    
    @BeforeEach
    public void beforeEach() {
        book = spy(new ComicBook(TEST_TITLE, TEST_AUTHOR, TEST_COLOR));
    }

    @Test
    public void testGetTitle() {
        assertEquals(TEST_TITLE, book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals(TEST_AUTHOR, book.getAuthor());
    }

    @Test
    public void testGetColor() {
        assertEquals(TEST_COLOR, book.isInColor());
    }

    @Test
    public void testAccept() {
        Visitor v = mock(Visitor.class, Answers.CALLS_REAL_METHODS);
        book.accept(v);
        verify(v, times(1)).visit(book);
    }
}
