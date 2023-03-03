package main.java.de.phl.programmingproject.animals;

public class Eagle extends Bird {
    
    public Eagle(String name, int wingspan) {
        super(name, wingspan);
    }
    
    @Override
    public void speak() {
        System.out.format("I am %s and I am a bird, and my wingspan is %d and I am an eagle.%n", getName(), getWingspan());
    }

    public void fly() {
        System.out.println("I am flying!");
    }
}
