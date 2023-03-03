package main.java.de.phl.programmingproject.products;

public class Product {
    private final String name;
    private final double price;
    private final String category;

    public Product(String name, double price, String category) {
        if (name == null || name.isEmpty() || category == null || category.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Invalid product data");
        }
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
