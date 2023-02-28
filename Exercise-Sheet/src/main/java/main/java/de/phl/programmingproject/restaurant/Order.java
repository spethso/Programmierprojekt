package main.java.de.phl.programmingproject.restaurant;

public class Order {

    private final String name;

    public Order(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Prints the order name to mark it as processed.
     */
    public void handle() {
        System.out.format("Order %s is being handled.", name);
    }
}
