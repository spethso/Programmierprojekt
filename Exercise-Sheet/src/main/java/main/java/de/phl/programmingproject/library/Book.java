package main.java.de.phl.programmingproject.library;

public class Book {

    private final String title;
    private final String author;

    /**
     * Creates a new book.
     * @param title The title of the book.
     * @param author The author of the book.
     * @throws IllegalArgumentException if the title or author is null or empty.
     */
    public Book(String title, String author) {
        if (title == null || title.isEmpty() || author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Title or author is null or empty.");
        }
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
