package main.java.de.phl.programmingproject.restaurant;

public class Table {

    private final int tableNumber;
    private final int seats;
    private boolean occupied;

    /**
     * Creates a new table with the given table number and number of seats.
     * 
     * @param tableNumber the table number
     * @param seats the number of seats
     * @throws IllegalArgumentException if the table number or number of seats is less than 0
     */
    public Table(final int tableNumber, final int seats) {
        if (tableNumber < 0) {
            throw new IllegalArgumentException("Table number must be greater than 0");
        }
        if (seats < 0) {
            throw new IllegalArgumentException("Seats must be greater than 0");
        }
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.occupied = false;
    }

    public int getTableNumber() {
        return this.tableNumber;
    }

    public int getSeats() {
        return this.seats;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void setOccupied(final boolean occupied) {
        this.occupied = occupied;
    }

}
