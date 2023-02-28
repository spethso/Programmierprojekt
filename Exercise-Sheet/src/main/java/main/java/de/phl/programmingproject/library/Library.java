package main.java.de.phl.programmingproject.library;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private final Set<Book> books;
    private final Set<Visitor> visitors;
    private int highestVisitorID;

    /**
     * Creates a new library.
     * 
     * @param books The books in the library.
     * @throws IllegalArgumentException if the books set is null or at least one of the books is null.
     */
    public Library(final Set<Book> books) {
        if (books == null || books.contains(null)) {
            throw new IllegalArgumentException("Books must not be null");
        }
        this.books = books;
        this.visitors = new HashSet<>();
        highestVisitorID = 0;
    }

    /**
     * Searches for books based on a given search term and returns a set of matching
     * books. The search term can be either a part of a book title or an author's
     * name. The search term must not be null or empty.
     * 
     * @param searchTerm The search term.
     * @return A set of matching books.
     * @throws IllegalArgumentException if the search term is null or empty.
     */
    public Set<Book> searchAvailableBooks(final String searchTerm) {
        return null;
    }

    /**
     * Lends a book with the given title to the visitor with the given ID.
     * 
     * @param title     The title of the book.
     * @param visitorId The ID of the visitor.
     * @throws IllegalArgumentException if no book with the given title exists, no
     *                                  visitor with the given id exists, or if the
     *                                  visitor has already lent the book.
     */
    public void lendBook(final String title, final int visitorId) {
        final Visitor visitor = getVisitor(visitorId);
        if (visitor.getLentBooks().stream().anyMatch(book -> book.getTitle().equals(title))) {
            throw new IllegalArgumentException("Visitor has already lent the book");
        }
        for (final Book book : books) {
            if (book.getTitle().equals(title)) {
                visitor.getLentBooks().add(book);
                return;
            }
        }
        throw new IllegalArgumentException("No book with given title found");
    }

    /**
     * Returns a book.
     * 
     * @param title     The title of the book.
     * @param visitorId The ID of the visitor.
     * @throws IllegalArgumentException if no book with the given title exists or if
     *                                  the visitor
     *                                  has not lent the book.
     */
    public void returnBook(final String title, final int visitorId) {
        // TODO: Implement this operation
    }

    /**
     * Returns the visitor with the given ID.
     * 
     * @param visitorId The ID of the visitor.
     * @return The visitor with the given ID.
     * @throws IllegalArgumentException if no visitor with the given ID exists.
     */
    public Visitor getVisitor(final int visitorId) {
        for (final Visitor visitor : visitors) {
            if (visitor.getId() == visitorId) {
                return visitor;
            }
        }
        throw new IllegalArgumentException("No visitor with given ID found");
    }

    /**
     * Registers a new visitor.
     * 
     * @param name The name of the visitor.
     * @return The ID of the visitor.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public int registerVisitor(final String name) {
        final Visitor visitor = new Visitor(highestVisitorID++, name);
        visitors.add(visitor);
        return visitor.getId();
    }

}
