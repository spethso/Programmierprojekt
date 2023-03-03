package main.java.de.phl.programmingproject.library;

public class Book extends LibraryItem {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn, int itemNumber, String borrower) {
        super(itemNumber, borrower);
        if (title == null || title.isEmpty() || author == null || author.isEmpty() || isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("Title, author and ISBN must not be null or empty.");
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
