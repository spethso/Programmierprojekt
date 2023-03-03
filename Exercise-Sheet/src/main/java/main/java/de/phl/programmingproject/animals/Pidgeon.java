package main.java.de.phl.programmingproject.animals;

public class Pidgeon extends Bird {
    
    public Pidgeon(String name, int wingspan) {
        super(name, wingspan);
    }
    
    @Override
    public void speak() {
        System.out.format("I am %s and I am a bird, and my wingspan is %d and I am a pidgeon.%n", getName(), getWingspan());
    }

    public void fly() {
        System.out.println("I am flying!");
    }
}
