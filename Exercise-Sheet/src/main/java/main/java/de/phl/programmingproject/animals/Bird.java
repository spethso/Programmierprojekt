package main.java.de.phl.programmingproject.animals;

public class Bird extends Animal {
    private final int wingspan;

    public Bird(String name, int wingspan) {
        super(name);
        if (wingspan < 0) {
            throw new IllegalArgumentException("Wingspan must not be negative.");
        }
        this.wingspan = wingspan;
    }

    @Override
    public void speak() {
        System.out.format("I am %s and I am a bird, and my wingspan is %d.%n", getName(), wingspan);
    }

    public int getWingspan() {
        return wingspan;
    }
}
