package main.java.de.phl.programmingproject.restaurant;

import java.util.List;

public class Restaurant {
    private final List<Table> tables;
    private final List<MenuItem> menuItems;

    public Restaurant(final List<Table> tables, final List<MenuItem> menuItems) {
        if (tables == null || menuItems == null || tables.isEmpty() || menuItems.isEmpty()) {
            throw new IllegalArgumentException("Tables and menu items must not be null or empty");
        }
        this.tables = tables;
        this.menuItems = menuItems;
    }

    public List<Table> getTables() {
        return tables;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Table findTable(final int tableNumber) {
        for (final Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                return table;
            }
        }
        return null;
    }

    public MenuItem findMenuItem(final String itemName) {
        for (final MenuItem menuItem : menuItems) {
            if (menuItem.getItemName().equals(itemName)) {
                return menuItem;
            }
        }
        return null;
    }
}
