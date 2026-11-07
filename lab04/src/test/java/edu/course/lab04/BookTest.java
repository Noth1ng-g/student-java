package edu.course.lab04;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
class BookTest {
    @Test
    void shouldRetrieveValueByEqualKey() {
        Map<Book, String> library = new HashMap<>();
        Book book1 = new Book("123", "Война и мир");
        Book book2 = new Book("123", "Совсем другое название");
        library.put(book1, "Полка А");
        assertEquals("Полка А", library.get(book2));
    }
    @Test
    void booksWithDifferentIsbnAreNotEqual() {
        Book book1 = new Book("123", "Книга");
        Book book2 = new Book("456", "Книга");
        assertNotEquals(book1, book2);
    }
}