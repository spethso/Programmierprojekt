package main.java.de.phl.programmingproject.restaurant;

import java.util.ArrayDeque;
import java.util.Queue;

public class Employee {
    private final Queue<Order> orders;

    public Employee() {
        this.orders = new ArrayDeque<>();
    }
    
    public Queue<Order> getOrders() {
        return orders;
    }

    public void processOrders() {
        // TODO: Implement this operation
    } 
}
