package main.java.de.phl.programmingproject.animals;

public class Dog extends Mammal {
    
    public Dog(String name, String breed) {
        super(name, breed);
    }
    
    @Override
    public void speak() {
        System.out.format("I am %s and I am a %s and I bark.%n", getName(), getBreed());
    }

    public void bark() {
        System.out.println("Bark!");
    }
}
