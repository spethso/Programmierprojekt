package main.java.de.phl.programmingproject.restaurant;

public class Order {

    private final MenuItem menuItem;

    private final int amount;

    /**
     * Creates a new order, ordering the given menu item the specified amount.
     *
     * @param menuItem the menu item which is ordered
     * @param amount how often to order the menu item
     * @throws  IllegalArgumentException if the menu item is null or amount less than 1
     */
    public Order(final MenuItem menuItem, final int amount) {
        if (menuItem == null) {
            throw new IllegalArgumentException("Menu item must not be null");
        }
        if (amount < 1) {
            throw new IllegalArgumentException("Amount must be at least 1");
        }
        this.menuItem = menuItem;
        this.amount = amount;
    }

    public MenuItem getMenuItem() {
        return this.menuItem;
    }

    public int getAmount() {
        return this.amount;
    }

}
