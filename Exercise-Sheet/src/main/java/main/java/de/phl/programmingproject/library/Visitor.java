package main.java.de.phl.programmingproject.library;

import java.util.HashSet;
import java.util.Set;

public class Visitor {

    private final int id;
    private final String name;
    private final Set<Book> lentBooks;
    
    public Visitor(final int id, final String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is null or empty.");
        }
        this.id = id;
        this.name = name;
        this.lentBooks = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getLentBooks() {
        return lentBooks;
    }
    
}
