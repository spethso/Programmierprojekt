package main.java.de.phl.programmingproject.restaurant;

public class MenuItem {

    private final String itemName;
    private final String description;
    private final double price;

    public MenuItem(final String itemName, final String description, final double price) {
        if (itemName == null || description == null || price < 0) {
            throw new IllegalArgumentException(
                    "Item name, description and price must not be null or price must be greater than 0");
        }
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }
}
