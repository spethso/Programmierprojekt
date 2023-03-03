package main.java.de.phl.programmingproject.library;

import java.util.List;
import java.util.Optional;

public class LibraryItem implements Comparable<LibraryItem> {
    private final int itemNumber;
    private Optional<String> borrower = Optional.empty();

    public LibraryItem(int itemNumber) {
        if (itemNumber < 0) {
            throw new IllegalArgumentException("Item number must not be negative.");
        }
        this.itemNumber = itemNumber;
    }

    public LibraryItem(int itemNumber, String borrower) {
        this(itemNumber);
        if (borrower == null || borrower.isEmpty()) {
            throw new IllegalArgumentException("Item number must not be negative and borrower must not be null or empty.");
        }
        this.borrower = Optional.of(borrower);
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getBorrower() {
        if (borrower.isEmpty()) {
            throw new IllegalStateException("Item is not borrowed.");
        }
        return borrower.get();
    }

    public void setBorrower(String borrower) {
        if (borrower == null || borrower.isEmpty()) {
            throw new IllegalArgumentException("Borrower must not be null or empty.");
        }
        this.borrower = Optional.of(borrower);
    }

    @Override
    public int compareTo(LibraryItem otherItem) {
        return Integer.compare(itemNumber, otherItem.itemNumber);
    }
}
