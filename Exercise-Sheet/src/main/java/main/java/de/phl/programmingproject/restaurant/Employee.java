package main.java.de.phl.programmingproject.restaurant;

import java.util.ArrayDeque;
import java.util.Queue;

public class Employee {
    private final Queue<Order> orders;

    public Employee() {
        this.orders = new ArrayDeque<>();
    }
    
    /**
     * Assigns an order to the employee.
     * @param order The order to be assigned.
     * @throws IllegalArgumentException if the order is null.
     */
    public void assignOrder(final Order order) {
        // TODO: Implement this operation
    }

    public int currentOrderCount() {
        return orders.size();
    }

    public Queue<Order> getOrders() {
        return orders;
    }

    public void processOrders() {
        // TODO: Implement this operation
    } 
}
