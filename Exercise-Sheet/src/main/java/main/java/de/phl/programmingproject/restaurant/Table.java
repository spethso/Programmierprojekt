package main.java.de.phl.programmingproject.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final int tableNumber;
    private final int seats;
    private boolean occupied;
    private final List<Order> orders = new ArrayList<>();

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

    /**
     * Orders a menu item amount times.
     *
     * @param menuItem the menu item to order
     * @param amount the amount how often the menu item was ordered
     * @throws IllegalArgumentException if the menu item is null or the amount less than 1
     * @throws IllegalStateException if this table is not occupied
     */
    public void placeOrder(final MenuItem menuItem, final int amount) {
        if (!this.isOccupied()) {
            throw new IllegalStateException("An unoccupied table cannot order food");
        }
        this.orders.add(new Order(menuItem, amount));
    }

    public List<Order> getOrders() {
        return this.orders;
    }
}
