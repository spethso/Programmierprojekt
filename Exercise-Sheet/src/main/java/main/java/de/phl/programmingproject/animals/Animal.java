package main.java.de.phl.programmingproject.animals;

public class Animal {
    private final String name;

    public Animal(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty.");
        }
        this.name = name;
    }

    public void speak() {
        System.out.format("I am %s and I am an animal.%n", name);
    }

    public String getName() {
        return name;
    }
}
