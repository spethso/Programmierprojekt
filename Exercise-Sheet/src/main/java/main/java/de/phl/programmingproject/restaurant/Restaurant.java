package main.java.de.phl.programmingproject.restaurant;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {
    private final Employee owner;
    private final Set<Employee> employees;

    public Restaurant(final Employee owner) {
        this.owner = owner;
        employees = new HashSet<>();
        employees.add(owner);
    }

    /**
     * Hires a new employee.
     * @param employee The employee to be hired.
     * @throws IllegalArgumentException if the employee is null or already employed.
     */
    public void hireEmployee(final Employee employee) {
        if (employee == null || employees.contains(employee)) {
            throw new IllegalArgumentException("Employee is null or already employed");
        }
        employees.add(employee);
    }

    /**
     * Places a new order for the least busy employee.
     * @param order The order to be placed.
     * @throws IllegalArgumentException if the order is null.
     */
    public void placeOrder(final Order order) {
        // TODO: Implement this operation
    }

    /**
     * Processes all orders of all employees.
     */
    public void process() {
        for (final Employee employee : employees) {
            employee.processOrders();
        }
    }

    public Employee getOwner() {
        return owner;
    }
}
