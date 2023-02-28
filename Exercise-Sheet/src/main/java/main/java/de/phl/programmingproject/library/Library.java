package main.java.de.phl.programmingproject.library;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private final Set<Book> books;
    private final Set<Visitor> visitors;
    private int highestVisitorID;

    public Library(final Set<Book> books) {
        if (books.contains(null)) {
            throw new IllegalArgumentException("Books must not be null");
        }
        this.books = books;
        this.visitors = new HashSet<>();
        highestVisitorID = 0;
    }

    public Set<Book> searchAvailableBooks(final String searchTerm) {
        return null;
    }

    public void lendBook(final String title, final int visitorId) {

    }

    public void returnBook(final String title, final int visitorId) {
        // TODO: Implement this operation
    }


    public Visitor getVisitor(final int visitorId) {
        final boolean containsVisitor;
        return null;
    }

    public int registerVisitor(final String name) {
        final Visitor visitor = new Visitor(highestVisitorID++, name);
        visitors.add(visitor);
        return visitor.getId();
    }
    
}
