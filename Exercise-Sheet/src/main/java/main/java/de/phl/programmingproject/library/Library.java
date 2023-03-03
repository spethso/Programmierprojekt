package main.java.de.phl.programmingproject.library;

import java.util.LinkedList;
import java.util.List;

public class Library {
    private final List<LibraryItem> items;

    public Library() {
        this.items = new LinkedList<>();
    }

    public void addBook(final Book book) {
        this.addItem(book);
    }


    public void addItem(final LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item must not be null.");
        }
        items.add(item);
    }


    public void borrowItem(final int itemNumber, final String borrower) {
        if (itemNumber < 0 || borrower == null || borrower.isEmpty()) {
            throw new IllegalArgumentException("Item number must not be negative and borrower must not be null or empty.");
        }
        for (final LibraryItem libraryItem : items) {
            if (libraryItem.getItemNumber() == itemNumber) {
                libraryItem.setBorrower(borrower);
                return;
            }
        }
    }

    public void returnItem(final int itemNumber) {
        if (itemNumber < 0) {
            throw new IllegalArgumentException("Item number must not be negative.");
        }
        for (final LibraryItem libraryItem : items) {
            if (libraryItem.getItemNumber() == itemNumber) {
                libraryItem.setBorrower("");
                return;
            }
        }
    }

    public List<Book> searchBooks(final String searchString) {
        if (searchString == null || searchString.isEmpty()) {
            throw new IllegalArgumentException("Search string must not be null or empty.");
        }
        final List<Book> books = new LinkedList<>();
        for (LibraryItem item : this.items) {
            final Book book = item instanceof Book ? (Book) item : null;
            if (book != null && (book.getTitle().contains(searchString) || book.getAuthor().contains(searchString) || book.getIsbn().contains(searchString))) {
                books.add(book);
            }
        }

        return books;
    }
}
